import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Elementary Number Theory - Least Common 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);

			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = 1;
			for (int i = 0; i < n; i++) {
				m = lcm(m, parseInt(st.nextToken()));
			}
			System.out.println(m);

		}//end while
	}//end main

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}