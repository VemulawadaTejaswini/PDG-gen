import java.io.*;
import java.util.*;
public class Main
{
	static boolean isprime(int a)
	{
		int te=(int)Math.sqrt(a);
		for(int i=2; i<=te; i++)
		{
			if(a%te==0)
				return false;
		}
		return true;
	}
	static boolean isp[];
	static boolean issp[];
	public static void main(String[] args) throws IOException
    {
		isp=new boolean[100001];
		issp=new boolean[100001];
		int[] preissp=new int[100001];
		Reader in=new Reader();
		isp[2]=true;
		for(int i=3; i<100001; i+=2)
		{
			isp[i]=isprime(i);
		}
		for(int i=3; i<100001; i+=2)
		{
			if(isp[i]&&isp[(i+1)/2])
			{
				issp[i]=true;
			}
		}
		for(int i=1; i<100001; i++)
		{
			preissp[i]=preissp[i-1];
			if(issp[i])
				preissp[i]++;
		}
		int q=in.nextInt();
		while(q-->0)
		{
			int l=in.nextInt(),r=in.nextInt();
			ans.append(preissp[r]-preissp[l-1]+"\n");
		}
		System.out.println(ans);
    }
	static StringBuilder ans = new StringBuilder();
	static int modInverse(int a)
	{
		int m=1000000007;
	    int m0 = m, t, q;
	    int x0 = 0, x1 = 1;
	 
	    if (m == 1)
	      return 0;
	 
	    while (a > 1)
	    {
	        // q is quotient
	        q = a / m;
	 
	        t = m;
	 
	        // m is remainder now, process same as
	        // Euclid's algo
	        m = a % m;
	        a = t;
	 
	        t = x0;
	 
	        x0 = x1 - q * x0;
	 
	        x1 = t;
	    }
	 
	    // Make x1 positive
	    if (x1 < 0)
	       x1 += m0;
	 
	    return x1;
	}
	static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        StringTokenizer st;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String next() throws IOException
        {
        	while(st==null||!st.hasMoreElements())
        	{
        		try
        		{
        			st=new StringTokenizer(readLine());
        		}
        		catch(IOException e)
        		{
        			e.printStackTrace();
        		}
        	}
        	return
        			st.nextToken();
        }
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
	static String sm(String a, int b)
	{
		String c="";
		while(b!=0)
		{
			if(b%2!=0)
			{
				c=c.concat(a);
				b--;
			}
			b=b>>1;
			a=a.concat(a);
		}
		return c;
	}}