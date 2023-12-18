import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p[];
		//N <= 20
		p = new int[20];

		for(int i = 0 ; i < n ; i++)
		{
			p[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i = 1 ; i < n-1 ; i++)
		{
			if( ((p[i] - p[i-1]) > 0) ^ ((p[i] - p[i+1]) > 0) )
			{
				ans++;
			}
		}

		System.out.println(ans);
	}

}