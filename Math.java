package math;
import java.util.Scanner;
public class Math {
	public static void main(String[] args) {
		number m=new number();
		m.num();
	}
}
class number{
	void num() {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=in.nextInt();
		int min,max,sum=0;
		if(n>a)
		{
			min=a;
			max=n;
		}
		else 
		{
			min=n;
			max=a;
		}
		for(int i=min;i<max;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("ÆæÊýÖ®ºÍ="+sum);
	}
}
