import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Affine Cipher
 */
public class Main {

	static final int[] alpha = {3, 5, 7, 9, 11, 15, 17, 19, 21, 23};
	static final int beta = 26;
	static final char[][] hint = {{'t', 'h', 'i', 's'}, {'t', 'h', 'a', 't'}};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			int[] c = cipher(s);
			char[] d = new char['z' + 1];
			for (char j = 'a'; j <= 'z'; j++) {
				d[(char) (((c[0] * (j - 'a') + c[1]) % 26) + 'a')] = j;
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ' ') {
					sb.append(' ');
				} else {
					sb.append(d[s.charAt(j)]);
				}
			}
			System.out.println(sb.toString());
		}
	}

	static int[] cipher(String s) {

		StringTokenizer st = new StringTokenizer(s);

		int[] ret = new int[2];

		while (st.hasMoreTokens()) {

			String w = st.nextToken();

			if (w.length() == 4) {
				outer:
				for (int a = 0; a < alpha.length; a++) {
					for (int b = 0; b < beta; b++) {
						String thi = "";
						String tha = "";
						for (int i = 0; i < hint[0].length; i++) {
							thi += (char) (((alpha[a] * (hint[0][i] - 'a') + b) % 26) + 'a');
							tha += (char) (((alpha[a] * (hint[1][i] - 'a') + b) % 26) + 'a');
						}
						if (w.equals(thi) || w.equals(tha)) {
							ret[0] = alpha[a];
							ret[1] = b;
							break outer;
						}
					}
				}
			}
		}

		return ret;
	}
}