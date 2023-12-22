import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int l = Integer.parseInt(str[1]);
			int r = Integer.parseInt(str[2]);

			if (n == 0) {
				break;
			}

			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(br.readLine());
			}

			int ans = 0;

			for (int i = l; i <= r; i++) {
				boolean flag = false; // そのような i が存在しないとき

				for (int j = 0; j < n; j++) {
					if (i % a[j] == 0) {
						flag = true;
						if ((j + 1) % 2 != 0) {
							ans++;
						}
						break;
					}
				}
				if (!flag) {
					if (n % 2 == 0) {
						ans++;
					}
				}
			}

			System.out.println(ans);
		}
	}
}

