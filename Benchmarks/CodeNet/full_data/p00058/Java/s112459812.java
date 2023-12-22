import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext())
		{
			double xa = sc.nextDouble(),
					ya = sc.nextDouble(),
					xb = sc.nextDouble(),
					yb = sc.nextDouble(),
					xc = sc.nextDouble(),
					yc = sc.nextDouble(),
					xd = sc.nextDouble(),
					yd = sc.nextDouble();
			double dotValue = dot(xa - xb, ya - yb, xc - xd, yc - yd);
			if (-0.000000001 < dotValue && dotValue < 0.000000000001)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
	private static double dot(double x1, double y1, double x2, double y2)
	{
		return x1 * x2 + y1 * y2;
	}
}