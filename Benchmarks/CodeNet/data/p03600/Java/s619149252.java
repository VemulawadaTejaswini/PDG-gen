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
	
	static int[][] m;
	static long[][][] d;
	static int ans, n;
	
	static long inverseDijkstra()
	{
		long ans = 0;
		for(int i = 0; i < n - 1; i ++)
		{
			for(int j = i + 1; j < n; j ++)
			{
				boolean ok = false;
				for(int x = 0; x < n; x ++)
				{
					//if(d[x][i][j] + m[i][x] < m[i][j] || d[x][j][i] + m[j][x] < m[i][j])
					//	return -1;
					if(d[x][i][j] + m[i][x] == m[i][j] && d[x][j][i] + m[j][x] == m[i][j])
						ok = true;
				}
				if(!ok)
					ans += m[i][j];
			}
		}
		return ans;
	}
	
	static void dijkstra(int starting, int not, int current, int previous)
	{
		Vector <Integer> toDo = new Vector <Integer> ();
		for(int i = 0; i < n; i ++)
		{
			if(i == previous || i == not)
				continue;
			if(d[starting][not][current] + m[current][i] < d[starting][not][i])
			{
				d[starting][not][i] = d[starting][not][current] + m[current][i];
				toDo.add(i);
			}
		}
		for(int i = 0; i < toDo.size(); i ++)
			dijkstra(starting, not, toDo.get(i), current);
	}
	
	public static void main(String[] args) throws IOException
	{
		n = in.nextInt();
		ans = 0;
		m = new int[n][n];
		d = new long[n][n][n];
		for(int i = 0; i < n; i ++)
			for(int j = 0; j < n; j ++)
				m[i][j] = in.nextInt();
		for(int i = 0; i < n; i ++)
		{
			for(int not = 0; not < n; not ++)
			{
				if(i == not)
					continue;
				Arrays.fill(d[i][not], (long)1E17);
				d[i][not][i] = 0;
				dijkstra(i, not, i, -1);
			}
		}
		sop(inverseDijkstra());
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