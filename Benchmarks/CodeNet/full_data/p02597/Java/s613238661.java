import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_D
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans = 0;

		sc.nextLine();
		String C = sc.nextLine();

		int cntR = 0;
		int cntW = 0;
		int mkW = 0;

		//RRWWにする

		for(int i=0; i<N; i++) {
			if(C.charAt(i) == 'R') {
				cntR++;
			} else {
				cntW++;
				mkW = i;
			}
		}
		if(cntR != 0 && cntW != 0) {
			// 一番右のWから先を全部Wにする（入れ替え）
			ans = N - 1 - mkW;

			// 一番右のRの位置を求める
			int mkR = mkW;
			for(int i=mkW; i>=0; i--) {
				if(C.charAt(i) == 'R') {
					mkR = i;
					break;
				}
			}

			// 残りのWをRにする
			if(mkR + cntW != mkW) {
				ans += (mkR + 1 - cntR);
			}
		}

		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
