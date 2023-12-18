import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

public class Main implements Runnable 
{
    static class InputReader 
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) 
        {
            this.stream = stream;
        }
        
        public int read()
        {
            if (numChars==-1) 
                throw new InputMismatchException();
            
            if (curChar >= numChars) 
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                
                if(numChars <= 0)               
                    return -1;
            }
            return buf[curChar++];
        }
     
        public String nextLine()
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
        public int nextInt() 
        {
            int c = read();
            
            while(isSpaceChar(c)) 
                c = read();
            
            int sgn = 1;
        
            if (c == '-') 
            {
                sgn = -1;
                c = read();
            }
            
            int res = 0;
            do
            {
                if(c<'0'||c>'9') 
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c)); 
        
            return res * sgn;
        }
        
        public long nextLong() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;
            
            do 
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
                return res * sgn;
        }
        
        public double nextDouble() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') 
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
    
        public String readString() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do 
            {
                res.appendCodePoint(c);
                c = read();
            } 
            while (!isSpaceChar(c));
            
            return res.toString();
        }
     
        public boolean isSpaceChar(int c) 
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public String next()
        {
            return readString();
        }
        
        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
    }
	
	
	// if modulo is required set value accordingly
	public static long[][] matrixMultiply2dL(long t[][],long m[][])
	{
		long res[][]= new long[t.length][m[0].length];
		
		for(int i=0;i<t.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				res[i][j]=0;
				for(int k=0;k<t[0].length;k++)
				{
					res[i][j]+=t[i][k]+m[k][j];
				}
			}
		}
		
		return res;
	}
	
	static long combination(long n,long r)
	{
		long ans=1;
		for(long i=0;i<r;i++)
		{
			ans=(ans*(n-i))/(i+1);
		}
		return ans;
	}
	
	
    public static void main(String args[]) throws Exception 
    {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
	// **just change the name of class from Main to reuquired**
    public void run()
    {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		// dp array will contain the longest path possible from that vertex
		// hence it can be 0 if that vertex is not connected further
		// we will use bottom-up approach filling the table
		//int dp[]=new int[n+1];
		//Arrays.fill(dp,-1);
		
		Graph g = new Graph(n,m);
		
		for(int i=0;i<m;++i)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			g.al[x].add(y);
		}
		
		int ans=-1;
		for(int i=1;i<=n;++i) ans=Math.max(ans,g.longestPath(i));
		System.out.println(ans-1);
		//printing ans-1 because in my dp array i have considered number of vertices in the chain
		// hence the number of edges will be 1 less
		
		
        System.out.flush();
        w.close();
    }
}

class Graph{
	int numOfVertices;
	int numOfEdges;
	ArrayList<Integer> al[];
	int dp[];
	
	Graph(int n, int m)
	{
		numOfVertices=n;
		numOfEdges=m;
		al= new ArrayList[n+1];
		dp= new int[n+1];
		Arrays.fill(dp,-1);
		
		for(int i=0;i<=n;++i) al[i]= new ArrayList<Integer>();
	}
	
	public void dfs(int v)
	{
		boolean visited[]= new boolean[numOfVertices+1];
		dfsUtil(v,visited);
	}
	
	public void dfsUtil(int v,boolean visited[])
	{
		visited[v]=true;
		for(int i=0;i<al[v].size();++i)
		{
			dfsUtil(al[v].get(i),visited);
		}
	}
	
	public int longestPath(int v)
	{
		if(dp[v]!=-1) return dp[v];
		else if(al[v].size()==0)
		{
			dp[v]=1;
			return dp[v];
		}
		else
		{
			int ans=-1;
			for(int i=0;i<al[v].size();++i)
			{
				ans=Math.max(ans,1+longestPath(al[v].get(i)));
			}
			dp[v]=ans;
			return dp[v];
		}
	}
}