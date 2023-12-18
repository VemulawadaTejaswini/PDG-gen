import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
class Main
{
	static class Pair implements Comparable
	{
		int first;
		double second;
		
		public Pair(int f, double s)
		{
			first = f;
			second = s;
		}
		
		public String toString()
		{
			return first + " " + second;
		}
		
		public int compareTo(Object o)
		{
			Pair p2 = (Pair)o;
			if(this.first < p2.first)
				return -1;
			if(this.first > p2.first)
				return 1;
			if(this.second < p2.second)
				return -1;
			if(this.second > p2.second)
				return 1;
			return 0;
		}
	}
	
	static int log2(double a)
	{
		return (int)(Math.log(a) / Math.log(2));
	}
	
	static long gcd(long a, long b)
	{
		long r;
		while((r = a % b) > 0)
		{
			a = b;
			b = r;
		}
		return b;
	}
	
	public static void main(String[] args) throws IOException
	{
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		boolean ans = false;
		for(int i = 0; i <= n && !ans; i ++)
		{
			for(int j = 0; j <= m && !ans; j ++)
			{
				if((m - j) * i + (n - i) * j == k)
				{
					ans = true;
				}
			}
		}
		sop(ans ? "Yes" : "No");
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
	
    static FastReader in = new FastReader();
  
    public static void sop(Object o)
    {
    	System.out.print(o);
    }
}