import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] topAry = { "M", "A", "R", "C", "H" };	// 頭文字
		int nameNum;									// 入力された名前の数
		String[] nameAry;								// 入力された名前の配列
		int[] nameCntAry = new int[5];					// 頭文字が一致する名前の数をカウント
		int answer = 0;									// 出力する答え

		// 入力された名前の数に応じた配列を作成
		Scanner sc = new Scanner(System.in);
		nameNum = sc.nextInt();
		nameAry = new String[nameNum];

		// 入力された名前を配列に格納
		for (int i = 0; i < nameAry.length; i++) {
			nameAry[i] = sc.next();
		}

		// 頭文字が一致する名前の数をカウントしてnameCntAryに保管する
		for (int n = 0; n < nameAry.length; n++) {
			for (int t = 0; t < topAry.length; t++) {
				if (nameAry[n].startsWith(topAry[t])) {
					nameCntAry[t]++;
				}
			}
		}

		// マッチした名前を持つ人数を調べる
		int cnt = 0;
		for (int tmp : nameCntAry) {
			if (tmp != 0)
				cnt++;
		}

		// 3人以上いる場合、正の数だけを取り出してコレクションに保管
		ArrayList<Integer> natNumList = new ArrayList<>();
		if (cnt >= 3) {
			for (int tmp : nameCntAry) {
				if (tmp > 0)
					natNumList.add(tmp);
			}
		}

		// 確率の求め方が分かりません……

	}
}