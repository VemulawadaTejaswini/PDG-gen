import java.util.Scanner;

public class Main {
	static long max =Long.MIN_VALUE;
	static long[] C;
	static int[] P;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();

		C = new long[N + 1];
		P = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			P[i] = sc.nextInt();
		}

		for (int i = 1; i < N + 1; i++) {
			C[i] = sc.nextLong();
		}

		//任意のマスから動く
		for (int i = 1; i < N; i++) {
			//サイクルの累積和おきば
			long[] arr = new long[N + 1];
			long sum = 0;
			int start = i;
			int now =i;
			int con = 0;
			//1サイクル分シュミレート
			while (true) {
				//遷移
				now = P[now];
				//累積
				sum += C[now];
				arr[con] = C[now];
				//更新
				con++;
				//終了条件
				if (con == K) {
					for (int j = 0; j < con; j++) {
						max = Math.max(max, arr[j]);
					}
					break;
				}
				if (now == start) {
					if (sum <= 0) {
						for (int j = 0; j < con; j++) {
							max = Math.max(max, arr[j]);
						}
						break;
					}else {
						for (int j = 0; j < con; j++) {
							if (j < K % con) {
								arr[j] += sum;
							}
							max = Math.max(max, arr[j] + K / con * sum);
						}
						break;
					}
				}
			}
		}

		System.out.println(max);

	}
}