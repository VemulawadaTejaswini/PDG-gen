
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		int m=s.nextInt();
		int v=s.nextInt();
		int p=s.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		int[] defeat = new int[n];
		boolean[] helper = new boolean[n];
		for(int i=0;i<n;i++) {
			defeat[i]=bs(arr,arr[i]+m);
			if(defeat[i]==0) {
				helper[i]=true;
			}
		}
		boolean[] check = new boolean[n];
		int ans= p;
		for(int i=p;i<n;i++) {
			int before = i- p +1;
			before = n- before;
			if(arr[i]==arr[p-1]) {
				ans++;
				check[i]=true;
				continue;
			}
			if(before>=v) {
				int current = m + arr[i];
				if(current>=arr[p-1]) {
					check[i]=true;
					ans++;
				}
			}else {
				if(helper[i]) {
					ans++;
				}
			}
			if(!check[i] && check[i-1] && arr[i]==arr[i-1]) {
				ans++;
				check[i]=true;
			}
		}
		out.println(ans);
	}

	public static int bs(Integer[] arr,int val) {
		int start = 0;
		int end = arr.length-1;
		int ans = arr.length-1;
		while(start<=end) {
			int mid  = (start+end)>>1;
			if(arr[mid]<=val) {
				ans = mid;
				end = mid-1;
			}else {
				start=mid+1;
			}
		}
		return ans;
	}
	
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
