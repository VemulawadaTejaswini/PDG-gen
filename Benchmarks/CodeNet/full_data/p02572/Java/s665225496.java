import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		final long m = 1000000007;
		int n = kb.nextInt();

		long arr[] = new long[n];

		for(int i = 0 ; i < n ; i++)
			arr[i] = kb.nextLong();

		long suffix[] = new long[n];

		suffix[n-1] = arr[n-1];

		for(int i = n-2 ; i >= 0 ; i--)
		{
			suffix[i] = (suffix[i+1] + arr[i]) % m;
		}

		long res = 0;
		for(int i = 0; i < n-1 ; i++)
		{
			res = (res + (arr[i] * suffix[i+1])) % m;
		}

		System.out.println(res);
	}
}