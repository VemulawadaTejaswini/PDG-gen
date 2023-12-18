import java.util.Scanner;

public class Main 
{
	static int gcd(int a, int b)
	{
		if (b == 0) 
			return a; 
		int mod = a%b;
		if(mod<0)mod+=b;
		return gcd(b, mod);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] gc = new int[201][201];
		
		for(int i = 1; i <= 200; i++)
		{
			for(int j = 1; j <= 200; j++)
			{
				gc[i][j] = gcd(i,j);
			}
		}
		
		int n = sc.nextInt();
		long an = 0;
		
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				for(int k = 1; k <= n; k++)
				{
					an += gc[gc[i][j]][k];
				}
		
		System.out.println(an);
		
	}

}
