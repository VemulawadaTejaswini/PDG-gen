import java.util.*;
public class Main 
{
	static boolean[] isPrime = new boolean[1000001];
	static List<Integer> prime = new ArrayList<Integer>();
	static void primeCalc()
	{
		for(int i = 0; i < isPrime.length; ++i)
		{
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for(int i = 0; i < isPrime.length; ++i)
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
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int count = 0;
			int pos = 0;
			while(prime.get(pos) <= n / 2)
			{
				if(isPrime[n - prime.get(pos)])
				{
					++count;
				}
				++pos;
			}
			System.out.println(count);
		}
	}
}