
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static int[] f = new int[1000001];

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n =sc.nextInt(),k=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ans=0;
		for(int i=0;i<k;i++)ans+=Math.abs(arr[i]);
		int pre=0,pre1=ans;
		for(int i=k;i<n-k+1;i++){
			  pre1=(pre1-Math.abs(arr[pre++])+Math.abs(arr[i]));
			 if(pre1<ans)ans=pre1;
		}
//		System.out.println(ans);
		int ans2=0;
		for(int i=n-1;i>=n-k;--i)ans2+=Math.abs(arr[i]);
		pre=n-1;
		int pre2=ans2;
		for(int i=n-k+1;i>=0;i--){
			if(i<arr.length)
				pre2=pre2-Math.abs(arr[pre--])+Math.abs(arr[i]);
			if(pre2<ans2)ans2=pre2;
		}
		System.out.println(Math.min(ans, ans2));
		
		
	}

}
