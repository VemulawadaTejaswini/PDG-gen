import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x = x1 - x2;
		int y = y1 - y2;
		System.out.println(Math.sqrt((x*x) + (y*y)));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}