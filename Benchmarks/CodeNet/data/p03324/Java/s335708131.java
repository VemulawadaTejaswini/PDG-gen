import java.util.Scanner;

public class Main extends Thread implements Runnable {
	public static void main(String[] args) {

		Main main = new Main();
		main.run();
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A == 0) {
			if (B == 100) {
				System.out.println(B + 100);
			} else {
				System.out.println(B);
			}
		} else {
			if (B == 100) {
				System.out.println(B * 100 ^ A + 100);
			} else {
				System.out.println(B * 100 ^ A);
			}
		}

	}
}