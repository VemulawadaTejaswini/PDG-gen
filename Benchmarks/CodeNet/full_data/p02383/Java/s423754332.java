import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		Dice dice = new Dice(num);
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		dice.setFace(num);
		String str = sc.next();
		dice.order(str);
		System.out.println(dice.getFace());
		sc.close();
	}
}

class Dice {
	private int face[] = new int[6];

	Dice(int[] num) {
		for (int i = 0; i < 6; i++) {
			this.face[i] = num[i];
		}
	}

	public void order(String str) {
		char[] order = str.toCharArray();
		for (int i = 0; i < order.length; i++) {
			switch (order[i]) {
			case 'N':
				rollToNorth();
				break;
			case 'S':
				rollToSouth();
				break;
			case 'E':
				rollToEast();
				break;
			case 'W':
				rollToWest();
				break;
			}
		}
	}

	public void rollToNorth() {
		int tmp;
		tmp = face[0];
		face[0] = face[1];
		face[1] = face[5];
		face[5] = face[4];
		face[4] = tmp;
	}

	public void rollToSouth() {
		int tmp;
		tmp = face[0];
		face[0] = face[4];
		face[4] = face[5];
		face[5] = face[1];
		face[1] = tmp;
	}

	public void rollToEast() {
		int tmp;
		tmp = face[0];
		face[0] = face[3];
		face[3] = face[5];
		face[5] = face[2];
		face[2] = tmp;
	}

	public void rollToWest() {
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

	public void setFace(int[] face) {
		this.face = face;
	}
}
