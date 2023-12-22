import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner in = new Scanner(System.in);
		
		try {
			while(in.hasNext()) {
				// ax + by = c
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				// dx + ey = f
				double d = in.nextDouble();
				double e = in.nextDouble();
				double f = in.nextDouble();
				
				// x = (c - by) / a とすると、
				// d(c/a - by/a) + ey = f になる。これをもとに、yを求める。
				double y = (f + (-1 * d * (c / a))) / ((-1 * (d / a) * b) + e);
				// 求めたyをもとに、xを求める。
				double x = (f + (-1 * e * y)) / d;
			
				if(x == 0.000) {
					x = 0.000;
				}
				if(y == 0.000) {
					y = 0.000;
				}
				
				System.out.printf(String.format("%.3f %.3f\n", x, y));
			}
		} catch(IllegalStateException ie) {
			// 入力失敗
			System.exit(0);
		}		

	}
}