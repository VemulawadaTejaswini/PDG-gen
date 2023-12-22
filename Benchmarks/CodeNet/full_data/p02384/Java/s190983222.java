import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dice dc = new Dice();

		for (int i = 0; i < 6; i++) {
			dc.n[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int top, front;
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			top = sc.nextInt();
			front = sc.nextInt();
			r[i] = dc.getRight(top, front);
		}

		for (int i = 0; i < q; i++) {
			System.out.println(r[i]);
		}
	}

}

class Dice {
	public int[] n = new int[6];
	private int temp = 0;

	void north() {
		temp = n[0];
		n[0] = n[1];
		n[1] = n[5];
		n[5] = n[4];
		n[4] = temp;
	}

	void south() {
		temp = n[0];
		n[0] = n[4];
		n[4] = n[5];
		n[5] = n[1];
		n[1] = temp;
	}

	void west() {
		temp = n[0];
		n[0] = n[2];
		n[2] = n[5];
		n[5] = n[3];
		n[3] = temp;
	}

	void east() {
		temp = n[0];
		n[0] = n[3];
		n[3] = n[5];
		n[5] = n[2];
		n[2] = temp;
	}
	void right() {
        temp = n[1];
        n[1] = n[2];
        n[2] = n[4];
        n[4] = n[3];
        n[3] = temp;
    }

	int getRight(int t, int f) {
		for (int i = 0; i < 3; i++) {
			if (t == n[0]) {
				break;
			}
			north();
			if (t == n[0]) {
				break;
			}
			west();
		}
		for (int i = 0; i < 3; i++) {
			if (f == n[1]) {
				break;
			}
			right();
		}
		return n[2];
	}

}
