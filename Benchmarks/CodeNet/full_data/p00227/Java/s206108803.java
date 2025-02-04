/*
 * Thanksgiving
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0 0")) {
				break;
			}

			int n, m;
			int[] p;
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			p = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				p[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(p);

			int mod = n % m, sum = 0;
			for (int i = 0; i < n; i++) {
				if (n < m || i < mod || (i - mod) % m != 0) {
					sum += p[i];
				}
			}
			System.out.println(sum);
		}

	}

}