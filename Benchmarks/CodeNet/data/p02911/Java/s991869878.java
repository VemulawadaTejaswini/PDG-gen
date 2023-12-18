import java.util.Arrays;
import java.util.Scanner;

public class AttackSurvival2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int PARTICIPANTS_COUNT;
		final int DEFAULT_POINTS;
		final int CORRECT_COUNT;

		//初期情報（参加者数、初期所持ポイント、全体正解数）を取得する
		String[] strArrIniInfo = sc.nextLine().split("[ ]+");

		//入力チェック
		if(strArrIniInfo.length != 3) {
			System.out.println("入力が不正です。");
			return;
		}

		//参加者をセットする
		PARTICIPANTS_COUNT = Integer.parseInt(strArrIniInfo[0]);

		//初期所持ポイントをセットする
		DEFAULT_POINTS = Integer.parseInt(strArrIniInfo[1]);

		//全体正解数をセットする
		CORRECT_COUNT = Integer.parseInt(strArrIniInfo[2]);

		//参加者ステータスを初期化する
		int[] intArrParticipantsStatus = new int[PARTICIPANTS_COUNT];
		Arrays.fill(intArrParticipantsStatus, DEFAULT_POINTS);

		int intCorrectPersonNo = 0;
		for(int i = 1; i <= CORRECT_COUNT; i++) {

			//正解者No.を取得する
			intCorrectPersonNo = sc.nextInt();

			//正解者以外のポイントを下げる
			for(int j = 0; j < intArrParticipantsStatus.length; j++) {
				if(j == intCorrectPersonNo - 1) {
					continue;
				}
				else {
					intArrParticipantsStatus[j]--;
				}
			}
		}

		//結果を出力する
		System.out.println("\n" + "--------------- 結果 ---------------");
		for (int i = 0; i < intArrParticipantsStatus.length; i++) {
			if(intArrParticipantsStatus[i] <= 0) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
		}

	}
}
