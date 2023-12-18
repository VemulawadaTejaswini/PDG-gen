import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int white[] = new int[n + 1];
		int black[] = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			int bCount = 0;
			int wCount = 0;
			for (int j = 0; j < n; j++) {
				if (j < i) {
					if (str[j].equals("#")) {
						bCount++;
					}
				} else {
					if (str[j].equals(".")) {
						wCount++;
					}
				}
			}
			white[i] = wCount;
			black[i] = bCount;
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < n + 1; i++) {
			ans = Math.min(ans, black[i] + white[i]);
		}

		System.out.println(ans);
	}
}
