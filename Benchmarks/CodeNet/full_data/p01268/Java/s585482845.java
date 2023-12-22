import java.util.*;
public class Main 
{
	static final int NUM = 300000;
	static boolean[] isPrime = new boolean[NUM];
	static List<Integer> prime = new ArrayList<Integer>();
	static void primeCalc()
	{
		for(int i = 0; i < NUM; ++i)
		{
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for(int i = 2; i < NUM; ++i)
		{
			if(isPrime[i])
			{
				prime.add(i);
				for(int j = 2 * i; j < NUM; j += i)
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
			int N = stdIn.nextInt();
			int P = stdIn.nextInt();
			if(N == -1 && P == -1)
			{
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			int pos = 0;
			while(N >= prime.get(pos))
			{
				++pos;
			}
			for(int i = pos; i < pos + P; ++i)
			{
				int p = i;
				for(int j = p; j < p + P; ++j)
				{
					list.add(prime.get(i) + prime.get(j));
				}
			}
			Collections.sort(list);
			System.out.println(list.get(P - 1));
		}
	}
}