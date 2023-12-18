import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		int N = S.length();
		char[] s = new char[N];
		boolean wrongS = false;

		for (int i = 0; i < N; i++) {
			s[i] = S.charAt(i);
		}

		for (int i = 0; i < (N - 1)/2; i++) {
			if (s[i] != s[N-1 - i]) {
				wrongS = true;
				break;
			}
		}

		if (wrongS) {
			System.out.println("No");
			return;
		}

		for (int i = 0; i < (N + 1) / 4; i++) {
			if (s[i] != s[N/2 -1 - i]) {
				wrongS = true;
				break;
			}

		}

		if (wrongS) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

	}

}
