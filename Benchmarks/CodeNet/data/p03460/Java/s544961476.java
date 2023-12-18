import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		Reader in=new Reader();
		int n=in.nextInt();
		int k=in.nextInt();
		int dcnt[][]=new int[2*k][2*k];
		int x,y,c;
		for(int i=0; i<n; i++)
		{
			x=in.nextInt()%k;
			y=in.nextInt()%k;
			c=(in.next().charAt(0)=='W')?0:1;
			if(c==1)
			{
				dcnt[0][0]++;
				dcnt[x][0]--;
				dcnt[0][y]--;
				dcnt[x][y]++;
				dcnt[x][y]++;
				dcnt[x+k][y+k]++;
				dcnt[x+k][y]--;
				dcnt[x][y+k]--;
				dcnt[x+k][y+k]++;
				dcnt[x+k][0]++;
				dcnt[x+k][y]--;
				dcnt[0][y+k]++;
				dcnt[x][y+k]--;
			}
			else
			{
				dcnt[x][0]++;
				dcnt[0][y]++;
				dcnt[x][y]--;
				dcnt[x][y]--;
				dcnt[x+k][y+k]--;
				dcnt[x+k][y]++;
				dcnt[x][y+k]++;
				dcnt[x+k][y+k]--;
				dcnt[x+k][0]--;
				dcnt[x+k][y]++;
				dcnt[0][y+k]--;
				dcnt[x][y+k]++;
			}
		}
	/*	for(int i=0; i<2*k; i++)
		{
			for(int j=0; j<2*k; j++)
				System.out.print(dcnt[j][i]+" ");
			System.out.println();
		}
		
	*/	for(int i=0; i<2*k; i++)
			for(int j=1; j<2*k; j++)
				dcnt[i][j]+=dcnt[i][j-1];
		for(int i=0; i<2*k; i++)
			for(int j=1; j<2*k; j++)
				dcnt[j][i]+=dcnt[j-1][i];
		int max=0;
		for(int i=0; i<2*k; i++)
		{
			for(int j=0; j<2*k; j++)
			{
				max=Math.max(max, dcnt[i][j]);
			}
		}
	/*	for(int i=0; i<2*k; i++)
		{
			for(int j=0; j<2*k; j++)
				System.out.print(dcnt[j][i]+" ");
			System.out.println();
		}
	*/	System.out.println(max);
	}
	static StringBuilder ans=new StringBuilder();
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
	            byte[] buf = new byte[65535]; // line length
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
}