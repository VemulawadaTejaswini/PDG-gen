import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static int n,m;
	static int [] a;
	static long mod=(long)(1e9+7);

	static long f(String s,int i,int pv,long [][] dp){
		if(i==n+1){
			return 1;
		}
		if(dp[i][pv]!=-1)return dp[i][pv];

		long cnt=0;
		if(i==0){
			for(int j=1;j<=m;j++){
					a[j]=1;
				    cnt=(cnt+f(s,i+1,j,dp)%mod)%mod;
				    a[j]=0;
			}
		}
		else{
			if(s.charAt(i-1)=='>'){
				for(int j=1;j<pv;j++){
					if(a[j]==0){
						a[j]=1;
					    cnt=(cnt+f(s,i+1,j,dp)%mod)%mod;
					    a[j]=0;
					}
				}
			}
			else{
				for(int j=pv+1;j<=m;j++){
					if(a[j]==0){
						a[j]=1;
					    cnt=(cnt+f(s,i+1,j,dp)%mod)%mod;
					    a[j]=0;
					}
				}
				
			}
		}
		return dp[i][pv]= cnt%mod;
	}
	public static void main( String [] args) throws IOException{
		FastScanner sc=new FastScanner();
		m=sc.nextInt();
		String s=sc.next();
		n=s.length();
		a=new int[m+1];
		long [][] dp=new long[m+5][m+5];
		for(int i=0;i<=(m+4);i++)Arrays.fill(dp[i],-1);
		long ans=f(s,0,0,dp)%mod;

		System.out.println(ans);
	}
}




































































class FastScanner{	
	 private int BUFFER_SIZE = 1 << 16;
	
	private  DataInputStream din;
	
	private  byte[] buffer;
	
	private int bufferPointer, bytesRead;
	
	public FastScanner() {
		din = new DataInputStream(System.in);
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
	}

	public FastScanner( String file_name) throws IOException {
		din = new DataInputStream(new FileInputStream(file_name));
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
    }
    
	public String readLine() throws IOException {
		 byte[] buf = new byte[64];
		int cnt = 0, c;
		while ((c = read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}
    
    public String next() throws IOException{

		byte c = read();
		while(Character.isWhitespace(c)){
			c = read();
		}
		
		 StringBuilder builder = new StringBuilder();
		builder.append((char)c);
		c = read();
		while(!Character.isWhitespace(c)){
			builder.append((char)c);
			c = read();
		}
		
		return builder.toString();
	}

	public int nextInt() throws IOException {
		int ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		 boolean neg = (c == '-');
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}
	
	public int[] nextIntArray( int n) throws IOException {
		 int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = nextInt();
		}
		return arr;
	}

	public long nextLong() throws IOException {
		long ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		 boolean neg = (c == '-');
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}
	
	public long[] nextLongArray( int n) throws IOException {
		 long arr[] = new long[n];
		for(int i = 0; i < n; i++){
			arr[i] = nextLong();
		}
		return arr;
	}

	public char nextChar() throws IOException{
		byte c = read();
		while(Character.isWhitespace(c)){
			c = read();
		}
		return (char) c;	
	}
	
	public double nextDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = read();
		while (c <= ' ')
			c = read();
		 boolean neg = (c == '-');
		if (neg)
			c = read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
    }
    
	public double[] nextDoubleArray( int n) throws IOException {
		 double arr[] = new double[n];
		for(int i = 0; i < n; i++){
			arr[i] = nextDouble();
		}
		return arr;
	}

	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private byte read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	public void close() throws IOException {
		if (din == null)
			return;
		din.close();
	}

}


