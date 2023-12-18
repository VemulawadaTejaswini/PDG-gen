import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(br.readLine());
			int[] T = strToIntArray(br.readLine());
			int M = Integer.parseInt(br.readLine());
			int[] P = new int[M];
			int[] X = new int[M];
			for (int i = 0; i < M; i++) {
				int[] a = strToIntArray(br.readLine());
				P[i] = a[0] - 1;
				X[i] = a[1];
			}

			for (int i = 0; i < M; i++) {

				int sum = 0;
				for (int j = 0; j < N; j++) {
					if (P[i] == j) {
						sum += X[i];
					} else {
						sum += T[j];
					}
				}

				System.out.println(sum);
			}

		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}

	// Stringで読みこんでスペースで分割されている数字を配列に入れるやつ
	// 利用法 int[] A = strTointArray(br.readLine());
	static int[] strToIntArray(String S) {
		String[] strArray = S.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}
