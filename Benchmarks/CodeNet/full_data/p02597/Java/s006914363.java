import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();//石の数
		//色の入力
		String c = sc.next();
		String[] C = new String[N];
		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				C[i]=c.substring(i);
			} else {
				C[i] = c.substring(i, i + 1);
			}
		}
		//左から白を探す→その白より右側に赤がある場合、一番右側にある赤とその白を入れ替える
		int check = 0;
		for (int j = 0; j < N; j++) {
			//白を検索
			int wn = 0;//ホワイトナンバー
			for (int i = 0; i < N; i++) {
				if (C[i].equals("W")) {
					wn = i;
					break;
				} else {//ない場合
					wn = N;
				}
			}
			//赤を探す
			int rn = 0;//レッドナンバー
			for (int i = N - 1; i >= 0; i--) {
				if (C[i].equals("R")) {
					rn = i;
					break;
				} else {//ない場合
					rn = N;
				}
			}
			//白と赤の場所比較して、場所入れ替え
			if (wn < rn && !(wn == 0 && rn == N)) {
				C[wn] = "R";
				C[rn] = "W";
				check++;
			}
		}
		//

		System.out.println(check);
	}

}
