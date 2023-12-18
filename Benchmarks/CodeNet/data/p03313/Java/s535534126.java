import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int arr[] = new int[1 << n];
		for (int i = 0 ; i < (1 << n) ; ++i) {
			arr[i] = sc.nextInt();
		}
		Comparator<Integer> byArrayValue = (Integer a, Integer b) -> arr[a] - arr[b];
		ArrayList<Integer>[] res = new ArrayList[1 << n];
		for (int i = 0 ; i < (1 << n) ; ++i) {
			res[i] = new ArrayList();
			res[i].add(i);
		}
		for (int msk = 0 ; msk < (1 << n) ; ++msk) {
			for (int i = 0 ; i < n ; ++i) {

				if ( (msk & (1 << i)) == 0) {
					int next = msk | (1 << i);

					for (int j = 0 ; j < res[msk].size() ; ++j) {
						if (!res[next].contains(res[msk].get(j))) {
							res[next].add(res[msk].get(j));
						}
					}
					Collections.sort(res[next],byArrayValue);
					while (res[next].size() > 2) {
						res[next].remove(0);
					}
				}
			}
		}

		int ans[] = new int[1 << n];
		for (int i = 0 ; i < (1 << n) ; ++i) {
			if (res[i].size() == 2) {
				ans[i] = arr[res[i].get(0)] + arr[res[i].get(1)];
			}
			if (i > 0) {
				ans[i] = Math.max(ans[i], ans[i - 1]);
			}
		}

		for (int i = 1 ; i < (1 << n) ; ++i) {
			out.print(ans[i]+" ");
		}
		out.flush();
		out.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}