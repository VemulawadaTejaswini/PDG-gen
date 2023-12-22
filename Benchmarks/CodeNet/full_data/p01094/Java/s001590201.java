import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			int[] array = new int[26];
			String str[] = br.readLine().split(" ");
			String alp[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
					"S", "T", "U", "V", "W", "X", "Y", "Z" };

			for (int i = 0; i < n; i++) {
				char c[] = str[i].toCharArray();
				int a = c[0] - 'A';
				array[a]++;

				int max = 0;
				int now = 0;
				for (int j = 0; j < 26; j++) {
					if (max < array[j]) {
						max = array[j];
						now = j;
					}
				}

				// judge
				boolean judge = true;
				for (int j = 0; j < 26; j++) {
					if (now == j) {
						continue;
					}
					if (max <= array[j] + n - i - 1) {
						judge = false;
						break;
					}
				}

				// output
				if (judge) {
					System.out.println(alp[now] + " " + (i + 1));
					break;
				} else if (i == n - 1) {
					System.out.println("TIE");
				}
			}
		}
	}
}
