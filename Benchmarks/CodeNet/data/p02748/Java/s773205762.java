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
	
    public static void main(String args[]) throws Exception 
    {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
	// **just change the name of class from Main to reuquired**
    public void run()
    {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int M=sc.nextInt();
		
		Integer a[]= new Integer[A];
		Integer b[]= new Integer[B];
		for(int i=0;i<A;++i) a[i]=sc.nextInt();
		for(int i=0;i<B;++i) b[i]=sc.nextInt();
		
		int min=Integer.MAX_VALUE;
		while(M-->0)
		{
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			int c=sc.nextInt();
			
			min=Math.min(min,a[x]+b[y]-c);
		}
		
		int m1=a[0],m2=b[0];
		for(int i=0;i<A;++i) m1=Math.min(m1,a[i]);
		for(int i=0;i<B;++i) m2=Math.min(m2,b[i]);
		
		min=Math.min(min,m1+m2);
		w.println(min);
		
        System.out.flush();
        w.close();
    }
}