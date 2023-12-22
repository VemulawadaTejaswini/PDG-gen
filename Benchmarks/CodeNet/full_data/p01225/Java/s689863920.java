import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Cardクラスを呼び出し
		//		Card card = new Card();
		//		Cards cards =new Cards();
		//ArrayList<Integer> num = new ArrayList<>();
		int cardSet = Integer.parseInt(sc.nextLine());

		//カードを配列に格納
		for (int loop = 0; loop < cardSet; loop++) {

			int[] codeList = new int[9];
			int[] endList = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
			int endIndex = 0;

			//入力されたカードの1～9の配列
			String[] cnum = sc.nextLine().split(" ");
			int[] cardNumber = new int[9];

			for (int i = 0; i < cnum.length; i++) {
				cardNumber[i] = Integer.parseInt(cnum[i]);

			}

			//入力されたカードの色の配列
			String[] ccolor = sc.nextLine().split(" ");

			//色ごとに分けた後に数字で特定する
			for (int i = 0; i < 9; i++) {

				if (endcheckList(endList, i)) {
					continue;
				}

				//赤
				if (ccolor[i].equals("R")) {
					//赤になったi番目の時の対応する数字を抜き出す
					//	System.out.print("R" + cardNumber[i] + " ");
					String Rednumber = "R" + cardNumber[i];
					codeList[i] = Cards.valueOf(Rednumber).getCode();//valueOfでenumのR1～を指定してその中のcodeを抜き出し

				}
				//青
				if (ccolor[i].equals("B")) {
					//青になったi番目の時の対応する数字を抜き出す
					//		System.out.print("B" + cardNumber[i] + " ");
					String Bluenumber = "B" + cardNumber[i];
					codeList[i] = Cards.valueOf(Bluenumber).getCode();

				}
				//緑
				if (ccolor[i].equals("G")) {
					//緑になったi番目の時の対応する数字を抜き出す
					//		System.out.print("G" + cardNumber[i] + " ");
					String Greennumber = "G" + cardNumber[i];
					codeList[i] = Cards.valueOf(Greennumber).getCode();

				}

			}
			Arrays.sort(codeList);
			for (int i = 0; i < 9; i++) {

				int high1 = -1;//-1のままならエラー
				int high2 = -1;
				int equ1 = -1;
				int equ2 = -1;

				if (endcheckList(endList, i)) {
					continue;
				}

				for (int j = 0; j < 9; j++) {

					if (i == j) {
						continue;
					}

					if (endcheckList(endList, j)) {
						continue;
					}

					if (codeList[i] + 1 == codeList[j]) {
						high1 = j;
					}
					if (codeList[i] + 2 == codeList[j]) {
						high2 = j;
					}
					if (codeList[i] == codeList[j] && equ1 == -1) {
						equ1 = j;
						continue;
					}

					if ((codeList[i] == codeList[j])) {
						equ2 = j;
					}

				}

				if (equ1 != -1 && equ2 != -1) {
					endList[endIndex] = i;
					endList[endIndex + 1] = equ1;
					endList[endIndex + 2] = equ2;
					endIndex += 3;
				} else if (high1 != -1 && high2 != -1) {
					endList[endIndex] = i;
					endList[endIndex + 1] = high1;
					endList[endIndex + 2] = high2;
					endIndex += 3;
				}

			}
			if (endcheckList(endList, -1)) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}

		}

		sc.close();

	}

	public static boolean endcheckList(int[] endList, int num) {
		boolean flg = false;
		for (int end : endList) {
			if (end == num) {
				flg = true;
			}
		}
		return flg;
	}
}

enum Cards {
	//赤札
	R1(0, "R", 1), R2(1, "R", 2), R3(2, "R", 3), R4(3, "R", 4), R5(4, "R", 5), R6(5, "R", 6), R7(6, "R", 7), R8(7, "R",
			8), R9(8, "R", 9),
	//青札
	B1(20, "B", 1), B2(21, "B", 2), B3(22, "B", 3), B4(23, "B", 4), B5(24, "B", 5), B6(25, "B", 6), B7(26, "B",
			7), B8(27, "B", 8), B9(28, "B", 9),
	//緑札
	G1(40, "G", 1), G2(41, "G", 2), G3(42, "G", 3), G4(43, "G", 4), G5(44, "G", 5), G6(45, "G", 6), G7(46, "G",
			7), G8(47, "G", 8), G9(48, "G", 9),
			;
	private int code;
	private String color;
	private int number;

	public int getCode() {
		return this.code;
	}
	public String getColor() {
		return this.color;
	}
	public int getnumber() {
		return this.number;
	}


	private Cards(int code, String color, int number) {
		this.code = code;
		this.color = color;
		this.number = number;
	}

}

