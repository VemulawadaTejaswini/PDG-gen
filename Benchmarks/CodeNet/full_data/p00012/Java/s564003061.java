import java.util.Scanner;
import java.lang.Math;


public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		double c1,c2,c3;
		double x1,x2,x3,x0;
		double y1,y2,y3,y0;

		while(cin.hasNext())
		{
			x1 = cin.nextDouble();
			y1 = cin.nextDouble();
			x2 = cin.nextDouble();
			y2 = cin.nextDouble();
			x3 = cin.nextDouble();
			y3 = cin.nextDouble();
			x0 = cin.nextDouble();
			y0 = cin.nextDouble();
			
			c1 = cross(x0,y0,x1,y1,x2,y2);
			c2 = cross(x0,y0,x2,y2,x3,y3);
			c3 = cross(x0,y0,x3,y3,x1,y1);
			
			if(c1*c2>0 && c2*c3>0 && c3*c1>0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}	
		}
	}
	
	static double cross( double x1, double y1,
			double x2, double y2, double x3, double y3)
	{
		x2-=x1; y2-=y1;
		x3-=x1; y3-=y1;

		return x2*y3-x3*y2;
	}
}