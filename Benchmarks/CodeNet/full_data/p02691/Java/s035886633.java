import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br;
	static PrintWriter pw;
	static int[][] memo;
	static int[] arr;
	static ArrayList<Integer> index;
	static int n;

	static short dp(int idx, int c) {
		if (c == n)
			return 1;
		if (idx == index.size() || c > n)
			return 0;
		if (memo[idx][c] != -1)
			return (short) memo[idx][c];
		short t = 0;
		short l = dp(idx + 1, c);
		if (idx == 0) {
			t = dp(idx + 1, c + 2 * n - index.get(idx));
		} else {
			t = dp(idx + 1, c + index.get(idx - 1) - index.get(idx));
		}
		return (short) (memo[idx][c] = l | t);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		br = new BufferedReader(new FileReader(new File("input.txt")));
//		pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int t = i + 1 - arr[i];
			ans += hm.getOrDefault(t, 0);
			hm.put(i + 1 + arr[i], hm.getOrDefault(i + 1 + arr[i], 0) + 1);
		}
		pw.println(ans);

		pw.flush();

	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		public int compareTo(pair o) {
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return x + " " + y;
		}

	}

}
