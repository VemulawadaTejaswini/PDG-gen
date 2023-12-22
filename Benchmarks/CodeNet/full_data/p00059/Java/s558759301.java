import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext())
		{
			double xa1 = sc.nextDouble(),
					ya1 = sc.nextDouble(),
					xa2 = sc.nextDouble(),
					ya2 = sc.nextDouble(),
					xb1 = sc.nextDouble(),
					yb1 = sc.nextDouble(),
					xb2 = sc.nextDouble(),
					yb2 = sc.nextDouble();
			double xaMin = Math.min(xa1, xa2),
					xaMax = Math.max(xa1, xa2),
					xbMin = Math.min(xb1, xb2),
					xbMax = Math.max(xb1, xb2),
					yaMin = Math.min(ya1, ya2),
					yaMax = Math.max(ya1, ya2),
					ybMin = Math.min(yb1, yb2),
					ybMax = Math.max(yb1, yb2);
			if (xaMax < xbMin || xbMax < xaMin || yaMax < ybMin || ybMax < yaMin)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}