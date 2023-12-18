
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

class Cf131 implements Runnable 
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
            while (!isSpaceChar(c) && c != '.') 
            {
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
    public static void main(String args[]) throws Exception 
    {
        new Thread(null, new Cf131(),"Main",1<<27).start();
    }
    
    static class Pair
    {
        int z;
        int o;
        Pair(int z,int o)
        {
            this.z=z;
            this.o=o;
        }
    }
 static class Edge implements Comparable<Edge> 
    {
        int end, wght;

        public Edge(int end, int wght) 
        {
            this.end = end;
            this.wght = wght;
        }

        public int compareTo(Edge edge) 
        {
            return this.wght - edge.wght;
        }
    }
    
    public void run()
    {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Integer[] dp = new Integer[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            dp[i] = Math.min((dp[Math.max(i-1,0)]+(Math.abs(a[i]-a[Math.max(i-1,0)]))),(dp[Math.max(i-2,0)]+(Math.abs(a[i]-a[Math.max(i-2,0)]))));
        }
        w.print(dp[n-1]);
        w.flush();
        w.close();
    }
}