import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;




public class Main {
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

	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static Reader sc = new Reader();
 
	static int mod = (int)(1e9+7),MAX=(int)(2e6+10);

	public static void main(String[] args) throws IOException{

		int n = sc.nextInt();
		int m = sc.nextInt();
		precompute((int)1e6);
		long ans = ncr(m,n)%mod * fac[n]%mod;
		ans = ans%mod * D(n)%mod;
		ans = (ans%mod*m)%mod;
		ans%=mod;
		out.print(ans);
		
		
	        out.close();
	}
	
	static long[] fac,inv;
	static void precompute(int n)
	{

		 fac = new long[n+1];
	     inv = new long[n+1];
		fac[0]=fac[1]=1;
		for(int i=2;i<fac.length;i++)
		{
			fac[i]=fac[i-1]*i;
			fac[i]%=mod;
		}
		
		inv[n]=pow(fac[n],(int) (mod-2));
		for(int i=n-1;i>=0;i--)
		{
			inv[i]=inv[i+1]*(i+1);
			inv[i]%=mod;
		}
	}
	
	private static long pow(long x, int y) {
		 long res = 1;
        x %= mod;
        while (y > 0) {
            if ((y & 1) == 1) {
                res *= x;
                res %= mod;
            }
            y >>= 1;
            x *= x;
            x %= mod;
        }
        return res;
	  }
	 
		private static long ncr(int n , int r) {
			if(n < 0 || r < 0 || r > n) return 0;
			return ((fac[n]*inv[r]%mod)*(inv[n-r]%mod))%mod;
		}
		
		static long D(int n) 
	    { 
	        // Create an array to store 
	        // counts for subproblems 
	        long der[] = new long[n + 1]; 
	      
	        // Base cases 
	        der[0] = 1; 
	        der[1] = 0; 
	        der[2] = 1; 
	      
	        // Fill der[0..n] in bottom up  
	        // manner using above recursive 
	        // formula 
	        for (int i = 3; i <= n; ++i) 
	            der[i] = (i - 1) * (der[i - 1] +  
	                                der[i - 2]); 
	      
	        // Return result for n 
	        return der[n]; 
	    } 
}

