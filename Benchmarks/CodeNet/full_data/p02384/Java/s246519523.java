import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		int s6 = sc.nextInt();
		dice.setSurf(s1, s2, s3, s4, s5, s6);
		int q = sc.nextInt();
		int ue[] = new int[q];
		int mae[] = new int[q];
		for (int i = 0; i < q; i++) {
			ue[i] = sc.nextInt();
			mae[i] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			while (true) {
				if (ue[i] == dice.getSurf1() && mae[i] == dice.getSurf2()) {
					System.out.println(dice.getSurf3());
					break;
				} else if (ue[i] != dice.getSurf1()) {
					dice.rollN();
				} else if (mae[i] != dice.getSurf2()) {
					dice.rollR();
				}
			}
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
}
