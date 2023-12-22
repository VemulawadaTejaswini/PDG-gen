import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	static int list[];

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);

			if (n == 0 && r == 0)
				break;

			list = new int[n];

			for (int i = 0; i < n; i++) {
				list[i] = n - i;
			}

			for (int i = 0; i < r; i++) {
				str = br.readLine().split(" ");
				int p = Integer.parseInt(str[0]) - 1;
				int c = Integer.parseInt(str[1]);
				cutting(p, c);
			}
			System.out.println(list[0]);
		}
	}

	static void cutting(int p, int c) {
		int under[] = new int[c];
		for (int i = 0; i < c; i++) {
			under[i] = list[p + i];
		}
		for (int i = 0; i < p; i++) {
			list[p + c - i - 1] = list[p - i - 1];
		}
		for (int i = 0; i < c; i++) {
			list[i] = under[i];
		}
	}
}
