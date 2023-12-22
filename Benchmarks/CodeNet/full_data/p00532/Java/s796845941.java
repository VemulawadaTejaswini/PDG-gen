import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Christmas Party
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int N = parseInt(br.readLine());
		int[] points = new int[N + 1];

		int M = parseInt(br.readLine());
		int[] targets = new int[M];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			targets[i] = parseInt(st.nextToken());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int a = parseInt(st.nextToken());
				if (a == targets[i]) {
					points[j + 1]++;
				} else {
					points[targets[i]]++;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < N + 1; i++) {
			sb.append(points[i]).append("\n");
		}
		System.out.print(sb.toString());
	}
}