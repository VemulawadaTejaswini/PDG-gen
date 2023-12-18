import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
class Main
{
	static class Pair
	{
		int first, second;
		public Pair(int f, int s)
		{
			first = f;
			second = s;
		}
		
		public String toString()
		{
			return first + " " + second;
		}
	}
	
	static class PairComparator implements Comparator <Pair>
	{
		public int compare(Pair p1, Pair p2)
		{
			if(p1.first < p2.first)
				return -1;
			if(p1.first > p2.first)
				return 1;
			if(p1.second < p2.second)
				return -1;
			if(p1.second > p2.second)
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
	
	static class TrieNode
	{
		TrieNode z, o;
		boolean end;
		long count;
		
		public TrieNode()
		{
			 z = null;
			 o = null;
			 count = 0;
			 end = false;
		}
	}
	
	static int[] ansS;
	static int a, b, c, d, e, f;
	
	static double p(long a, long b)
	{
		return (double)(100 * b) / (a + b);
	}
	
	static int maxS(int g)
	{
		if(ansS[g] != -1)
			return ansS[g];
		ansS[g] = c + maxS(g - c);
		if(g >= d)
			ansS[g] = Math.max(ansS[g], d + maxS(g - d));
		return ansS[g];
	}
	
	static int ans1 = -1, ans2 = -1;
	
	static void fun(int g)
	{
		int s = maxS(g / 100 * e);
		if(g != 0 && g + s <= f)
		{
			if(ans1 == -1 && ans2 == -1)
			{
				ans1 = g;
				ans2 = s;
			}else if(p(g, s) > p(ans1, ans2))
			{
				ans1 = g;
				ans2 = s;
			}
		}
		if(g + 100 * a <= f)
			fun(g + 100 * a);
		if(g + 100 * b <= f)
			fun(g + 100 * b);
	}
	
	public static void main(String[] args) throws IOException
	{
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		f = in.nextInt();
		ansS = new int[f + 1];
		Arrays.fill(ansS, -1);
		for(int i = 0; i < c; i ++)
			ansS[i] = 0;
		fun(0);
		sop((ans1 + ans2) + " " + ans2);
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