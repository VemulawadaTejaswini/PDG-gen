import java.util.*;
public class Main 
{
	static List<Integer> prime = new ArrayList<Integer>();
	static boolean[] isPrime = new boolean[1000000];
	static void primeCalc()
	{
		for(int i = 0; i < isPrime.length; ++i)
		{
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for(int i = 2; i < isPrime.length; ++i)
		{
			if(isPrime[i])
			{
				prime.add(i);
				for(int j = 2 * i; j < isPrime.length; j += i)
				{
					isPrime[j] = false;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		primeCalc();
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int a = stdIn.nextInt();
			int d = stdIn.nextInt();
			int n = stdIn.nextInt();
			if(a == 0 && d == 0 && n == 0)
			{
				break;
			}
			int num = a;
			int ans = 0;
			int count = 0;
			while(count < n)
			{
				if(isPrime[num])
				{
					ans = num;
					++count;
				}
				num += d;
			}
			System.out.println(ans);
		}
	}
}