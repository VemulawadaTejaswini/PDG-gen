import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		long m, n, p1, p2, pt, j;
		StringTokenizer stp, stj;

		while ((line = br.readLine()) != null) {

			m = n = Integer.parseInt(line);
			stp = new StringTokenizer(br.readLine());
			stj = new StringTokenizer(br.readLine());

			p1 = Integer.parseInt(stp.nextToken());
			pt = p1;
			for (int i = 0; i < n - 1; i++) {
				p2 = Integer.parseInt(stp.nextToken());
				j = Integer.parseInt(stj.nextToken());
				if ((pt + j + p2) * (m - 1) > (pt + p2) * m) {
					pt += (j + p2);
					m--;
				} else {
					pt += p2;
				}
				p1 = p2;
			}
			System.out.println(pt * m);
		}

	}
}