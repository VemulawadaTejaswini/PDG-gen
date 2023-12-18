import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		Scanner sc = new Scanner(System.in);
		//FastReader sc = new FastReader();
		int n = sc.nextInt();
		int r[] = new int[n+2];
		int b[] = new int[n+2];
		int g[] = new int[n+2];
		String st = " "+sc.next();
		for(int i=n;i>=1;i--){
			if(st.charAt(i)=='R'){
				r[i]=r[i+1]+1;
			}else r[i] = r[i+1];
			if(st.charAt(i)=='B'){
				b[i] = b[i+1]+1;
			}else b[i]=b[i+1];
			if(st.charAt(i)=='G'){
				g[i] = g[i+1]+1;
			}else g[i]=g[i+1];		
		}
		
		long total =0 ;
		long temp = 0;
		for(int i=1;i<=n-2;i++){
			for(int j=i+1;j<=n-1;j++){
				if(st.charAt(i)==st.charAt(j))
					continue;
				
				int diff = (j-i);
				int ind = j+diff;
				if((st.charAt(i)=='R' && st.charAt(j)=='B') || 
				(st.charAt(i)=='B' && st.charAt(j)=='R')){
					total+=g[j];
					if(j+diff<=n && st.charAt(ind)=='G'){
						total-=1;
					}
				}else if((st.charAt(i)=='R' && st.charAt(j)=='G')|| 
				(st.charAt(i)=='G' && st.charAt(j)=='R')){
					total+=b[j];
					if(j+diff<=n&& st.charAt(ind)=='B'){
						total-=1;
					}
				}else if((st.charAt(i)=='B' && st.charAt(j)=='G')|| 
				(st.charAt(i)=='G' && st.charAt(j)=='B')){
					total+=r[j];
					if(j+diff<=n && st.charAt(ind)=='R'){
						total-=1;
					}
				}
			}
		}
		System.out.println(total);
	}
	
	static long gcd(long a, long b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
	
	
	/*public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return Long.valueOf(o1.diff).compareTo(Long.valueOf(o2.diff));
		}
	}*/
		
	static class FastReader 
		{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 
  
		public FastReader() 
		{ 
			din = new DataInputStream(System.in); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 
  
		public FastReader(String file_name) throws IOException 
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
}