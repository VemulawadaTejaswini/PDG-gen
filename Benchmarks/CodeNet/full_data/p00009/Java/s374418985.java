import java.util.Scanner;


public class Main 
{
	private static int[] prime = new int[99999];
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int max = create();
		
		for(; scanner.hasNext(); )
		{
			int n = scanner.nextInt();
			int count = 0;
			for(int i=0; i<max; i++)
			{
				if(n < prime[i])
				{
					break;
				}
				count++;
			}
			
			System.out.println(count);
		}
	}
	
	private static int create()
	{
		int count = 0;
		for(int i=2; i<999999; i+=(i==2)?1:2)
		{
			int p = (int)Math.sqrt(i);
			boolean is_prime = true;
			for(int j=2; j<=p; j+=(j==2)?1:2)
			{
				if(i % j == 0)
				{
					is_prime = false;
					break;
				}
			}
			if(is_prime)
			{
				prime[count++] = i;
			}
		}
		
		return count;
	}
}