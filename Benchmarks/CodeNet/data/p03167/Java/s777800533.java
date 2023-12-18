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
	
	static long numOfWays(long dp[][], char ch[][], long mod, int i, int j)
	{
		if(ch[i][j]=='#')
		{
			dp[i][j]=0;
			return dp[i][j];
		}
		if(dp[i][j]!=-1) return dp[i][j];
		
		long ans=0;
		if(i>0)
		{
			ans=((ans%mod)+(numOfWays(dp,ch,mod,i-1,j)%mod))%mod;
		}
		if(j>0)
		{
			ans=((ans%mod)+(numOfWays(dp,ch,mod,i,j-1)%mod))%mod;
		}
		dp[i][j]=ans;
		return dp[i][j];
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
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		char ch[][]= new char[r][c];
		for(int i=0;i<r;++i) ch[i]=sc.next().toCharArray();
		
		long dp[][]= new long[r][c];
		for(int i=0;i<r;++i) Arrays.fill(dp[i],-1);
		dp[0][0]=1;
		
		long mod=1000000007;
		System.out.println(numOfWays(dp,ch,mod,r-1,c-1));
		
		
        System.out.flush();
        w.close();
    }
}