import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Double ans = (double) 0;

		for(int i = 0; i < N; i++) {
			ans += 1 / sc.nextDouble();
		}

		System.out.println(1 / ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}

}
