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
			for(int i=0; i<=prime.size(); i++)
			{
				if(n < prime.get(i))
				{
					System.out.println(i);
					break;
				}
				
			}		
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