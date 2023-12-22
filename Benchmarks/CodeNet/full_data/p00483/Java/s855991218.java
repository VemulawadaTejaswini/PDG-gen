import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			Scanner sc = new Scanner(line);
			int m, n, k;
			m = sc.nextInt();
			n = sc.nextInt();
			k = Integer.parseInt(br.readLine());

			char[][] map = new char[m + 1][n + 1];
			for (int i = 1; i < m + 1; i++) {
				line = br.readLine();
				for (int j = 1; j < n + 1; j++) {
					map[i][j] = line.charAt(j - 1);
				}
			}
			for (int i = 0; i < k; i++) {
				sc = new Scanner(br.readLine());
				int a, b, c, d, J = 0, O = 0, I = 0;
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				for (int j = a; j <= c; j++) {
					for (int l = b; l <= d; l++) {
						switch (map[j][l]) {
							case 'J':
								J++;
								break;
							case 'O':
								O++;
								break;
							case 'I':
								I++;
								break;
						}
					}
				}
				System.out.println(J + " " + O + " " + I);
			}
		}
	}

}

class Scanner {
	private StringTokenizer st;

	Scanner(String line) {
		st = new StringTokenizer(line);
	}

	int nextInt() {
		return Integer.parseInt(st.nextToken());
	}
}