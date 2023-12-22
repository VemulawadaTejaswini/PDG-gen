import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//提示されるダイス目の入力
		String dice = sc.nextLine();

		//入力されたダイス目の配列
		String[] dicenum =dice.split(" ");
		int[] dicenumber =new int[6];

		for(int i = 0 ; i < dicenum.length ; i++){

			dicenumber[i] = Integer.parseInt(dicenum[i]);


			}

		//提示されたダイスの転がる方向
		String str = sc.nextLine();

		//1文字単位でリスト化
		String[] direction = str.split("");

		//Diceクラスの呼び出し
		Dice diceroll = new Dice(dicenumber);

		//Rollクラスの呼び出し
		Roll dicetop = new Roll();

		//Diceクラスの受けわたし
		dicetop.setDice(diceroll);

		//配列を渡して長さ分だけ振る命令
		int dt = dicetop.roll(direction);

		System.out.println(dt);

		sc.close();

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

 class Roll {

	Dice dice;

	public void setDice(Dice getDice) {
		dice = getDice;
	}

	public int roll(String[] splitstr) {
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

		for (String str : splitstr) {

			switch (str) {
			case "S":
				empty = dice.d[0];
				dice.d[0] = dice.d[4];
				dice.d[4] = dice.d[5];
				dice.d[5] = dice.d[1];
				dice.d[1] = empty;
				break;

			case "N":
				empty = dice.d[0];
				dice.d[0] = dice.d[1];
				dice.d[1] = dice.d[5];
				dice.d[5] = dice.d[4];
				dice.d[4] = empty;
				break;

			case "E":
				empty = dice.d[0];
				dice.d[0] = dice.d[3];
				dice.d[3] = dice.d[5];
				dice.d[5] = dice.d[2];
				dice.d[2] = empty;
				break;

			case "W":
				empty = dice.d[0];
				dice.d[0] = dice.d[2];
				dice.d[2] = dice.d[5];
				dice.d[5] = dice.d[3];
				dice.d[3] = empty;
				break;

			default:
				break;
			}

		}

		return dice.d[0];
	}
}
