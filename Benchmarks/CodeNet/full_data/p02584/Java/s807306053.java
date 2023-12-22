import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);
		Long X = sc.nextLong();		// スタート地点
		Long K = sc.nextLong();		// 移動回数
		Long D = sc.nextLong();		// 1回の移動距離

		Long ans = (long) 0;

		// とり得る値
		Long aPos, aNeg;
		aPos = X%D;
		aNeg = aPos - D;

		if(((X-aPos)/D) > K){
			ans = Math.abs(X) - K*D;
		} else {
			if(((X-aPos)/D)%2 == K%2) {
				ans = Math.abs(aPos);
			} else {
				ans = Math.abs(aNeg);
			}
		}

		System.out.println(ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}