import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 全体人数
		int N = sc.nextInt();
		// お菓子の種類
		int K = sc.nextInt();

		// お菓子持ってる人数配列
		int[] snackMenbers = new int[K];
		// お菓子持ってる人リスト
		List<int[]> snackMenberList = new ArrayList<int[]>();

		// i = お菓子カウンター
		for (int i = 0; i < K; i++) {

			snackMenbers[i] = sc.nextInt();
			int[] menberArray = new int[snackMenbers[i]];

			for (int j = 0; j < snackMenbers[i]; j++) {

				menberArray[j] = sc.nextInt();
			}

			snackMenberList.add(menberArray);
		}

		// 全すぬけ
		int[] all = new int[N];

		// お菓子の種類分回す
		for (int k = 0; k < K; k++) {

			// お菓子持ってる人分回す
			for (int l = 0; l < snackMenberList.get(k).length; l++) {

				all[snackMenberList.get(k)[l] - 1] = all[snackMenberList.get(k)[l] - 1] + 1;
			}
		}

		int ans = 0;

		for (int n = 0; n < all.length; n++) {

			if (all[n] == 0) {
				ans++;
			}
		}

		// 出力
		System.out.println(ans);
	}
}