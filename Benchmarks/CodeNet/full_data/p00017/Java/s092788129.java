import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		StringBuilder sb  = new StringBuilder();
		while ((s = br.readLine()) != null) {
			for (int k = 1; k <= 26; k++) {
				sb = new StringBuilder();
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == ' ') {
						sb.append(" ");
					} else if (s.charAt(i) == '.') {
						sb.append(".");
					} else if (s.charAt(i) + k > (int) 'z') {
						sb.append((char) ((int) 'a' - 1 + (s.charAt(i) + k - (int) 'z')));

					} else {
						sb.append((char) (s.charAt(i) + k));
					}
				}
				if (sb.indexOf("the") != -1 || sb.indexOf("this") != -1 || sb.indexOf("that") != -1) {
					break;
				}

			}
			System.out.println(sb.toString());
		}
	}

}