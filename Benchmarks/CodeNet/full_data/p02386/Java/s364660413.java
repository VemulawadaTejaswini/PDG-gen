import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//振るダイスの数
		//int diceFigure = sc.nextInt();
		int diceFigure = Integer.parseInt(sc.nextLine());
		Roll diceRoll = new Roll();

		int[] dicenumber = new int[6];
		//Dice[] dicebox = new Dice[diceFigure];

		//指定の数までダイスを用意
		for (int diceSet = 0; diceSet < diceFigure; diceSet++) {

			//提示されるダイス目の入力とダイス目の配列
			String dice = sc.nextLine();

			//入力されたダイス目の配列
			String[] dicenum = dice.split(" ");

			for (int i = 0; i < 6; i++) {
				dicenumber[i] = Integer.parseInt(dicenum[i]);

			}
			diceRoll.addDice(new Dice(dicenumber));
			//dicebox[diceSet] = new Dice(dicenumber);

		}

		if (diceRoll.zenbu()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}

class Roll {

	Dice dice;
	ArrayList<Dice> diceList = new ArrayList<Dice>();

	public void setDice(Dice getDice) {
		this.dice = getDice;
	}

	public void addDice(Dice getDice) {
		this.diceList.add(getDice);
	}

	public void showDice() {
		for (Dice d : diceList) {
			System.out.printf("%d,%d,%d,%d,%d", d.d[0], d.d[1], d.d[2], d.d[3], d.d[4], d.d[5]);
		}

		for (int i = 0; i < diceList.size(); i++) {
			Dice d = diceList.get(i);
			System.out.printf("%d,%d,%d,%d,%d", d.d[0], d.d[1], d.d[2], d.d[3], d.d[4], d.d[5]);
		}

	}

	public boolean zenbu() {

		boolean flg = false;
		for (int i = 0; i < diceList.size() - 1; i++) {

			for (int j = i + 1; j < diceList.size(); j++) {
				Dice d1 = diceList.get(i);
				Dice d2 = diceList.get(j);

				if (!this.roll(d1.d, d2.d)) {
					if (!flg) {
						flg = true;
					}
				}

			}
		}
		return !flg;

	}

	//呼び出し元からint型のdicetopとdicefrontを受け取る
	public boolean roll(int[] d1, int[] d2) {

		//1-6を配列番号0-5に割り当てて並べ替えをする
		//縦に4回、水平に4回回して一致する配列があるかどうかを判定する

		int empty = 0;
		//Object YorN = "";

		//方向ごとに場合分け

		if (d1 != d2) {

			for (int i = 0; i < 4; i++) {

				// if文で面の番地に指定の数字が入るまで繰り返し

				//縦回転(前後)
				if (Arrays.equals(d1, d2)) {
					break;
				}

				empty = d2[0];
				d2[0] = d2[1];
				d2[1] = d2[5];
				d2[5] = d2[4];
				d2[4] = empty;

				for (int k = 0; k < 4; k++) {
					if (Arrays.equals(d1, d2)) {
						break;
					}

					//水平回転
					empty = d2[1];
					d2[1] = d2[2];
					d2[2] = d2[4];
					d2[4] = d2[3];
					d2[3] = empty;

				}

			}
			for (int j = 0; j < 4; j++) {
				if (Arrays.equals(d1, d2)) {
					break;
				}

				//縦回転(左右)
				empty = d2[0];
				d2[0] = d2[2];
				d2[2] = d2[5];
				d2[5] = d2[3];
				d2[3] = empty;

				for (int k = 0; k < 4; k++) {
					if (Arrays.equals(d1, d2)) {
						break;
					}
					//水平回転
					empty = d2[1];
					d2[1] = d2[2];
					d2[2] = d2[4];
					d2[4] = d2[3];
					d2[3] = empty;

				}
			}
			if (!Arrays.equals(d1, d2)) {
				//YorN = "Yes";
				return true;
			} else {
				//YorN = "No";
				return false;
			}

		}
		return false;

		//return YorN;
	}
}

class Dice {

	int[] d = new int[6];

	public Dice(int[] setd) {

		this.d[0] = setd[0];
		this.d[1] = setd[1];
		this.d[2] = setd[2];
		this.d[3] = setd[3];
		this.d[4] = setd[4];
		this.d[5] = setd[5];

	}

}

