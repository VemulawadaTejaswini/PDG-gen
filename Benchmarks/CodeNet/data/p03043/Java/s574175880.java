// Working program using Reader Class 
import java.io.*;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 

public class Main 
{ 
	static class Reader 
	{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 

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
			} while ((c = read()) >= '0' && c <= '9'); 

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
	
	public static long power(long l, long m,long p) 
    { 
		//long p=mod;
        // Initialize result 
        long res = 1;      
         
        // Update x if it is more   
        // than or equal to p 
        l = l % p;  
      
        while (m > 0) 
        { 
            // If y is odd, multiply x 
            // with result 
            if((m & 1)==1) 
                res = (res * l) % p; 
      
            // y must be even now 
            // y = y / 2 
            m = m >> 1;  
            l = (l * l) % p;  
        } 
        return (long)res; 
    } 
	
	public static long mod=998244353;
	
	public static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	
	public static long modMult(long a,long b) {
		return ((a%mod)*(b%mod))%mod;
	}
	
	public static long modAdd(long a,long b) {
		return ((a%mod)+(b%mod))%mod;
	}
	
	public static void main(String[] args) throws IOException 
	{ 
		Reader scan=new Reader();
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		long n=scan.nextLong();
		long k=scan.nextLong();
		double ans=0;
		for(long i=1;i<=n;i++) {
			double curr=(double)1/(double)n;
			double req=(double)k/(double)i;
			if(req<1) {
				ans+=curr;
			}
			else {
				int to=(int)(Math.log(req)/Math.log(2));
				double d=(double)(Math.log(req))/(double)(Math.log(2));
				Double d1=new Double(d);
				Double d2=new Double(to);
				if(d1.equals(d2)) {
					curr=curr*(double)(Math.pow(0.5, to));
				}
				else {
					curr=curr*(double)(Math.pow(0.5, to+1));
				}
				ans+=curr;
			}
		}
		out.print(ans);
		//out.printf("%.9f", ans);
		out.close();
	} 
} 