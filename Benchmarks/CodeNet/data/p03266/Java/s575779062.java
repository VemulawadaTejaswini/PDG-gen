import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long N, K;
		N = sc.nextLong();
		K = sc.nextLong();

		long mod0 = 0, modHalf = 0;
		for (int i = 1; i <= N; i++) {
			if (i % K == 0) mod0++;
			if (K % 2 == 0 && i % K == K / 2) modHalf++;
		}

		System.out.println(mod0 * mod0 * mod0 + modHalf * modHalf * modHalf);
	}
}