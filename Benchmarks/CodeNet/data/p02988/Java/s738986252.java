import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int result = 0;

		String str[] = br.readLine().split(" ");
		int list[] = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(str[i]);
		}

		for (int i = 1; i < n - 1; i++) {
			if (list[i - 1] < list[i] && list[i] < list[i + 1]) {
				result++;
			} else if (list[i - 1] > list[i] && list[i] > list[i + 1]) {
				result++;
			}
		}
		System.out.println(result);
	}
}