
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int s11 = sc.nextInt();
		int s12 = sc.nextInt();
		int s13 = sc.nextInt();
		int s14 = sc.nextInt();
		int s15 = sc.nextInt();
		int s16 = sc.nextInt();
		int s21 = sc.nextInt();
		int s22 = sc.nextInt();
		int s23 = sc.nextInt();
		int s24 = sc.nextInt();
		int s25 = sc.nextInt();
		int s26 = sc.nextInt();
		d1.setSurf(s11, s12, s13, s14, s15, s16);
		d2.setSurf(s21, s22, s23, s24, s25, s26);
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				flag = d1.getSurf1() == d2.getSurf1() &&
						d1.getSurf3() == d2.getSurf3() &&
						d1.getSurf4() == d2.getSurf4() &&
						d1.getSurf6() == d2.getSurf6();
				if (flag) {
					break;
				}
				d2.rollE();
			}
			flag = d1.getSurf1() == d2.getSurf1() &&
					d1.getSurf2() == d2.getSurf2() &&
					d1.getSurf5() == d2.getSurf5() &&
					d1.getSurf6() == d2.getSurf6();
			if (flag) {
				break;
			}
			d2.rollR();
		}
		if (d1.equals(d2)) {
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
