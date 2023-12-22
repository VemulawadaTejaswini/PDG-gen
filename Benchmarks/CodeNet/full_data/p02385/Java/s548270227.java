
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int n[] = new int[12];
		for (int i = 0; i < 12; i++) {
			n[i] = sc.nextInt();
		}
		d1.setSurf(n[0], n[1], n[2], n[3], n[4], n[5]);
		boolean flag = false;
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				d2.setSurf(n[6], n[7], n[8], n[9], n[10], n[11]);
			case 1:
				d2.setSurf(n[11], n[6], n[7], n[8], n[9], n[10]);
			case 2:
				d2.setSurf(n[10], n[11], n[6], n[7], n[8], n[9]);
			case 3:
				d2.setSurf(n[9], n[10], n[11], n[6], n[7], n[8]);
			case 4:
				d2.setSurf(n[8], n[9], n[10], n[11], n[6], n[7]);
			case 5:
				d2.setSurf(n[7], n[8], n[9], n[10], n[11], n[6]);
			}
			if (d1.equals(d2)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

class Dice {
	private int surf1;
	private int surf2;
	private int surf3;
	private int surf4;
	private int surf5;
	private int surf6;
	private int upper;
	private int rightside;

	public int getSurf1() {
		return surf1;
	}

	public int getSurf2() {
		return surf2;
	}

	public int getSurf3() {
		return surf3;
	}

	public int getSurf4() {
		return surf4;
	}

	public int getSurf5() {
		return surf5;
	}

	public int getSurf6() {
		return surf6;
	}

	public void setSurf(int surf1, int surf2, int surf3, int surf4, int surf5, int surf6) {
		this.surf1 = surf1;
		this.surf2 = surf2;
		this.surf3 = surf3;
		this.surf4 = surf4;
		this.surf5 = surf5;
		this.surf6 = surf6;
	}

	public void rollN() {
		this.upper = this.surf2;
		this.surf2 = this.surf6;
		this.surf6 = this.surf5;
		this.surf5 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollS() {
		this.upper = this.surf5;
		this.surf5 = this.surf6;
		this.surf6 = this.surf2;
		this.surf2 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollE() {
		this.upper = this.surf4;
		this.surf4 = this.surf6;
		this.surf6 = this.surf3;
		this.surf3 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollW() {
		this.upper = this.surf3;
		this.surf3 = this.surf6;
		this.surf6 = this.surf4;
		this.surf4 = this.surf1;
		this.surf1 = this.upper;
	}

	public void rollR() {
		this.rightside = this.surf5;
		this.surf5 = this.surf4;
		this.surf4 = this.surf2;
		this.surf2 = this.surf3;
		this.surf3 = this.rightside;
	}

	public boolean equals(Dice dice) {
		boolean flag = dice.getSurf1() == this.surf1 &&
				dice.getSurf2() == this.surf2 &&
				dice.getSurf3() == this.surf3 &&
				dice.getSurf4() == this.surf4 &&
				dice.getSurf5() == this.surf5 &&
				dice.getSurf6() == this.surf6;
		if (flag) {
			return true;
		} else {
			return false;
		}
	}
}
