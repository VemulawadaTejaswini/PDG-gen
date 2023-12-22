import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int h = s / (60*60);
		s = s % (60*60);
		int m = s / 60;
		s = s % 60;
		System.out.printf("%d:%d:%d\n", h, m, s);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}