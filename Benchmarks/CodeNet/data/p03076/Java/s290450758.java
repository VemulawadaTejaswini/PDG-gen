import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//		String line = reader.readLine();
		//		String[] str = reader.readLine().split(" ");
		//		int[] ab = new int[str.length];
		//		for (int i = 0; i < str.length; i++) {
		//			ab[i] = Integer.parseInt(str[i]);
		//		}

		int min = 100;
		int sum = 0;
		int[] abc = new int[5];
		for (int i = 0; i < 5; i++) {
			String line = reader.readLine();
			abc[i] = Integer.parseInt(line);
			if (abc[i] %10 == 0) {
				sum += abc[i] / 10 * 10;
			}
			else {
				sum += (abc[i] / 10 + 1) * 10;
				if (abc[i] % 10 < min) {
					min = abc[i] % 10;
				}
			}
		}
		if (min == 100) {
			min = 10;
		}
		sum -= (10-min);
		System.out.println(sum);
	}
}