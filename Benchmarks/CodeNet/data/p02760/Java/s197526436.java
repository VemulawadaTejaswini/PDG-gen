import java.util.Scanner;

//Distinct or Not
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int[][] bingo = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				bingo[i][j] = sc.nextInt();

			}
		}

		int max = sc.nextInt();
		for(int x = 0; x < max; x++) {
			int num = sc.nextInt();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
					}
				}
			}
		}


		//正解チェック
		int cnt = 0;
		boolean flg = false;
		//横チェック
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(bingo[i][j] == 0) {
					cnt++;
				}
				if(cnt == 2) {
					flg = true;
				}
			}
			cnt = 0;
		}

		//縦チェック
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(bingo[j][i] == 0) {
					cnt++;
				}
				if(cnt == 2) {
					flg = true;
				}
			}
			cnt = 0;
		}

		if(!flg) {
			//斜めチェック
			if(bingo[0][0] == 0) cnt++;
			if(bingo[1][1] == 0) cnt++;
			if(bingo[2][2] == 0) cnt++;

			if(cnt == 2) flg = true;
			cnt = 0;

			if(bingo[0][2] == 0) cnt++;
			if(bingo[1][1] == 0) cnt++;
			if(bingo[2][0] == 0) cnt++;

			if(cnt == 2) flg = true;
		}

		if(flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

    }
}