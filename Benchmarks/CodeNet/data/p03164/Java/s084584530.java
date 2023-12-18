import java.util.*;
import java.io.*;


 class Main {
    static long[][] dp;
    
    public static long solve(int[] w, int[] v, int i, int valueMade){
        if(valueMade == 0)
            return 0;
        
        if(i >= w.length){
      //      System.out.println( "use ");
        
            return Long.MAX_VALUE;}
        
        long ans = Long.MAX_VALUE;
        if(dp[i][valueMade] != -1)
            return dp[i][valueMade];
            
        // not take
        ans = Math.min(ans,solve(w,v,i+1,valueMade));
        // take
        if(valueMade - v[i] >= 0){
            long small = solve(w,v,i+1,valueMade-v[i]);
            if(small != Long.MAX_VALUE){
                ans = Math.min(ans,w[i] + small);
            }
        }
           
        //System.out.println(valueMade +" "  + ans );
        return dp[i][valueMade] = ans;
        
    }
    
    
    public static void main(String args[]) throws IOException  {
        Reader r = new Reader();
        int n = r.nextInt();
        int cap = r.nextInt();
        
        dp = new long[n+1][100000+100];
        for(int i = 0; i< dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        
        
        
        int[] w = new int[n];
        int[] v = new int[n];
        
        for(int i = 0; i < n; i++){
            w[i] = r.nextInt();
            v[i] = r.nextInt();
        }
        
      
        long ans= -1;
        
    int sum =0 ;
          for(int i = 0; i<= (30+50+60); i++){
             sum++;
             
              long t = (solve(w,v,0,sum));
              if(sum > ans && t <= cap ){
                  ans = sum;
              }
        }
        
        System.out.println(ans);
        
        
    
 
        
        
        
    }
}




 class Reader 
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

