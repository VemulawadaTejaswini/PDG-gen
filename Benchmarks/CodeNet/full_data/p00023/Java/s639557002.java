import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();
			
			double distance = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
			if (ra + rb < distance)
				System.out.println(0);
			else if (ra + rb >= distance && distance + Math.min(ra, rb) < Math.max(ra, rb))
				System.out.println(2);
			else
				System.out.println(1);
		}
	}
}