import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Point2D.Double a, b;
	static int n;
	
	static ArrayList<Point2D.Double> s, t;
	static int[] o, h;
	
	private static double cross(Point2D.Double a, Point2D.Double b)
	{
		return (a.x * b.y - a.y * b.x);
	}
	
	private static Point2D.Double add(Point2D.Double a, Point2D.Double b)
	{
		return new Point2D.Double(a.x + b.x, a.y + b.y);
	}
	
	private static Point2D.Double sub(Point2D.Double a, Point2D.Double b)
	{
		return new Point2D.Double(a.x - b.x, a.y - b.y);
	}
	
	private static Point2D.Double mul(Point2D.Double a, double t)
	{
		return new Point2D.Double(a.x * t, a.y * t);
	}
	
	private static Boolean isCrossing(Point2D.Double a1, Point2D.Double a2, Point2D.Double b1, Point2D.Double b2)
	{
		return (cross(sub(a2, a1), sub(b1, a1)) * cross(sub(a2, a1), sub(b2, a1)) < 1e-10) &&
			   (cross(sub(b2, b1), sub(a1, b1)) * cross(sub(b2, b1), sub(a2, b1)) < 1e-10);
	}
	
	private static Point2D.Double crosspoint(Point2D.Double a1, Point2D.Double a2, Point2D.Double b1, Point2D.Double b2)
	{
		Point2D.Double b = sub(b2, b1);
		double d1 = Math.abs( cross(b, sub(a1, b1)) );
		double d2 = Math.abs( cross(b, sub(a2, b1)) );
		double t = d1 / (d1 + d2);
		return add(a1, mul(sub(a2, a1), t));
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		int allnum = sca.nextInt();
		
		for(;allnum > 0;allnum--)
			{
			
			a = new Point2D.Double(sca.nextDouble(), sca.nextDouble());
			b = new Point2D.Double(sca.nextDouble(), sca.nextDouble());
			
			n = sca.nextInt();
			
			int i, j, k;
			ArrayList<Point2D.Double> crossp = new ArrayList<Point2D.Double>();
			double[] dis;
			
			s = new ArrayList<Point2D.Double>();
			t = new ArrayList<Point2D.Double>();
			o = new int[n];
			h = new int[n];
			crossp = new ArrayList<Point2D.Double>();
			dis = new double[n];
			
			for(i = 0;i < n;i++)
			{
				Point2D.Double ss = new Point2D.Double(sca.nextDouble(), sca.nextDouble());
				Point2D.Double tt = new Point2D.Double(sca.nextDouble(), sca.nextDouble());
				int oo = sca.nextInt();
				int hh = sca.nextInt();
				
				if(isCrossing(a, b, ss, tt))
				{
					s.add(ss);
					t.add(tt);
					o[i] = oo;
					h[i] = hh;
					
					Point2D.Double cp = crosspoint(a, b, ss, tt);
					crossp.add(cp);
					
					double dx = a.x - cp.x;
					double dy = a.y - cp.y;
					dis[i] = Math.sqrt(dx*dx + dy*dy);
				}
				else
				{
					i--;
					n--;
				}
			}
			
			for(i = n;i > 0;i--)
			{
				for(j = 0;j < (i - 1);j++)
				{
					if(dis[j] > dis[j + 1])
					{
						double tmp;
						tmp = dis[j];    dis[j] = dis[j+1];    dis[j+1] = tmp;
						
						int tmpi;
						tmpi = o[j];     o[j] = o[j+1];    o[j+1] = tmpi;
						tmpi = h[j];     h[j] = h[j+1];    h[j+1] = tmpi;
					}
				}
			}
			
			int point = -1;
			int num = 0;
			
			for(i = 0;i < n;i++)
			{
				if(o[i] == 1)
				{
					if(h[i] == point) continue;
					num++;
					point = h[i];
				}
				else
				{
					if(h[i] != point) continue;
					num++;
					
					if(h[i] == 0)
						point = 1;
					else
						point = 0;
				}
			}
			
			System.out.println(num - 1);
		}
	}
}