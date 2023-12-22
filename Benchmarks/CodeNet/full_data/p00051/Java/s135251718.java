import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static int n;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		String line;
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			char[] s = line.toCharArray();
			char[] rev = new char[s.length];
			Arrays.sort(s);
			for (int j = 0; j < s.length; j++) {
				rev[j] = s[s.length - j - 1];
			}

			int a = Integer.parseInt(String.valueOf(s));
			int b = Integer.parseInt(String.valueOf(rev));
			System.out.println(b - a);
		}

	}
}