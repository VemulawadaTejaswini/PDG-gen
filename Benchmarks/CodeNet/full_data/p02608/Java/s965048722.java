import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	static long value(int n)
	{
		int[] f = new int[3];
		int i = 0;
		while(n > 0)
		{
			if((n%10) == 0)
			{
				return 0;
			}
			f[i++] = (n%10);
			n /= 10;
		}

		long ans = (f[0]*f[0]) + (f[1]*f[1]) + (f[2]*f[2]) + (f[0]*f[1]) + (f[1]*f[2]) + (f[2]*f[0]);
		return ans;
	}
	static void solve(int n, int[] solution)
	{
		for(int i=111; i<=999; i++)
		{
			long value = value(i);

			if(value <= 0)
			{
				continue;
			}
			if(value <= n)
			{
				solution[(int)value]++;
			}
		}
	}

	public static void main(String[] args)
	{
		FastReader reader = new FastReader();
		int n = reader.nextInt();
		int[] solution = new int[n+1];
		solve(n, solution);

		for(int i=1; i<=n; i++)
		{
			System.out.println(solution[i]);
		}
	}
	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
}

