import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long startMillisTime = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] an = new long[n];

		for (int i = 0; i < n; i++) {
			long a = scan.nextLong();
			an[i] = a;
		}

		long ans = 1;
		for (int i = 0, j = an.length; i < n; i++) {
			ans *= an[i];
		}

		if (ans < Math.pow(10, 18)) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
		long endMillisTime = System.currentTimeMillis();

//		System.out.println("処理時間（ミリ）：" + (endMillisTime - startMillisTime) + " ms");

		scan.close();
	}

}
