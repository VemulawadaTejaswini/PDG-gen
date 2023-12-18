import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int x[] = new int[n];
		int y[] = new int[n];
		long h[] = new long[n];

		int index = 0;
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			x[i] = Integer.parseInt(str[0]);
			y[i] = Integer.parseInt(str[1]);
			h[i] = Long.parseLong(str[2]);

			if (h[i] != 0) {
				index = i;
			}
		}

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				int H = (int) (h[index] + Math.abs(i - x[index]) + Math.abs(j - y[index]));
				boolean flag = true;
				
				for (int k = 0; k < n; k++) {
					if (Math.max(H - Math.abs(i - x[k]) - Math.abs(j - y[k]), 0) != h[k]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(i + " " + j + " " + H);
					return;
				}
			}
		}
	}
}
