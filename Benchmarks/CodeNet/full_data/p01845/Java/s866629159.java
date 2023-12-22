import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int r0 = sc.nextInt();
			int w0 = sc.nextInt();
			int c = sc.nextInt();
			int r = sc.nextInt();

			if ((r0 | w0 | c | r) == 0) {
				break;
			}
			System.out.println(solve(r0, w0, c, r));
		}
	}

	// find min X s.t. (R0 + X R) / (W0 + Y) = c
	long solve(int r0,int w0,int c,int r){
		return Math.max(0, (w0 *c - r0 +(r-1))/r);
	}

}

