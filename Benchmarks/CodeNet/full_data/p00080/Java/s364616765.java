import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			double q=in.nextDouble();
			double x=Math.abs(q/2);
			if(q==-1)
				return;
			while(Math.abs((x*x*x)-q)>=0.00001*q)
				x=x-((x*x*x-q)/(3*x*x));
			System.out.printf("%.6f\n",x);
		}
	}
}