import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int[] D = new int[K];
		int m = 10 - K;
		int[] S = new int[m];
		int a = 0;

		String[] s = br.readLine().split(" ");

		for (int i = 0; i < K; i++) {
			if (D[i] <= 9 && 0 <= D[i]) {
				D[i] = Integer.parseInt(s[i]);
			}
		}

		for (int i = 0; i < 10; i++) {
			int c = 0;
			for (int j = 0; j < K; j++) {
				// D[j]が0～9のどれにも当てはまらなかったら、c++する
				if (D[j] == i) {
					// なにもしない
				} else {
					c++;
				}
				// D[j]が0～9の全てに当てはまらなかったら、iの値をS[a]に代入する。
				if (c == K) {
					S[a] = i;
					a++;
				} else {
					// なにもしない
				}
			}
		}

		int w = 0; // 4桁目の値
		int x = 0; // 3桁目の値
		int y = 0; // 2桁目の値
		int z = 0; // 1桁目の値
		int num = 0;

			for (int i = 0; i < S.length; i++) {
				for (int j = 0; j < S.length; j++) {
					for (int k = 0; k < S.length; k++) {
						for (int l = 0; l < S.length; l++) {
							z = S[l];
							y = S[k];
							x = S[j];
							w = S[i];
							num=sub(w, x, y, z, N);
							if (num >= N) {
							return;
							}
						}
					}
				}
			}
		}
	

	public static int sub(int w, int x, int y, int z, int N) {
		int num = ((1000 * w) + (100 * x) + (10 * y) + z);
		if (num >= N) {
			System.out.print(num);
		}
		return num;
	}
}
