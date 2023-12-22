import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//提示されるダイス目の入力
		String dice = sc.nextLine();

		//入力されたダイス目の配列
		String[] dicenum = dice.split(" ");
		int[] dicenumber = new int[6];

		for (int i = 0; i < dicenum.length; i++) {
			dicenumber[i] = Integer.parseInt(dicenum[i]);
		}

		//質問の数ｑ
		int question = sc.nextInt();

		for (int i = 0; i < question; i++) {

			//指定されたダイス目(上)
			int dicetop = sc.nextInt();

			//指定されたダイス目(前)
			int dicefront = sc.nextInt();

			//Diceクラスの呼び出し
			Dice diceClass = new Dice(dicenumber);

			//Rollクラスの呼び出し
			Roll diceRoll = new Roll();

			//Diceクラスの受け渡し
			diceRoll.setDice(diceClass);

			//Rollクラスに上面と前面を渡して結果を受け取りint型に格納
			int diceanswer = diceRoll.roll(dicetop, dicefront);

			System.out.println(diceanswer);
		}
		sc.close();

	}

}

class Roll {

	Dice dice;

	public void setDice(Dice getDice) {
		this.dice = getDice;
	}

	//呼び出し元からint型のdicetopとdicefrontを受け取る
	public int roll(int dicetop, int dicefront) {

		//番地の目の移動
		//1,2,3,4,5,6
		//移動方向がN・Sの時は3と4は変わらない
		//移動方向がE・Wの時は2と5は変わらない
		//1と6は常に移動する

		//Sの時は1⇒2⇒6⇒5⇒1の位置にそれぞれ移動する
		//Nの時は1⇒5⇒6⇒2⇒1の位置にそれぞれ移動する
		//Eの時は1⇒3⇒6⇒4⇒1の位置にそれぞれ移動する
		//Wの時は1⇒4⇒6⇒3⇒1の位置にそれぞれ移動する

		//1-6を配列番号0-5に割り当てて並べ替えをする

		int empty = 0;

		//方向ごとに場合分け

		while (true) {

			// if文で面の番地に指定の数字が入るまで繰り返し
			if (dice.d[0] != dicetop) {

				empty = dice.d[0];
				dice.d[0] = dice.d[1];
				dice.d[1] = dice.d[5];
				dice.d[5] = dice.d[4];
				dice.d[4] = empty;

			}  if (dice.d[0] != dicetop) {

				empty = dice.d[0];
				dice.d[0] = dice.d[2];
				dice.d[2] = dice.d[5];
				dice.d[5] = dice.d[3];
				dice.d[3] = empty;

			} else if (dice.d[1] != dicefront) {
				empty = dice.d[1];
				dice.d[1] = dice.d[2];
				dice.d[2] = dice.d[4];
				dice.d[4] = dice.d[3];
				dice.d[3] = empty;
			} else {
				break;
			}

		}

		return dice.d[2];
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

