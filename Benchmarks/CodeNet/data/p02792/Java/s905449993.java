import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int k[][] = new int[10][10];

		for (int i = 1; i <= n; i++) {
			int keta = String.valueOf(i).length();
			int top = i / (int) Math.pow(10, keta - 1);
			int bottom = i % 10;

			k[top][bottom]++;
		}

		int ans = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				ans += k[i][j] * k[j][i];
			}
		}

		System.out.println(ans);
	}

}