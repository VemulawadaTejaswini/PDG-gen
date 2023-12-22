import java.util.ArrayList;
import java.util.Scanner;

class Dice4{
	private int[] number = new int[6]; //Diceの方向には何の数字かを示す
										//初期値の順番と一緒：上面①、その下②、その右③、その左④、その上⑤、その反面⑥（Indexと一個違い）

	public Dice4(int[] n) {
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

	public void rollToAB(int A,int B) {
		if (number[0]!=A) {		//Aは①面ではない
			if (number[2] == A) roll("W"); //Aが③の時：W
			else if (number[3] == A) roll("E"); //Aが④の時：E
			else if (number[1] == A) roll("N"); //Aが②の時：N
			else if (number[4] == A) roll("S"); //Aが⑤の時：S
			else roll("NN"); //Aが⑥の時：NN
		}
		if (number[1]!=B){  //Aは①面にあって、Bは②にない
			if (number[2] == B) roll("WSE");  //Bが③の時：W→S→E
			else if (number[3] == B) roll("ESW");  //Bが④の時：E→S→W
			else if (number[4] == B) roll("SENWSE");  //Bが⑤の時：S→E→N→Bが③になる→W→S→E
			else number[2] = -1;  //Bが⑥の時：必ず異なる
		}
	}
}

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int nod = sc.nextInt();  //number of dice

			Dice4[] dices = new Dice4[nod];  //Diceの配列を生成

			int [] n = new int[6];
			for (int i=0; i<nod; i++) {
				for (int j=0; j<6; j++) {
					n[j] = sc.nextInt();
				}
				dices[i] = new Dice4(n);  //初期化
			}

			boolean flag = false;
			ArrayList<Integer> array = new ArrayList<Integer>();

			//ラベルで二重ループを脱出
			comparison: for (int i=0; i<nod-1; i++) {  //サイコロの数-1でループ
				for (int j=i+1; j<nod; j++) {  //dice iとその以降のサイコロを比較
					array.removeAll(array);  //初期化
					for (int k=0; k<6; k++) array.add(dices[i].getDice(k));  //dice iの面をArrayListに入れる
					for (int k=0; k<6; k++) {
						int side = dices[j].getDice(k);  //チェックする面を取得
						if (array.contains(side)) array.remove(array.indexOf(side));  //同じのあったら消す
					}
					if (array.size() == 0) {  //6面の数字が一緒だったら（全部消したら）
						dices[j].rollToAB(dices[i].getDice(0), dices[i].getDice(1));  //dice jの向きを調整する
						if ((dices[i].getDice(2) == dices[j].getDice(2)) && (dices[i].getDice(3) == dices[j].getDice(3)) &&
								(dices[i].getDice(4) == dices[j].getDice(4)) && (dices[i].getDice(5) == dices[j].getDice(5))) {
							flag = true; //同じサイコロがあったらtrue
							break comparison; //以降の検証いらない
						}
					}
				}
			}
			System.out.println(flag ? "No" : "Yes");
		}
	}
}
