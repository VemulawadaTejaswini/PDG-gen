import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, x, ans;
		while(true)
		{
			n = sc.nextInt();
			x = sc.nextInt();
			ans = 0;
			if(n == 0 && x == 0)
			{
				break;
			}
			for (int i = 1; i <= n; i++)
			{
				for (int j = i + 1; j <= n; j++)
				{
					for (int k = j + 1; k <= n; k++)
					{
						if(i != j && j != k && i != k && i + j + k == x)
						{
							++ans;
						}
					}
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
