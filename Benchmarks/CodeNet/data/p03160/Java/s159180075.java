import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int H[] = new int[N+1];
		Arrays.fill(H, 0);
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		long ans = 0;
		int now = 0;
		while(now < N-1) {
			if(Math.abs(H[now]-H[now+2]) < Math.abs(H[now]-H[now+1])+Math.abs(H[now+1]-H[now+2])) {
				ans += Math.abs(H[now]-H[now+2]);
				now += 2;
			} else {
				ans += Math.abs(H[now]-H[now+1]);
				now += 1;
			}
		}

		// 出力
		System.out.println(ans);
	}
}
