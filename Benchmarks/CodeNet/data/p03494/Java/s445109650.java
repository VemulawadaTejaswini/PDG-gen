import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList();
		int cnt = 0;
		int check = 0;

		//リストに追加
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			list.add(b);
		}

		//奇数が含まれていたら0
			//1になるまで繰り返す
			while (list.contains(1) == false) {
				//リスト内を2で割る
				for (int i = 0; i < list.size(); i++) {
					//取り出して
					int new_a = list.get(i);
					//奇数偶数チェック
					check = new_a % 2;
					//奇数があったらcntを-1にしてfor抜ける
					if(check==1) {
						break;
					}
					//割り算をする
					new_a = new_a / 2;
					//リスト更新
					list.set(i, new_a);
				}
				if(check == 1) {
					break;
				}
				cnt++;

			}

		System.out.println(cnt);
	}

}
