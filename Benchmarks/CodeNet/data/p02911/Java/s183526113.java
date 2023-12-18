import java.io.*;
import java.util.*;

public class Main {
	static int a, b, c;

	public static void main(String[] args) {
		try {
			BufferedReader br = createBufferedReader();
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			final int N = Integer.parseInt(st.nextToken());
			final int K = Integer.parseInt(st.nextToken());
			final int Q = Integer.parseInt(st.nextToken());
			int[] a = new int[Q];
			int[] points = new int[N];
			for (int i = 0; i < N; i++) {
				points[i] = K;
			}
			for (int i = 0; i < Q; i++) {
				a[i] = Integer.parseInt(br.readLine());
				points[a[i] - 1]++;
				for (int j = 0; j < N; j++) {
					points[j]--;
				}
			}
			for (int i = 0; i < N; i++) {
				System.out.println(points[i] > 0 ? "Yes" : "No");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			System.err.println("入力が正しくありません。");
		}
	}

	private static int min(final int a, final int b) {
		return (a < b) ? a : b;
	}

	// 以下問題問わずに共通部分
	// 標準入力の BufferedReader を返す.
	private static BufferedReader createBufferedReader() {
		InputStreamReader isr = new InputStreamReader(System.in);
		return new BufferedReader(isr);
	}
}
