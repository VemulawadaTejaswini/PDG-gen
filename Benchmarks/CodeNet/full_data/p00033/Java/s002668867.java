
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		for (int j = 0; j < n; j++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int[] nums = new int[10];
			int count = 0;
			for (int i = 0; i < 10; i++) {
				nums[i] = Integer.parseInt(tokenizer.nextToken());
				if (i != 0) {
					if (nums[i - 1] > nums[i]) {
						count++;
						if (count == 2) {
							break;
						}
					} else {
						count = 0;
					}
				}
			}
			System.out.println(count == 2 ? "NO" : "YES");
		}
	}
}