import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Palindromic Number
 */
public class Main {

	static boolean[] palindrom = new boolean[10002];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		//1,11
		for (int i = 0; i <= 9; i++) {
			palindrom[i] = true;
			palindrom[i * 10 + i] = true;
		}

		//101,111
		for (int i = 1; i <= 9; i++) {
			int p = i * 101;
			palindrom[p] = true;
			for (int j = 0; j <= 9; j++) {
				int q = p + j * 10;
				palindrom[q] = true;
			}
		}

		//1001,1111
		for (int i = 1; i <= 9; i++) {
			int p = i * 1001;
			palindrom[p] = true;
			for (int j = 0; j <= 9; j++) {
				int q = p + j * 100 + j * 10;
				palindrom[q] = true;
			}
		}

		palindrom[10001] = true;

		int n = parseInt(br.readLine());
		int ans = 0;

		for (int i = 0; ; i++) {
			if (palindrom[n - i]) {
				ans = n - i;
				break;
			}
			if (palindrom[n + i]) {
				ans = n + i;
				break;
			}
		}

		System.out.println(ans);

	}
}