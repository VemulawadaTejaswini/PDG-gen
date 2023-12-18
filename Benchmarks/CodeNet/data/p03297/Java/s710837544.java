import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] line = br.readLine().split(" ");
			long a = Long.parseLong(line[0]);
			long b = Long.parseLong(line[1]);
			long c = Long.parseLong(line[2]);
			long d = Long.parseLong(line[3]);
			if (d < b) {
				System.out.println("No");
				continue;
			}
			if (a < b) {
				System.out.println("No");
				continue;
			}

			long hiru = a % b;
			long zoubun = d % b;

			if (zoubun == 0) {
				if (c < hiru) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
				continue;
			}

			if ((b - hiru) % zoubun == 0) {
				hiru = ((b - hiru) / zoubun - 1) * zoubun + hiru;
			} else {
				hiru = (b - hiru) / zoubun * zoubun + hiru;
			}

			if (c < hiru) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}

}