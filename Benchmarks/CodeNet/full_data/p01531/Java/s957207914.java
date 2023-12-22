import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Flick Input
 */
public class Main {

	static final char[] cs = {'w', '_', 'k', 's', 't', 'n', 'h', 'm', 'y', 'r'};
	static final char[] vs = new char['U' + 1];

	static {
		vs['T'] = 'a';
		vs['L'] = 'i';
		vs['U'] = 'u';
		vs['R'] = 'e';
		vs['D'] = 'o';
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		String ans = "";
		
		line = br.readLine();

		for (int i = 0; i < line.length(); i += 2) {
			char c, v;
			c = cs[line.charAt(i) - '0'];
			v = vs[line.charAt(i + 1)];

			ans += c;
			ans += v;

		}

		ans = ans.replace("_", "");
		ans = ans.replace("wu", "nn");

		System.out.println(ans);

	}
}