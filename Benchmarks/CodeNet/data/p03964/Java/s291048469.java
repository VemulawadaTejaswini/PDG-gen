import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class atcoder_46_C {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
					
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		long arr[][] = new long[n][n];
		for(int i=0;i<n;i++) {
			arr[i][0] = ob.nextLong();
			arr[i][1]=ob.nextLong();
		}
		
		for (int i = 1; i < arr.length; i++) {
			long k1=1,k2=1;
			if(arr[i-1][0]>arr[i][0]) {
				k1=(arr[i-1][0]/arr[i][0]);
				if(arr[i-1][0]%arr[i][0]!=0) {
					k1++;
				}
			}
			if(arr[i-1][1]>arr[i][1]) {
				k2=(arr[i-1][1]/arr[i][1]);
				if(arr[i-1][1]%arr[i][1]!=0) {
					k2++;
				}
			}
			k1=Math.max(k1, k2);
			arr[i][0]*=k1;
			arr[i][1]*=k1;
			//System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		System.out.println(arr[n-1][0]+arr[n-1][1]);
	}
}
