import java.io.*;
import java.util.*;

public class Main {

	static long m = (long) (1e9 + 7);
	static String arr[];
	static int count = 0;

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scn.nextInt();
		arr = new String[fact(n)];
		String a = "", b = "";
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scn.nextInt();
			a += arr1[i];
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
			b += arr2[i];
		}
		String num = "";
		for (int i = 1; i <= n; i++) 
			num += i;
		StringBuilder s1 = new StringBuilder(num);
		permute(s1, 0, n - 1, arr);
		int k = fact(n);
		Arrays.sort(arr);
		int index1 = 0, index2 = 0;
		for (int i = 0; i < k; i++) {
			if (arr[i].compareTo(a) == 0)
				index1 = i + 1;
			if (arr[i].compareTo(b) == 0)
				index2 = i + 1;
		}
		System.out.println(Math.max(index2, index1) - Math.min(index1, index2));
	}

	static StringBuilder swap(int i1, int i2, StringBuilder s) {
		char temp1 = s.charAt(i1), temp2 = s.charAt(i2);
		s.setCharAt(i1, temp2);
		s.setCharAt(i2, temp1);
		return s;
	}

	static void permute(StringBuilder s, int l, int r, String arr[]) {
		if (l == r) {
			arr[count] = s.toString();
			count++;
		} else {
			for (int i = l; i <= r; i++) {
				s = swap(i, l, s);
				permute(s, l + 1, r, arr);
				s = swap(l, i, s);
			}
		}
	}

	static int fact(int a) {
		if (a == 1 || a == 0)
			return 1;
		return a * fact(a - 1);
	}

	static class Scanner {

		StringTokenizer st;
		BufferedReader br;

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
	}
}