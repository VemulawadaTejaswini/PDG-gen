import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

			int count = 0;
			for (int j = 0; j < n; j++) {
				int cCount = getCCount(c, b[j]);
				if (cCount > 0) {
					count += getACount(a, b[j]) * cCount;
				}
			}
			System.out.println(count);
		}
	}

	private static int getCCount(int[] c, int b) {
		int n = c.length;
		int count = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (b < c[i]) {
				count++;
			} else {
				break;
			}
		}

		return count;
	}

	private static int getACount(int[] a, int b) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < b) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}
