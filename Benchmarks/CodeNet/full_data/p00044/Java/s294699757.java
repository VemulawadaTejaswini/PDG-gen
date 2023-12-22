import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	static ArrayList<Integer> prime = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		create();
		
		for(; scanner.hasNext(); )
		{
			int n = scanner.nextInt();
			int i = 0;
			int min=0, max=0;
			for(; i<prime.size(); i++)
			{
				if(n == prime.get(i))
				{
					min = prime.get(i-1);
					max = prime.get(i+1);
					break;
				}
				else if(n < prime.get(i))
				{
					min = prime.get(i-1);
					max = prime.get(i);
					break;
				}
			}
			System.out.println(min + " " + max);
		}
	}
	
	private static void create()
	{
		for(int i=2; i<=99999; i+=(i==2)?1:2)
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