import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[10000];
		
		int max= -1000000;
		int min = 1000000;
		long sum = 0;
		for(int i=0; i<n; i++)
		{
			a[i] = scanner.nextInt();
			if(i == 0)
			{
				max = a[0];
				min = a[0];
			}
			else
			{
					if(a[i] > max)
					{
						max = a[i];
					}
					else if(a[i] < min)
					{
						min = a[i];
					}
			}
			
			sum += a[i];
		}
		
		System.out.printf("%1$d %2$d %3$d\n", min, max, sum);
	}
}