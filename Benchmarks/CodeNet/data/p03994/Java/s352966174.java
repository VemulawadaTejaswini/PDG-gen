import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char c[] = br.readLine().toCharArray();

		long k = Long.parseLong(br.readLine());

		String ans = "";

		for (int i = 0; i < c.length - 1; i++) {
			int dist = 26 - (c[i] - 'a');

			if (k > dist) {
				ans += "a";
				k -= dist;
			} else {
				ans += c[i];
			}
		}

		char alph[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		if (k > 0) {
			ans += alph[(int) (k % 26) + (c[c.length - 1] - 'a')];
		} else {
			ans += c[c.length - 1];
		}

		System.out.println(ans);
	}

}