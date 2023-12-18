import java.io.ByteArrayInputStream;
			import java.io.IOException;
			import java.io.InputStream;
			import java.io.PrintWriter;
			import java.util.*;
			import java.io.*;
			import java.math.*;
			public class Main {
			InputStream is;
				PrintWriter out;
				String INPUT = ""; 
			//classin Declaration
			

			static class pair implements Comparable<pair>{
				int x,y;
				
				pair (int i,int j)
				{ x=i; y=j; 
					
				}
				public int compareTo(pair p){
					if(this.x!=p.x) { return this.x-p.x;}
					else { return this.y-p.y;}
				}
				public int hashCode() { return (x+" "+y).hashCode();}
				public String toString(){ return x+" "+y;} 
				public boolean equals(Object o){ 
					pair x = (pair) o ;
					return (x.x==this.x&&x.y==this.y);}
			}
			
	
long mod = (long)1e9 + 7;			
void solve() throws Exception{

	
	long n=nl();
	long cnt =0; 
	for(long i=2;i*i<=n;++i){
		if(n%i==0){
			if(i*i==n){
				long temp = n;
				while(temp%i == 0) temp = temp/i;

				if(temp%i==1) cnt++;
			}
			else{
				long f = i;
				long s = n/i;
				long temp  =n;
				while(temp%f == 0) temp = temp/f;

				if(temp%f==1) cnt++;
				temp = n;
				while(temp%s == 0) temp = temp/s;

				if(temp%s==1) cnt++;

			}
		}
	}

	//pn(cnt+" now ");
	n=n-1;
	for(long i=2;i*i<=n;++i){
		if(n%i==0){
			if(i*i==n){
				cnt++;
			}
			else{
					cnt+=2;

			}
		}
	}
	cnt+=2;
	pn(cnt);



		// int[] arr = na(m);
		// int[] prefix = new int[m];
		// prefix[0]=arr[0];
		// for(int i=1;i<m;++i) prefix[i]=prefix[i-1]+arr[i];

		// int[] ans = new int[m];
		// ans[m-1]=  n-arr[n-1]+1;
		// boolean flag = true;
		// for(int i=m-2;i>=0;--i){
			
		// 	if(prefix[i]>=(ans[i+1]-1)){
		// 		int end = Math.min(ans[i+1]-1,n-arr[i]+1);
		// 		int start = end -arr[i] -1 ;
		// 		for(int j=end ; j>=start ; --j){
		// 			if(prefix[i-1]>=())
		// 		} 
		// 	}
		// 	else{
		// 		flag= false;
		// 		break;
		// 	}		 
		// }
		


		


}
long gcd(long a,long b){
	if(b==0) return a;
	return gcd(b,a%b);
}
long pow(long a,long b){
	long result = 1;
	while(b>0){
		if(b%2==1) result = (result * a) % mod;
		b/=2;
		a=(a*a)%mod;
	}
	return result;
}

	void run() throws Exception
			{
					is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
			 out = new PrintWriter(System.out);
					
					long s = System.currentTimeMillis();
					solve();
					out.flush();
					if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
			}
				
				
		public static void main(String[] args) throws Exception { new Main().run(); }
				
			//output methods
			private void pn(Object o)
			{
				out.println(o);
			}
			private void p(Object o)
			{
				out.print(o);
			}
 
 
 
			//input methods
					private byte[] inbuf = new byte[1024];
				public int lenbuf = 0, ptrbuf = 0;
				
 
				private int readByte()
				{
					if(lenbuf == -1)throw new InputMismatchException();
					if(ptrbuf >= lenbuf){
						ptrbuf = 0;
						try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
						if(lenbuf <= 0)return -1;
					}
					return inbuf[ptrbuf++];
				}
				
				
				
				
				private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
				private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
				
				private double nd() { return Double.parseDouble(ns()); }
				private char nc() { return (char)skip(); }
				
				private String ns()
				{
					int b = skip();
					StringBuilder sb = new StringBuilder();
					while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
						sb.appendCodePoint(b);
						b = readByte();
					}
					return sb.toString();
				}
				
				private char[] ns(int n)
				{
					char[] buf = new char[n];
					int b = skip(), p = 0;
					while(p < n && !(isSpaceChar(b))){
						buf[p++] = (char)b;
						b = readByte();
					}
					return n == p ? buf : Arrays.copyOf(buf, p);
				}
					
				private char[][] nm(int n, int m)
				{
					char[][] map = new char[n][];
					for(int i = 0;i < n;i++)map[i] = ns(m);
					return map;
				}
				
				private int[] na(int n)
				{
					int[] a = new int[n];
					for(int i = 0;i < n;i++)a[i] = ni();
					return a;
				}
				
				private int ni()
				{
					int num = 0, b;
					boolean minus = false;
					while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
					if(b == '-'){
						minus = true;
						b = readByte();
					}
					
					while(true){
						if(b >= '0' && b <= '9'){
							num = num * 10 + (b - '0');
						}else{
							return minus ? -num : num;
						}
						b = readByte();
					}
				}
				
				private long nl()
				{
					long num = 0;
					int b;
					boolean minus = false;
					while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
					if(b == '-'){
						minus = true;
						b = readByte();
					}
					
					while(true){
						if(b >= '0' && b <= '9'){
							num = num * 10 + (b - '0');
						}else{
							return minus ? -num : num;
						}
						b = readByte();
					}
				}
				
				private void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
			}