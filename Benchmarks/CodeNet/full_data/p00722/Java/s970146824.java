
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static boolean[] prime = new boolean[1000001];
	
	static void buildprime()
	{
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		
		for(int i = 2; i*i <= 1000000; i++)
		{
			if(prime[i])
			{
				for(int j = i*i; j<=1000000; j+= i)
				{
					prime[j] = false;
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		buildprime();
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			if(a == 0 && d == 0 && n == 0)return;

			{
				int mul = 1;
				int th = 1;
				int num = a-d;
				while(true)
				{
//					int num = a + (d*mul);
					num += d;
					
//					System.out.println(num + " " + th + " of " + n);
//					System.out.println(num + " " + (n-th+2));
					
					if(prime[num])
					{
						if(th == n)
						{
							System.out.println(num);
							break;
						}
						
						th++;
					}
					
					mul++;
				}
			}
		}
		

	}

}

