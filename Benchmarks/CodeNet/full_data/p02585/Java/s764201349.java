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
		for (int i = 1; i <= N; i++) {
			//サイクルの累積和おきば
			long[] arr = new long[N + 1];
			long sum = 0;
			int start = i;
			int now =i;
			int con = 0;
			long round =K;
			//1サイクル分シュミレート
			while (true) {
				//遷移
				now = P[now];
				//累積
				sum += C[now];
				arr[con] = sum;
				//更新
				con++;
				round--;
				//終了条件
				if (round == 0) {
					for (int j = 0; j < con; j++) {
						max = Math.max(max, arr[j]);
					}
					break;
				}
				//一周
				if (now == start) {
					long cycle = sum;
					if (cycle <= 0) {
						for (int j = 0; j < con; j++) {
							max = Math.max(max, arr[j]);
						}
						break;
					}else {
						//終了時のround数-2まで累積和を更新
						if (round > con * 2) {
							long add = round / con - 2;
							long left = round % con;
							//addの分累積和を更新
							for (int j = 0; j < con; j++) {
								arr[j] = arr[j] + cycle * add;
							}
							//2周＋left回シュミ
							sum = arr[con - 1];
							for (int j = 0; j < con * 2 + left; j++) {
								int ind = j % con;
								//やる
								//遷移
								now = P[now];
								//累積
								sum += C[now];
								arr[ind] = sum;
								//更新
								max = Math.max(max, arr[ind]);
							}
						}else {
							sum = arr[con - 1];
							for (int j = 0; j < round; j++) {
								int ind = j % con;
								//やる
								//遷移
								now = P[now];
								//累積
								sum += C[now];
								arr[ind] = sum;
								//更新
								max = Math.max(max, arr[ind]);
							}
						}

						break;
					}
				}
			}
		}

		System.out.println(max);

	}
}