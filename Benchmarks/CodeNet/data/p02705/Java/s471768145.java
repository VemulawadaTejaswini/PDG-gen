import java.util.Scanner;

class Main {

	String fnc(int r) {
		return "" + Math.PI * 2 * r;
	}

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int r = sc.nextInt();
				System.out.println(fnc(r));
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
