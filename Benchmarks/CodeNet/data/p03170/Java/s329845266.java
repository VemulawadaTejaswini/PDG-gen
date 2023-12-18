
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		int k=s.nextInt();
//		memo=new boolean[k+1];
//		visited = new boolean[k+1];
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
//		boolean ans = winOrLoss(k, arr, false);
		boolean[] helper = new boolean[k+1];
		helper[0]=true;
		for(int i=1;i<=k;i++) {
			boolean ans = false;
			for(int j=0;j<n;j++) {
				if(i-arr[j]>0) {
					ans |= !helper[i-arr[j]];
				}else if(i-arr[j]==0){
					ans |=true ;
				}
			}
			helper[i]=ans;
		}
		if(!helper[k]) {
			out.println("Second");
		}else {
			out.println("First");
		}
	}

//	public static boolean[] memo;
//	public static boolean[] visited;
//	public static boolean winOrLoss(int k,int[] arr, boolean chance) {
//		if(k<0) {
//			return true;
//		}
//		if(k==0) {
//			return false;
//		}
//		if(visited[k]) {
//			return memo[k];
//		}
//		boolean ans = false;
//		int n=arr.length;
//		for(int i=0;i<n;i++) {
//			ans |= !winOrLoss(k-arr[i], arr, !chance);
//		}
//		visited[k]=true;
//		memo[k]=ans;
//		return ans;
//	}
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
