import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Monday-Saturday Prime Factors
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		boolean[] ns = new boolean[300000];
		for (int i = 0; ; i++) {
			int m = i * 7 + 1;
			int s = i * 7 + 6;
			if (m < ns.length) ns[m] = true;
			else break;
			if (s < ns.length) ns[s] = true;
			else break;
		}
		ns[1] = false;
		//System.out.println(ns[299998]);

		for (int i = 6; i < ns.length; i++) {
			if (ns[i]) {
				for (int j = 2; j < ns.length / i; j++) {
					ns[i * j] = false;
				}
			}
		}

		List<Integer> ps = new ArrayList<>();
		for (int i = 0; i < ns.length; i++) {
			if (ns[i]) ps.add(i);
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 1) break;

			StringBuilder sb = new StringBuilder();
			sb.append(n + ":");

			for (int i : ps) {
				if (n % i == 0) sb.append(" " + i);
			}
			System.out.println(sb.toString());

		}//end while
	}//end main
}