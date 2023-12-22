import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			double n = sc.nextDouble(), m = sc.nextDouble();
			if (n < 35.50 && m < 71.00)
			{
				System.out.println("AAA");
			}
			else if (n < 37.50 && m < 77.00)
			{
				System.out.println("AA");
			}
			else if (n < 40.00 && m < 83.00)
			{
				System.out.println("A");
			}
			else if (n < 43.00 && m < 89.00)
			{
				System.out.println("B");
			}
			else if (n < 50 && m < 105.00)
			{
				System.out.println("C");
			}
			else if (n < 55.00 && m < 116.00)
			{
				System.out.println("D");
			}
			else if (n < 70.00 && m < 148.00)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("NA");
			}
		}
	}
}