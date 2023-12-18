import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] Bingo = new int[3][3];
		//列
		//行
		//3*3の２次元配列宣言
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				Bingo[i][j] = sc.nextInt();
			}
		}

		//当選番号入力数分回す
		int Count = sc.nextInt();
		int[] win = new int[Count];
		for(int c = 0; c <Count; c++) {
			win[c] = sc.nextInt();
		}

		//ビンゴ内に当選番号があるか比較しビンゴしているかを判断。
		for(int cnt = 0; cnt < win.length; cnt++) {
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0 ; j < 3; j++) {
					if(Bingo[i][j] == win[cnt]) {
						Bingo[i][j] = 0;
					}
				}
			}
		}
		//ビンゴ全パターン
		boolean pattern1 = Bingo[0][0] + Bingo[0][1] + Bingo[0][2] == 0;
		boolean pattern2 = Bingo[1][0] + Bingo[1][1] + Bingo[1][2] == 0;
		boolean pattern3 = Bingo[2][0] + Bingo[2][1] + Bingo[2][2] == 0;
		boolean pattern4 = Bingo[0][0] + Bingo[1][1] + Bingo[2][2] == 0;
		boolean pattern5 = Bingo[2][0] + Bingo[1][1] + Bingo[0][2] == 0;
		boolean pattern6 = Bingo[0][0] + Bingo[1][0] + Bingo[2][0] == 0;
		boolean pattern7 = Bingo[0][1] + Bingo[1][1] + Bingo[2][1] == 0;
		boolean pattern8 = Bingo[0][2] + Bingo[1][2] + Bingo[2][2] == 0;

		//上記の条件のどれかがtrueが返されていたらYesを表示、それ以外はNoを返す
		if(pattern1 || pattern2 || pattern3 || pattern4 || pattern5 || pattern6 ||  pattern7 || pattern8) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}