

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int f = 0;
		int s = 0;
		//２つのサイコロを用意
		int dice1[] = new int[6];
		int dice2[] = new int[6];

		for (i = 0; i < 6; i++) {
			dice1[i] = sc.nextInt();
		}
		for (i = 0; i < 6; i++) {
			dice2[i] = sc.nextInt();
		}
		for (i = 0; i <= 6; i++) {
			//１と６が同じなら次へ
			if (dice1[0] == dice2[0] && dice1[5] == dice2[5]) {
				//他の数字も回していく
				for (j = 0; j < 4; j++) {
					if (dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4]) {
						//色づけする
						f = 1;
						break;
					}
					s = dice2[1];
					dice2[1] = dice2[2];
					dice2[2] = dice2[4];
					dice2[4] = dice2[3];
					dice2[3] = s;
				}
			}
			if (i % 2 == 0) {
				s = dice2[0];
				dice2[0] = dice2[1];
				dice2[1] = dice2[5];
				dice2[5] = dice2[4];
				dice2[4] = s;
			}

			else {
				s = dice2[0];
				dice2[0] = dice2[3];
				dice2[3] = dice2[5];
				dice2[5] = dice2[2];
				dice2[2] = s;
			}
			if (f == 1) {
				break;
			}
		}
		//あっている場合出力
		if (f == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
