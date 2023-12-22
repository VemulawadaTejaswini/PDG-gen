import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) {
		FastScanner in = new FastScanner();
		char s1[]=in.next().toCharArray();
		char s2[]=in.next().toCharArray();
		int n1=s1.length;
		int n2=s2.length;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<=n1-n2;i++) {
			int ctr=0;
			for(int j=0;j<n2;j++) {
				if(s1[i+j]!=s2[j]) {
					ctr++;
				}
			}
			ans=Math.min(ans, ctr);
		}
		System.out.println(ans);
	}

	///////////////////////////
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
