import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
//		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]) - 1;
		int b = Integer.parseInt(sa[2]) - 1;
		int c = Integer.parseInt(sa[3]) - 1;
		int d = Integer.parseInt(sa[4]) - 1;
		char[] s = br.readLine().toCharArray();
		br.close();

		for (int i = b + 1; i < d; i++) {
			if (s[i - 1] == '#' && s[i] == '#') {
				System.out.println("No");
				return;
			}
		}
		for (int i = a + 1; i < c; i++) {
			if (s[i - 1] == '#' && s[i] == '#') {
				System.out.println("No");
				return;
			}
		}
		if (c > d) {
			for (int i = b + 1; i <= d + 1; i++) {
				if (s[i - 2] == '.' && s[i - 1] == '.' && s[i] == '.') {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
