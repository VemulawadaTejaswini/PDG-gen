import java.util.*;
import java.io.*;

class Main
{
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
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

	public static void main (String[] args)
	{
		FastReader reader = new FastReader();
		int n = reader.nextInt();
		int m = reader.nextInt();
		int x = reader.nextInt();

		int[] arr = new int[n+2];
		int[] par = new int[n+2];
		int[] sar = new int[n+2];

		for (int i=0;i<m; i++)
		 	arr[reader.nextInt()] = 1;

		for (int i=1; i<n+2; i++)
			par[i] = par[i-1] + arr[i];

		for (int i=n; i>=0; i--)
			sar[i] = sar[i+1] + arr[i];

		System.out.println (Math.min (par[x-1], sar[x+1]));

	}
}
