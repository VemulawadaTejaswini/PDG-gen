import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//エラトステネスのふるい
		int MAX = 101010;
		int[] isPrime = new int[MAX];
		Arrays.fill(isPrime, 1);
		isPrime[0] = 0; isPrime[1] = 0;
		for (int i = 2; i < MAX; i++) {
			if (isPrime[i] == 0) continue;
			for (int j = i * 2; j < MAX; j += i) {
				isPrime[j] = 0;
			}
		}

		//2017likeを探す
		int[] a = new int[MAX];
		Arrays.fill(a, 0);
		for (int i = 0; i < MAX; i++) {
			if (isPrime[i] != 0 && isPrime[(i + 1) / 2] != 0) {
				a[i] = 1;
			}
		}

		//累積和
		int[] sum = new int[MAX + 1];
		sum[0] = 0;
		for (int i = 1; i < sum.length; i++) {
			sum[i] = a[i - 1] + sum[i - 1];
		}

		//クエリの処理
		int Q = sc.nextInt();
		for (int q = 0; q < Q; q++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			int ans = sum[r + 1] - sum[l];
			System.out.println(ans);
		}
	}

}