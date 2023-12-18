import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] dx = new int[] { -1, 0, 1, 0, -1, -1, 1, 1 };
	static int[] dy = new int[] { 0, 1, 0, -1, -1, 1, -1, 1 };
	static int A, B, C;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		a = new int[n];
		ans = new int[n];
		l = new int[n];
		adj = new ArrayList[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			adj[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken()) - 1;
			adj[u].add(v);
			adj[v].add(u);
		}
		dfs(0, -1, 0);
		for (int i = 0; i < ans.length; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static int n, m;
	static boolean[][] vis;
	static int[] a, ans, l;
	static ArrayList<Integer>[] adj;
	static ArrayList<Integer> L = new ArrayList<Integer>();

	static void dfs(int u, int p, int lis) {
		int idx = binSh(a[u], lis);
		idx++;
		if (idx == lis) {
			lis++;
		}
		int temp = l[idx];
		l[idx] = a[u];
		ans[u] = lis;
		for (int x : adj[u]) {
			if (x != p)
				dfs(x, u, lis);
		}
		l[idx] = temp;
	}

	static int binSh(int val, int lis) {
		int ans = -1;
		int s = 0;
		int e = lis - 1;
		while (s <= e) {
			int mid = s + e >> 1;
			if (l[mid] < val) {
				ans = mid;
				s = mid + 1;
			} else
				e = mid - 1;
		}
		return ans;
	}

//	5
//	699987654 570044284 602693693 585497124 680075708
//	1 3
//	1 4
//	1 5
//	2 1

//	static int lis(int[] A, int n) // Can be implemented with TreeSet (lower, remove, add)
//	{
//		int[] P = new int[n];
//		int[] L_id = new int[n];
//
//		for (int i = 0; i < n; ++i) {
//			int pos = Collections.binarySearch(L, A[i]);
//			if (pos < 0)
//				pos = -(pos + 1);
//
//			if (pos >= L.size())
//				L.add(A[i]);
//			else
//				L.set(pos, A[i]);
//
//			if (pos + 1 > lis) {
//				lis = pos + 1;
//				lis_end = i;
//			}
//
//			// lis_end and the following part for printing the solution
//			L_id[pos] = i;
//			P[i] = pos > 0 ? L_id[pos - 1] : -1;
//		}
//		return lis;
//	}

}
