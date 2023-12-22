import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Eleven Lover
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;

			int[] num = new int[line.length() + 2];
			int[] sum = new int[line.length() + 2];

			for (int i = 2; i < line.length(); i++) {
				num[i] = line.charAt(i - 2) - '0';
				sum[i] = num[i] + sum[i - 2];
			}

			int count = 0;
			for (int i = 2; i < num.length - 2; i++) {
				if (num[i] == 0) continue;
				for (int j = i + 2; j < num.length; j++) {
					int diff = 0;
					if (j - i % 2 == 0) {
						diff = (sum[j] - sum[i - 2]) - (sum[j - 1] - sum[i - 1]);
					} else {
						diff = (sum[j] - sum[i - 1]) - (sum[j - 1] - sum[i - 2]);
					}
					if (diff % 11 == 0 || diff == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main
}