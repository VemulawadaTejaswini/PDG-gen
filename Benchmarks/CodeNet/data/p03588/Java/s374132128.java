import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long a = scan.nextInt();
		long b = scan.nextInt();
		for (int i = 0; i < n - 1; i++) {
			long ai = scan.nextInt();
			long bi = scan.nextInt();
			if (ai > a) {
				a = ai;
				b = bi;
			}
		}
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
