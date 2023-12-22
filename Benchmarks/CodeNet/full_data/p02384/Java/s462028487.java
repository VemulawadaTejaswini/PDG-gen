import java.util.Scanner;

class Dice2{
	int a[] = new int[6];
	int temp;
	Dice2(int face[]){
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
	void rota() {
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
		int face[] = new int[6];
		for(int i = 0; i < 6; i++) {
			face[i] = sc.nextInt();
		}

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();


			Dice2 d2 = new Dice2(face);

			//まず初めに上面を合わせる
			while(true) {
				if(d2.a[0] == a) break;
				d2.roll('E');
				if(d2.a[0] == a) break;
				d2.roll('E');
				if(d2.a[0] == a) break;
				d2.roll('E');
				if(d2.a[0] == a) break;
				d2.roll('N');
				if(d2.a[0] == a) break;
				d2.roll('N');
				d2.roll('N');
			}

			for(int j = 0; j < 4; j++) {  //このforループで前面を合わせる
				if(d2.a[1] == b) {
					System.out.println(d2.a[2]);
				}
				d2.rota();
			}
		}
	}

}

