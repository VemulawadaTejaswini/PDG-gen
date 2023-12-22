import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			double[] s = new double[1000];
			double sum = 0;
			for(int i=0; i<n; i++)
			{
				s[i] = scanner.nextDouble();
				sum += s[i];
			}
			
			double m = sum/n;
			double v = 0;
			for(int i=0; i<n; i++)
			{
				v += (s[i] - m) * (s[i] - m);
			}

			System.out.printf("%1$.8f\n", Math.sqrt(v/n));
		}
	}
}