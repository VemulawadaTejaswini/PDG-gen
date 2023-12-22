import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
	
	static long mod = (int)1e9 + 7;
	

	public static void main(String[] args) throws Exception{

		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = fs.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) arr[i]= fs.nextLong();
		
		long sum = 0;
		long sSum = 0;
		for(long l: arr) {
			sum = (sum+l)%mod;
			sSum = (sSum + (l*l)%mod)%mod;
		}
		
		long ans = ((((sum*sum)%mod - sSum + mod)%mod)*(exp(2L,mod-2)%mod))%mod;
		
		out.println(ans);
		
		out.close();
		
		

		
	}
	
	static long exp(long a,long n) {
		long res = 1L;
		while(n>0) {
			if((n&1)==1) {
				res = (res*a)%mod;
			}
			a = (a*a)%mod;
			n = n>>1;
		}
		return res;
	}
	
	
	
	
	
	static class FastScanner{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		public String next(){
			while(!st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		public String nextLine() throws IOException {
			return br.readLine();
		}
		
		public int nextInt(){
			return Integer.parseInt(next());
		}

		public int[] readArray(int n){
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	


}