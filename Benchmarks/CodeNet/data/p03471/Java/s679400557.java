import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mai = sc.nextInt();	//枚数
		int kin = sc.nextInt();	//金額
		int M = 0;				//諭吉の枚数
		int G = 0;				//一葉の枚数
		int S = 0;				//英世の枚数
		int chek = 0;			//0の時不可能 -1 -1 -1 ::: 1の時MGSそのまま出力

		loop: for(int i = 0; i <= mai; i++) {
			if(i == 0 && mai * 10000 == kin) {	// 10000 * 枚数 = 金額なら即終了
				M = mai;
				chek = 1;
				break loop ;
			}
			if(i == 0 && mai * 5000 == kin) {	// 5000 * 枚数 = 金額なら即終了
				G = mai;
				chek = 1;
				break loop ;
			}
			if(kin >= i * 10000 && kin <= mai * 10000) {	//諭吉カウンター
				M = i;
			}
			for(int j = 0; j <= mai - M; j++) {		//一葉カウンター
				G = j;
				if(M + G == mai && M * 10000 + G * 5000 == kin && kin <= M * 10000 + (mai - M) * 5000) {	//諭吉 + 一葉 = 枚数 かつ 諭吉額 + 一葉額 = 金額なら終了
					chek = 1;
					break loop;
				}
				if(kin - (M * 10000 + G * 5000) == (mai - M - G) * 1000) {	//金額 - 諭吉額 - 一葉額 = 残り枚数 * 英世額 ならSに英世枚数を入れて終了
					S = mai - M - G;
					chek = 1;
					break loop;
				}
			}
		}
		if(chek == 0) {
			M = -1;
			G = -1;
			S = -1;
		}
		System.out.print(M + " " + G + " " + S);
	}
}