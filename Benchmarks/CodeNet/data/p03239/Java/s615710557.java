import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int ans = 1001;
		for (int i = 0 ; i < N ; i++)
		{
			int c = in.nextInt();
			int t = in.nextInt();
			if (t <= T)
			{
				if(ans > c)
				ans = c;
			}
		}
		
		if (ans == 1001)
			System.out.println("TLE");
		else
			System.out.println(ans);
	}
}