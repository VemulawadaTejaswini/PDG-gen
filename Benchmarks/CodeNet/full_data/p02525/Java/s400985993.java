import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int n, ave;
			double a;
			int[] stds = new int[1000];

			while(true)
			{
				ave = 0;
				a = 0.0;

				n = sc.nextInt();
				if(n == 0)
				{
					break;
				}

				for(int i = 0; i < n; i++)
				{
					stds[i] = sc.nextInt();
					ave += stds[i];
				}
				ave /= n;

				for(int i = 0; i < n; i++)
				{
					a += (stds[i] - ave) * (stds[i] - ave);
				}
				a /= n;
				a = Math.sqrt(a);

				System.out.println(a);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}