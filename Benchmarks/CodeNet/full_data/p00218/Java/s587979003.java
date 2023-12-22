import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			for(int i = 0; i < n; ++i)
			{
				int pm = stdIn.nextInt();
				int pe = stdIn.nextInt();
				int pj = stdIn.nextInt();
				if(pm == 100 || pe == 100 || pj == 100 || (pm + pe >= 180) || (pm + pe + pj >= 240))
				{
					System.out.println("A");
				}
				else if((pm + pe + pj >= 210) || (pm + pe + pj >= 150 && (pm >= 80 || pe >= 80)))
				{
					System.out.println("B");
				}
				else
				{
					System.out.println("C");
				}
			}
		}
	}
}