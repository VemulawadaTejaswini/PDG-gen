import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MasonsMark {

	static int n, m;
	static char[][] a;
	static boolean[][] ok;
	static int[] dx = new int[] { -1, 0, 1, 0, -1, -1, 1, 1 };
	static int[] dy = new int[] { 0, 1, 0, -1, -1, 1, -1, 1 };
	static int A, B, C;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (n % 2 == 1) {
			for (int i = 1; i <= m; i++) {
				pw.println(i + " " + (n - i + 1));
			}
		} else {
			int odd = (m + 1) / 2;
			for (int i = 1; i <= odd ; i++) {
				pw.println(i + " " + (n - i + 1));
			}
			for (int i = odd+1; i <= m; i++) {
				pw.println(i + " " + (n - i));
			}
		}

		pw.flush();
	}

}
