import java.util.Scanner;

class Dice {
	private int a[] = new int[6];

	Dice(int face[]){
		for(int i = 0; i < 6; i++) {
			this.a[i] = face[i];
		}
	}

	public void roll(char c) {
		int temp;
		switch(c) {
		case 'E':
			temp = this.a[5];
			this.a[5] = this.a[2];
			this.a[2] = this.a[0];
			this.a[0] = this.a[3];
			this.a[3] = temp;
			break;
		case 'N':
			temp = a[5];
			this.a[5] = this. a[4];
			this.a[4] = this.a[0];
			this.a[0] = this.a[1];
			this.a[1] = temp;
			break;
		case 'S':
			temp = this.a[5];
			this.a[5] = this.a[1];
			this.a[1] = this.a[0];
			this.a[0] = this.a[4];
			this.a[4] = temp;
			break;
		case 'W':
			temp = this.a[5];
			this.a[5] = this.a[3];
			this.a[3] = this.a[0];
			this.a[0] = this.a[2];
			this.a[2] = temp;
			break;
		}
	}

	public int getA(int i) {
		return this.a[i];
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
		String command = sc.next();
		char com[] = command.toCharArray();  //コマンドを配列にする

		Dice d1 = new Dice(face);

		for(int i = 0; i < command.length(); i++) {
			//System.out.println(face);
				d1.roll(com[i]);

		}
		System.out.println(d1.getA(0));

	}

}

