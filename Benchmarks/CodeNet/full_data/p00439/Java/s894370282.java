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

		int n, k, sum = 0, max1 = 0, max2 = 0;
		short[] list;

		while (!(line = br.readLine()).equals("0 0")) {
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			list = new short[n];
			for (int i = 0; i < n; i++) {
				list[i] = Short.parseShort(br.readLine());
			}
			max1 = 0;
			for (int i = 0; i < k; i++) {
				max1 += list[i];
			}
			sum = max1;
			for (int i = k; i < n; i++) {
				sum = sum - list[i - k] + list[i];
				if (sum > max1)
					max1 = sum;
			}
			max2 = max1 > max2 ? max1 : max2;
		}
		System.out.println(max2);
	}
}