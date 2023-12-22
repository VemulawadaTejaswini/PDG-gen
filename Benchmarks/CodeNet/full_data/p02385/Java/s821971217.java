import java.util.Scanner;

class Dice3{
	int a[] = new int[6];
	int temp;
	Dice3(int face[]){
		for(int i = 0; i < 6; i++) {
			a[i] = face[i];
		}
	}

	void roll(char c) {
		switch(c) {
		case 'E':
			temp = a[5];
			a[5] = a[2];
			a[2] = a[0];
			a[0] = a[3];
			a[3] = temp;
			break;
		case 'N':
			temp = a[5];
			a[5] = a[4];
			a[4] = a[0];
			a[0] = a[1];
			a[1] = temp;
			break;
		case 'S':
			temp = a[5];
			a[5] = a[1];
			a[1] = a[0];
			a[0] = a[4];
			a[4] = temp;
			break;
		case 'W':
			temp = a[5];
			a[5] = a[3];
			a[3] = a[0];
			a[0] = a[2];
			a[2] = temp;
			break;
		}
	}
	void rota() {  //横方向の回転をさせるメソッド
		temp = a[1];
		a[1] = a[2];
		a[2] = a[4];
		a[4] = a[3];
		a[3] = temp;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int face1[] = new int[6];  //1つめのサイコロ
		int face2[] = new int[6];  //2つめのサイコロ
		for(int i = 0; i < 6; i++) {
			face1[i] = sc.nextInt();
		}
		for(int i = 0; i < 6; i++) {
			face2[i] = sc.nextInt();
		}

		char com[] = new char[] {'E', 'E', 'E', 'N', 'N', 'N', 'N'};

		//2つめのサイコロをDiceクラスのインスタンスとして考える
		Dice3 d3 = new Dice3(face2);
		boolean frag = false;  //判定が終了したらtrueにする

		for(int i = 0; i < 7; i++) {  //rollのループ //なぜ7回の操作が必要なのか？
			for(int j = 0; j < 4; j++) {  //rotaのループ
				if(d3.a[0] == face1[0] && d3.a[1] == face1[1] && d3.a[2] == face1[2] && d3.a[3] == face1[3] && d3.a[4] == face1[4] && d3.a[5] == face1[5]) {
					System.out.println("Yes");
					frag = true;
					break;
				}
				if(frag == true) break;
				d3.rota();
			}
			d3.roll(com[i]);
		}
		if(frag == false) System.out.println("No");
	}
}
