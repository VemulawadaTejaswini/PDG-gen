

import java.util.Scanner;

public class Main 
{
	static boolean isPrime(int x)
	{
		if(x == 2)return true;
		for(int i = 2; i*i <= x; i++)
		{
			if(x%i == 0)return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt();
			if(n == 0)break;
			int ans = 0;
			
			for(int i = n+1; i <= 2*n; i++)
			{
				if(isPrime(i)){ans += 1;}
			}
			
			System.out.println(ans);
		}
	}

}

