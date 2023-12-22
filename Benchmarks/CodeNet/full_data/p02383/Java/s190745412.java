import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		Dice dice = new Dice(num);
		String str = sc.next();
		dice.order(str);
		System.out.println(dice.getFace());
		sc.close();
	}
}

public class Dice {

	private int face[] = new int[6];

	public void setFace(int[] face) {
		this.face = face;
	}

	Dice(int[] num) {
		for (int i = 0; i < 6; i++) {
			this.face[i] = num[i];
		}
	}

	void order(String str) {
		char[] order = str.toCharArray();
		for (int i = 0; i < order.length; i++) {
			switch (order[i]) {
			case 'N':
				north();
				break;
			case 'S':
				south();
				break;
			case 'E':
				east();
				break;
			case 'W':
				west();
				break;
			}
		}
	}

	void north() {
		int tmp;
		tmp = face[0];
		face[0] = face[1];
		face[1] = face[5];
		face[5] = face[4];
		face[4] = tmp;
	}

	void south() {
		int tmp;
		tmp = face[0];
		face[0] = face[4];
		face[4] = face[5];
		face[5] = face[1];
		face[1] = tmp;
	}

	void east() {
		int tmp;
		tmp = face[0];
		face[0] = face[3];
		face[3] = face[5];
		face[5] = face[2];
		face[2] = tmp;
	}

	void west() {
		int tmp;
		tmp = face[0];
		face[0] = face[2];
		face[2] = face[5];
		face[5] = face[3];
		face[3] = tmp;
	}

	public int getFace() {
		return face[0];
	}
}
