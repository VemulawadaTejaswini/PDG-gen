import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Al dente
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N, T, E, minT, maxT;
		N = parseInt(st.nextToken());
		T = parseInt(st.nextToken());
		E = parseInt(st.nextToken());
		minT = T - E;
		maxT = T + E;

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {

			int x, minX, maxX;
			x = parseInt(st.nextToken());
			minX = (T / x) * x;
			maxX = minX + x;

			if ((minT <= minX && minX <= maxT) || (minT <= maxX && maxX <= maxT)) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(-1);
	}
}