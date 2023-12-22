import java.util.Scanner;

class Dice1{
	private int[] number = new int[6]; //Diceの方向には何の数字かを示す
										//初期値の順番と一緒：上面①、その下②、その右③、その左④、その上⑤、その反面⑥（Indexと一個違い）

	//コンストラクタ
	public Dice1(int[] n) {
		for (int i=0; i< 6; i++)number[i] = n[i];
	}

	public int getDice(int no) {
		return number[no];
	}

	public void roll(String target) {
		int [] w = new int[6];  //仮のway
		int a = target.length();
		for (int i=0; i<a; i++) {
			for (int j=0; j< 6; j++) w[j] = number[j];  //コピーする
			String t = target.substring(i, i+1);
			switch(t) {
			case "N":
				number[4] = w[0];
				number[0] = w[1];
				number[1] = w[5];
				number[5] = w[4];
				break;
			case "E":
				number[2] = w[0];
				number[0] = w[3];
				number[3] = w[5];
				number[5] = w[2];
				break;
			case "S":
				number[4] = w[5];
				number[0] = w[4];
				number[1] = w[0];
				number[5] = w[1];
				break;
			case "W":
				number[2] = w[5];
				number[0] = w[2];
				number[3] = w[0];
				number[5] = w[3];
				break;
			}
		}
	}
}

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int [] n = new int[6];
			for (int i=0; i<6; i++) n[i] = sc.nextInt(); //diceの数字を取得
			Dice1 dice1 = new Dice1(n);
			String target = sc.next();
			dice1.roll(target);
			System.out.println(dice1.getDice(0));  //上面を出力
		}
	}
}

