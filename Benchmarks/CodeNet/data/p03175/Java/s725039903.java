
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		map = undirected(n);
		long[] ans = dfs(1, -1);
		System.out.println( (ans[0] + ans[1] ) %mod);
	}

	static long mod = 1000000007;
	static TreeMap<Integer, ArrayList<Integer>> map;

	public static long[] dfs(int cur, int par) {
		if (map.get(cur).size() == 0) {

			long[] ans = { 1, 1 };
			return ans;
		}

		long[] ans = { 1, 1 };
		for (int nbr : map.get(cur)) {
			if (nbr == par)
				continue;
			long[] temp = dfs(nbr, cur);
			long w = (temp[0] + temp[1])%mod;
			long b = temp[0]%mod;
			ans[0] = (ans[0] *  w )%mod;
			ans[1] = (ans[1] *b)%mod;
		}

		// System.out.println(ans[0]+" "+ans[1]);

		return ans;
	}

	public static TreeMap<Integer, ArrayList<Integer>> undirected(int n) throws Exception {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		for (int i = 1; i <= n; i++)
			map.put(i, new ArrayList<Integer>());
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		return map;
	}

	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}

	public static int[][] input(int n, int m) throws Exception {

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
