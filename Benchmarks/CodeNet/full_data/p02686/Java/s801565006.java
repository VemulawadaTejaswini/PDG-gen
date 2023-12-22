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
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static int[] dx = new int[] { -1, 0, 1, 0, -1, -1, 1, 1 };
	static int[] dy = new int[] { 0, 1, 0, -1, -1, 1, -1, 1 };
	static int A, B, C;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[] s = new String[n];
		ArrayList<pair> arr = new ArrayList<>();
		ArrayList<pair> arrNeg = new ArrayList<>();
		int cf = 0;
		for (int i = 0; i < s.length; i++) {
			s[i] = br.readLine();
			char[] a = s[i].toCharArray();
			int c = 0;
			int A = Integer.MIN_VALUE;
			int B = Integer.MAX_VALUE;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == ')') {
					c++;
				} else {
					c--;
				}
				A = Math.max(A, c);
			}
			c = 0;
			for (int j = a.length - 1; j >= 0; j--) {
				if (a[j] == '(') {
					c++;
				} else {
					c--;
				}
				B = Math.min(A, c);
			}
			if (B - A >= 0)
				arr.add(new pair(i, B - A));
			else
				arrNeg.add(new pair(i, B - A));
		}
		boolean f = true;
		Collections.sort(arr);
		Collections.sort(arrNeg, Collections.reverseOrder());
		for (pair p : arr) {
			char[] a = s[p.x].toCharArray();
			for (int j = 0; j < a.length; j++) {
				if (a[j] == '(') {
					cf++;
				} else {
					cf--;
				}
				f &= cf >= 0;
			}
		}
		for (pair p : arrNeg) {
			char[] a = s[p.x].toCharArray();
			for (int j = 0; j < a.length; j++) {
				if (a[j] == '(') {
					cf++;
				} else {
					cf--;
				}
				f &= cf >= 0;
			}
		}
		pw.println(f && cf == 0 ? "Yes" : "No");
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
				return y - o.y;
		}

	}

}
