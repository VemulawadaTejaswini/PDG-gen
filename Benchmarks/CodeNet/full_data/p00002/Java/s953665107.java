import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String s;
		try {
			s = br.readLine();

			StringTokenizer st;

			while (!("EOF".equals(s))
					|| s != null) {
				st = new StringTokenizer(s, " ");
				int p = Integer.parseInt(st
						.nextToken()) + Integer
								.parseInt(st
										.nextToken());

				System.out.println((int) Math
						.log10(p)
						+ 1);
				s = br.readLine();

			}

		} catch (IOException e) {
			System.exit(0);
		}

	}
}