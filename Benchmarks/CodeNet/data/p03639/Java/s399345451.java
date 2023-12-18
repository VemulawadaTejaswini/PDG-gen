import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int count4 = 0;
		int count2 = 0;
		int odd = 0;

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);

			if (a % 4 == 0) {
				count4++;
			} else if (a % 2 == 0) {
				count2++;
			} else {
				odd++;
			}
		}

		if ((count4 + 1) == odd && count4 + odd == n) {
			System.out.println("Yes");
		} else if (count4 < odd) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
