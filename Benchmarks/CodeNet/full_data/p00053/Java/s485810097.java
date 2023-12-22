import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	static ArrayList<Integer> prime = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		create();
		
		for(;;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			int sum = 0;		
			for(int i=0; i<n; i++)
			{
				sum += prime.get(i);
			}
			System.out.println(sum);
		}
	}
	
	private static void create()
	{
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
				prime.add(i);
			}
		}
	}
}