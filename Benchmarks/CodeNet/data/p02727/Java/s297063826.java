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
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Integer red[]= new Integer[a];
		Integer green[]= new Integer[b];
		Integer color[]= new Integer[c];
		
		for(int i=0;i<a;++i) red[i]=sc.nextInt();
		for(int j=0;j<b;++j) green[j]=sc.nextInt();
		for(int j=0;j<c;++j) color[j]=sc.nextInt();
		
		Arrays.sort(red);
		Arrays.sort(green);
		Arrays.sort(color);
		
		long ans=0;
		int i=0,j=0,ptr=c-1;
		for(i=a-x,j=b-y;i<a&&j<b&&ptr>=0;i++,j++)
		{
			int p1=color[ptr]-red[i];
			int p2=color[ptr]-green[j];
			
			if(p1>0 && p1>p2)
			{
				ans+=color[ptr];
				ans+=green[j];
				ptr--;
			}
			else if(p2>0 && p2>p1)
			{
				ans+=red[i];
				ans+=color[ptr];
				ptr--;
			}
			else
			{
				ans+=red[i];
				ans+=green[j];
			}
		}
		
		if(ptr<0)
		{
			while(i<a)
			{
				ans+=red[i];
				i++;
			}
			
			while(j<b)
			{
				ans+=green[j];
				j++;
			}
		}
		else
		{
			while(i<a)
			{
				if(ptr>=0 && color[ptr]>red[i])
				{
					ans+=color[ptr];
					ptr--;
				}
				else 
				{
					ans+=red[i];
					i++;
				}
			}
			
			while(j<b)
			{
				if(ptr>=0 && color[ptr]>green[j])
				{
					ans+=color[ptr];
					ptr--;
				}
				else
				{
					ans+=green[j];
					j++;
				}
			}
		}
		
		w.println(ans);
		
		
        System.out.flush();
        w.close();
    }
}