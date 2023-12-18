import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		FastReader reader = new FastReader();
		PrintWriter writer = new PrintWriter(System.out);

		int n = reader.nextInt();
		int m = reader.nextInt();
		long[][] mat = new long[n][3];

		for (int i=0; i<n; i++)
		{
			mat[i][0] = reader.nextLong();
			mat[i][1] = reader.nextLong();
			mat[i][2] = reader.nextLong();
		}

		long ans = 0;

		for (int i=0; i<8; i++)
		{
			long[] temp = new long[n];
			for (int j=0; j<n; j++)
			{
				for (int k=0; k<3; k++)
				{
					int bit = (i>>k) & 1;

					if (bit==0)
						temp[j] += mat[j][k];
					else
						temp[j] -= mat[j][k];
				}
			}

			Arrays.sort(temp);
			long add=0;

			for (int j=0; j<m; j++)
				add += temp[n-1-j];

			ans = Math.max (ans, add);
		}

		writer.println (ans);
		writer.close();
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
