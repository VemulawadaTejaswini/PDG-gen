
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			double a1=input.nextDouble(),b1=input.nextDouble(),c1=input.nextDouble()
					,a2=input.nextDouble(),b2=input.nextDouble(),c2=input.nextDouble();
			double a=(c1*b2-b1*c2)/(a1*b2-b1*a2);
			double b=(c2*a1-a2*c1)/(a1*b2-b1*a2);
			if(a==-0)
			{
				a=0;
			}
			else if(b==-0)
			{
				b=0;
			}
			System.out.format("%.3f %.3f\n",a,b);
		}
	}