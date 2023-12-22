import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			try
			{
				double x[] = new double[3];
				double y[] = new double[4];
				for (int i = 0; i < 3; i++)
				{
					x[i] = sc.nextDouble();
					y[i] = sc.nextDouble();
				}
				double xp = sc.nextDouble();
				double yp = sc.nextDouble();
				
				double a, b;
				a = dot(x[1] - x[0], y[1] - y[0], x[2] - x[0], x[2] - y[0])
					 / distance(x[1], y[1], x[0], x[0]) / distance(x[2], y[2], x[0], x[0]);
				b = dot(x[1] - x[0], y[1] - y[0], xp - x[0], yp - y[0])
					 / distance(x[1], y[1], x[0], x[0]) / distance(xp, yp, x[0], x[0]);
				boolean p1 = (a > b);
				a = dot(x[2] - x[1], y[2] - y[1], x[0] - x[1], x[0] - y[1])
					 / distance(x[2], y[2], x[1], x[1]) / distance(x[0], y[0], x[1], x[1]);
				b = dot(x[2] - x[1], y[2] - y[1], xp - x[1], yp - y[1])
					 / distance(x[2], y[2], x[1], x[1]) / distance(xp, yp, x[1], x[1]);
				boolean p2 = (a > b);
				a = dot(x[0] - x[2], y[0] - y[2], x[1] - x[2], x[1] - y[2])
					 / distance(x[0], y[0], x[2], x[2]) / distance(x[1], y[1], x[2], x[2]);
				b = dot(x[0] - x[2], y[0] - y[2], xp - x[2], yp - y[2])
					 / distance(x[0], y[0], x[2], x[2]) / distance(xp, yp, x[2], x[2]);
				boolean p3 = (a > b);
				if (p1 && p2 && p3)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
	private static double dot(double x1, double y1, double x2, double y2)
	{
		return x1 * x2 + y1 * y2;
	}
	private static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x1  - x2) * (x1  - x2) + (y1  - y2) * (y1  - y2));
	}
}