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
		for (int i = 1; i < N; i++) {
			long[] arr = new long[N + 1];
			long sum = 0;
			int start = i;
			int now =i;
			int con = 0;
			
			while (true) {
				now = P[now];
				sum += C[now];
				arr[con] = C[now];
				con++;
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
							max = Math.max(max, arr[j] + ((K / con - 1) * sum));
						}
						break;
					}
				}
			}
		}

		System.out.println(max);

	}
}