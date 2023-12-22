import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		double a,b,c,d,e,f,y,x;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();
			y = (c*d - f*a) / (b*d - e*a);
			x = (c*e - f*b) / (a*e - d*b);
			if(x==-0) x=0;
			if(y==-0) y=0;
			System.out.printf("%1.3f %1.3f\n",x,y);
		}
	}
}