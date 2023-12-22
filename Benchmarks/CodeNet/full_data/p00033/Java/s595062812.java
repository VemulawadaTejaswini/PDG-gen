import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			ArrayList<Integer> a = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();
			
			for(int j=0; j<10; j++)
			{
				int ball = scanner.nextInt();
				if(j%2 == 0)
				{
					a.add(ball);
				}
				else {
					b.add(ball);
				}
			}
			
			boolean result = true;
			for(int j=1; j<a.size(); j++)
			{
				if(a.get(j-1) > a.get(j))
				{
					result = false;
					break;
				}
			}
			for(int j=1; j<b.size(); j++)
			{
				if(b.get(j-1) > b.get(j))
				{
					result = false;
					break;
				}
			}
			
			System.out.println(result ? "YES" : "NO");
		}
	}
}