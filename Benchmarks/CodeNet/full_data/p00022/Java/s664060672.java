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
			
			long[] a = new long[n];
			a[0] = scanner.nextInt();
			long sum = a[0];
			long max = a[0];
			for(int i=1; i<n; i++)
			{
				a[i] = scanner.nextInt();
				if(a[i] > max)
				{
					if(sum>0 && a[i]>0)
					{
						sum += a[i];
						//max = sum;	
					}
					else {
						sum = a[i];
						//max = a[i];
					}
				}
				else {
					sum += a[i];	
				}
				
				if(max < sum)
				{
					max = sum;
				}
			}
			System.out.println(max);
		}
	}
}