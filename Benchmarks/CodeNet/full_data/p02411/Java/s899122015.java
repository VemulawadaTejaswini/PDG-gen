import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if (m == -1 && f == -1 && r == -1) break;
			if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (f + m >= 65) {
				System.out.println("B");
			} else if (f + m >= 50) {
				System.out.println("C");
			} else if (f + m >= 30) {
				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}