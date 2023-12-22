import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Maximum Sum
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n, k, sum = 0, max = 0;
		short[] list;

		while ((line = br.readLine()) != null) {
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			list = new short[n];
			for (int i = 0; i < n; i++) {
				list[i] = Short.parseShort(br.readLine());
			}
			for (int i = 0; i < k; i++) {
				max += list[i];
			}
			for (int i = k; i < n; i++) {
				sum = max - list[i - k] + list[i];
				if (sum > max)
					max = sum;
			}
			System.out.println(max);
		}

	}
}