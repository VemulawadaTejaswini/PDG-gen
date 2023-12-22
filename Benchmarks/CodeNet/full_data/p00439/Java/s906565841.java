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

		int n, k, sum, max;
		int[] list;

		while (!(line = br.readLine()).equals("0 0")) {
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(br.readLine());
			}
			max = 0;
			for (int i = 0; i < k; i++) {
				max += list[i];
			}
			sum = max;
			for (int i = k; i < n; i++) {
				sum = sum - list[i - k] + list[i];
				if (sum > max)
					max = sum;
			}
			System.out.println(max);
		}
	}
}