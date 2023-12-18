import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String S = in.readLine();

		int win = 0;
		int lose = 0;
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == 'o') {
				++win;
			} else {
				++lose;
			}
		}
		if (lose < 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
