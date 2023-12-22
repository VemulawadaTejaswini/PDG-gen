import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem J: Kobutanukitsuneko
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			int[] sta = new int[26];
			int[] end = new int[26];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int s, e;
				s = line.charAt(0) - 'a';
				e = line.charAt(line.length() - 1) - 'a';
				sta[s]++;
				end[e]++;
				sta[e]--;
				end[s]--;
			}

			int sums = 0, sume = 0;
			for (int i = 0; i < sta.length; i++) {
				sums += sta[i];
			}
			for (int i = 0; i < end.length; i++) {
				sume += end[i];
			}
			System.out.println((sums | sume) == 0 ? "OK" : "NG");
		}
	}
}