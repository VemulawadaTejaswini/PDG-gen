import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in).useDelimiter(",|\\s+");
		
		int d,a,angle;
		double distx,disty;
		
		angle = 90;
		distx = disty = 0;
		
		while(true)
		{
			d = cin.nextInt();
			a = cin.nextInt();

			if(d==0 && a==0) break;
		
			distx += d*Math.cos(Math.toRadians(angle));
			disty += d*Math.sin(Math.toRadians(angle));
			angle = (angle-a+360)%360;
		}
				
		System.out.println((int)distx);
		System.out.println((int)disty);
	}
}