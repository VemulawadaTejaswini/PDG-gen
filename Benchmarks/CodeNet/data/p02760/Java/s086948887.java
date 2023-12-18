import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[] = new int[9];

		for (int i = 0; i < 9; i += 3) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				a[i + j] = Integer.parseInt(str[j]);
			}
		}
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(br.readLine());

			for (int j = 0; j < 9; j++) {
				if (a[j] == b) {
					a[j] = 0;
				}
			}
		}

		if ((a[0] == 0 && a[1] == 0 && a[2] == 0) || (a[3] == 0 && a[4] == 0 && a[5] == 0)
				|| (a[6] == 0 && a[7] == 0 && a[8] == 0) || (a[0] == 0 && a[3] == 0 && a[6] == 0)
				|| (a[1] == 0 && a[4] == 0 && a[7] == 0) || (a[2] == 0 && a[5] == 0 && a[8] == 0)
				|| (a[0] == 0 && a[4] == 0 && a[8] == 0) || (a[2] == 0 && a[4] == 0 && a[6] == 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
