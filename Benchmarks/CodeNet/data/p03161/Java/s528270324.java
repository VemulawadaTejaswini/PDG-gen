
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//入力受付
		Scanner scanner = new Scanner(System.in);
		int kari = Integer.parseInt(scanner.nextLine());
		String text = scanner.nextLine();

		//リスト作成
		String tempList[] = text.split(" ");
		int intList[] = new int[tempList.length];
		for(int i = 0; i < tempList.length; i++ ) {
			intList[i] = Integer.parseInt(tempList[i]);
		}

		//dpの初期化
		int dp[] = new int[intList.length];
		dp[0] = intList[0];
		dp[1] = Math.abs(intList[1] - intList[0]);
		//動的計画法の実施
		for(int i = 2; i < intList.length	; i++) {
			dp[i] = Integer.MAX_VALUE;
				for(int j = 1; j < intList.length -1; j++) {
					if((i - j) > 0) {
						dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(intList[i-j] - intList[i]));
					}
				}
		}

		System.out.println(dp[intList.length - 1]);
	}
}
