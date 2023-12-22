import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

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
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < m; i++) {
			pw.println((i + 1) + " " + (n - i));
		}
		pw.flush();
	}

}
