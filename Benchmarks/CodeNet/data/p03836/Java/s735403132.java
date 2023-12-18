import java.nio.CharBuffer;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int SX = sc.nextInt();
		int SY = sc.nextInt();
		int TX = sc.nextInt();
		int TY = sc.nextInt();
		int w = Math.abs(TX - SX);
		int h = Math.abs(TY - SY);
		CharBuffer cb = CharBuffer.allocate(8 + w * 4 + h * 4);
		cb.append('D');
		for (int i = 0; i < w; i++) {
			cb.append('R');
		}
		cb.append('R');
		cb.append('U');
		for (int i = 0; i < h; i++) {
			cb.append('U');
		}
		cb.append('L');
		for (int i = 0; i < w; i++) {
			cb.append('L');
		}
		for (int i = 0; i < h; i++) {
			cb.append('D');
		}
		cb.append('L');
		for (int i = 0; i < h; i++) {
			cb.append('U');
		}
		cb.append('U');
		cb.append('R');
		for (int i = 0; i < w; i++) {
			cb.append('R');
		}
		cb.append('D');
		for (int i = 0; i < h; i++) {
			cb.append('D');
		}
		for (int i = 0; i < w; i++) {
			cb.append('L');
		}
		cb.flip();
		System.out.println(cb.toString());
	}

}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}