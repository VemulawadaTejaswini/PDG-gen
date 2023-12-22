import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (y > x) {
			int swap = x;
			x = y;
			y = swap;
		}
		while (x > y)
			x = x % y;
		while (y > x && x != 0)
			y = y % x;
		System.out.println(y == 0 ? x : y);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

