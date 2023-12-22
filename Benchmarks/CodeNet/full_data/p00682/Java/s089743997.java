
import java.util.Scanner;
public class Main{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int I=1;
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			double x[]=new double[n+1];
			double y[]=new double[n+1];
			double S=0;
			int i;
			for(i=0;i<n;i++)
			{
				x[i]=in.nextDouble();
				y[i]=in.nextDouble();
			}
			x[i]=x[0];
			y[i]=y[0];
			for(int j=0;j<i;j++)
			{
				double seki=(x[j]-x[j+1])*(y[j]+y[j+1]);
				S+=seki;
			}
			System.out.printf(I+++" "+"%.1f\n",Math.abs(S/2));
		}
	}
}