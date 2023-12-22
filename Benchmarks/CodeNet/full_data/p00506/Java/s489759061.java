import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n = parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int g = parseInt(st.nextToken());

		for (int i = 0; i < n - 1; i++) {
			g = gcd(g, parseInt(st.nextToken()));
		}

		for (int i = 1; i <= g; i++) {
			if (g % i == 0) {
				System.out.println(i);
			}
		}
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

}