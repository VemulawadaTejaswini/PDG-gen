import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int permu[][];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int k = 2;
		long arr[] = new long[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(str[i]);
		}

		// bit = {0, 1, 2}

		long sum = 0;
		for (int bit = (1 << k) - 1; bit < (1 << n); bit = next_combination(bit)) {
			/* ここに処理を書く */
			/* きちんとできていることを確認してみる */
			// bit の表す集合を求める
			long s = 0;
			for (int i = 0; i < n; ++i) {

				if ((bit & (1 << i)) != 0) { // i が bit に入るかどうか
					if (s != 0)
						s = (arr[i] ^ s) % 1000000007;
					else
						s = (arr[i]) % 1000000007;
				}

			}
			sum += s;
		}
		System.out.println(sum % 1000000007);
	}

	static int next_combination(int sub) {
		int x = sub & -sub, y = sub + x;
		return (((sub & ~y) / x) >> 1) | y;
	}

}