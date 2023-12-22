import java.util.*;
public class Main 
{
	static boolean[] isPrime = new boolean[55000];
	static List<Integer> list = new ArrayList<Integer>();
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
				list.add(i);
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
			int pos = 0;
			while(true)
			{
				if(list.get(pos) >= n)
				{
					System.out.print(list.get(pos - 1) + " ");
					break;
				}
				++pos;
			}
			if(list.get(pos) == n)
			{
				System.out.println(list.get(pos + 1));
			}
			else
			{
				System.out.println(list.get(pos));
			}
		}
	}
}