import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		double S[] = new double[1000];
		while ((n = sc.nextInt()) != 0)
		{
			double mean = 0;
			for (int i = 0; i < n; i++)
			{
				S[i] = sc.nextDouble();
				mean += S[i];
			}
			mean /= n;
			double bun = 0;
			for (int i = 0; i < n; i++)
			{
				bun += (S[i]-mean) * (S[i]-mean);
			}
			System.out.println(Math.sqrt(bun/n));
		}
		sc.close();
	}
}
