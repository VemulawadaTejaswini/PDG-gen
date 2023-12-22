import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			
			double cos = dot(x1 - x2, y1 - y2, x3 - x4, y3 - y4) / (distance(x1, y1, x2, y2) * distance(x3, y3, x4, y4));
			System.out.println((0.99999999 < Math.abs(cos) && Math.abs(cos) < 1.00000001) ? "YES" : "NO");
		}
	}
	private static double dot(double x1, double y1, double x2, double y2)
	{
		return x1 * x2 + y1 * y2;
	}
	private static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}