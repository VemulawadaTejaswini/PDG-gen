import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Common Sub-String
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			char[] s1 = line.toCharArray();
			char[] s2 = br.readLine().toCharArray();

			int[][] cs = new int[s2.length][s1.length];

			//
			for (int i = 0; i < s1.length; i++) {
				if (s1[i] == s2[0]) cs[0][i] = 1;
			}

			for (int i = 0; i < s2.length; i++) {
				if (s2[i] == s1[0]) cs[i][0] = 1;
			}

			int max = 0;
			for (int i = 1; i < s2.length; i++) {
				for (int j = 1; j < s1.length; j++) {
					if (s2[i] == s1[j]) {
						cs[i][j] = cs[i - 1][j - 1] + 1;
						max = Math.max(max, cs[i][j]);
					}
				}
			}
			System.out.println(max);

		}//end while
	}//end main
}