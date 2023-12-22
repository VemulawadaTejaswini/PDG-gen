import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Main {

	static Map<String, int[]> dirs = new HashMap<String, int[]>() {
		{
			put("North", new int[]{1, 5, 2, 3, 0, 4});
			put("East", new int[]{3, 1, 0, 5, 4, 2});
			put("West", new int[]{2, 1, 5, 0, 4, 3});
			put("South", new int[]{4, 0, 2, 3, 5, 1});
			put("Right", new int[]{0, 2, 4, 1, 3, 5});
			put("Left", new int[]{0, 3, 1, 4, 2, 5});
		}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			int n = parseInt(line);
			if (n == 0) break;

			int[] dice = {1, 2, 3, 4, 5, 6};
			int sum = dice[0];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int[] temp = new int[6];
				for (int j = 0; j < 6; j++) {
					temp[j] = dice[dirs.get(line)[j]];
				}
				dice = temp;
				sum += dice[0];
			}
			System.out.println(sum);
		}
	}
}