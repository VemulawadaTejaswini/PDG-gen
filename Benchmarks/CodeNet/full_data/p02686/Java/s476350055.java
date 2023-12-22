import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		Pair[] arr = new Pair[n];
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			int total = 0;
			int min = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(')
					total++;
				else
					total--;
				min = Math.min(min, total);
			}
			arr[i] = new Pair(min, total);
		}
		int score = 0;
		Arrays.sort(arr, (a, b) -> b.min - a.min);
		int idx = 0;
		boolean[] used = new boolean[n];
		while (idx < n) {
			if (score + arr[idx].min >= 0) {
				if (arr[idx].total >= 0) {
					used[idx] = true;
					score += arr[idx].total;
				}
			} else
				break;
			idx++;
		}
		idx = n - 1;
		while (idx >= 0) {
			if (used[idx]) {
				idx--;
				continue;
			} else if (score + arr[idx].min >= 0) {
				used[idx] = true;
				score += arr[idx].total;
			}
			idx--;
		}
		boolean allused = true;
		for (int i = 0; i < used.length; i++) {
			allused &= used[i];
		}
		if (allused && score == 0) {
			pw.println("Yes");
		} else
			pw.println("No");
		pw.close();

	}

	static class Pair {
		int min, total;

		public Pair(int min, int total) {
			this.min = min;
			this.total = total;
		}

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
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

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
