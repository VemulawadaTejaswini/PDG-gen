import java.util.Scanner;

class Dice2{
	private int[] number = new int[6]; //Diceの方向には何の数字かを示す
										//初期値の順番と一緒：上面①、その下②、その右③、その左④、その上⑤、その反面⑥（Indexと一個違い）

	//コンストラクタ
	public Dice2(int[] n) {
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

	public void rollUntilAB(int A,int B) {
		while ((number[0]!=A)||(number[1]!=B)) {
			if (number[0]!=A) {
				if (number[2] == A) roll("W"); //Aが③の時：W
				else if (number[3] == A) roll("E"); //Aが④の時：E
				else roll("N"); //Aが③④にない場合、ひたすらN移動
			}else {  //Aは①面にあって、Bは②にない
				if (number[2] == B) roll("WSE");  //Bが③の時：W→S→E
				else if (number[4] == B) roll("ESW");  //Bが④の時：E→S→W
				else roll("SENWSE");  //Bが⑤の時：S→E→N→Bが③になる→W→S→E
			}
		}
	}
}

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){

			int [] n = new int[6];
			for (int i=0; i<6; i++) n[i] = sc.nextInt(); //diceの数字を取得
			Dice2 dice2 = new Dice2(n);
			int times = sc.nextInt();
			int [] result = new int[times];
			for (int i=0; i< times; i++) {
				result[i] = -1;
				int A = sc.nextInt();
				int B = sc.nextInt();
				dice2.rollUntilAB(A, B);
				result[i] = dice2.getDice(2);  //右を出力
			}
			for (int i=0; i< times; i++) {
				System.out.println(result[i]);  //結果出力
			}
		}
	}
}

