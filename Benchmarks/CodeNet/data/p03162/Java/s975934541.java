import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	static long chmin(long a, long b) {
		return Math.min(a, b);
	}

	static long chmax(long a, long b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];

		long DPA[] = new long[N];
		long DPB[] = new long[N];
		long DPC[] = new long[N];

		Arrays.fill(DPA, 0);
		Arrays.fill(DPB, 0);
		Arrays.fill(DPC, 0);

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		DPA[0] = A[0];
		DPB[0] = B[0];
		DPC[0] = C[0];

		for(int now=1; now<N; now++) {
			DPA[now] = chmax(DPB[now-1]+A[now], DPC[now-1]+A[now]);
			DPB[now] = chmax(DPA[now-1]+B[now], DPC[now-1]+B[now]);
			DPC[now] = chmax(DPA[now-1]+C[now], DPB[now-1]+C[now]);
		}

		// 出力
		System.out.println(chmax(chmax(DPA[N-1],DPB[N-1]),DPC[N-1]));
	}
}