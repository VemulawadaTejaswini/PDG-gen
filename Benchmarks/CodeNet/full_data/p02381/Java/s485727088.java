import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			int n = sc.nextInt();
			if (n == 0)
			{
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < n; i++)
			{
				scores[i] = sc.nextInt();
			}

			double sd = getStandardDeviation(scores);

			System.out.println(sd);
		}
	}

	static double getStandardDeviation(int[] data)
	{
		int sum = 0;
		for (int d :
				data)
		{
			sum += d;
		}

		double ave = (double) sum / data.length;

		double sumSquareDeviation = 0.0;
		for (int d :
				data)
		{
			sumSquareDeviation += Math.pow(d - ave, 2);
		}

		double variance = sumSquareDeviation / data.length;

		double standardDeviation = Math.sqrt(variance);

		return standardDeviation;
	}
}

