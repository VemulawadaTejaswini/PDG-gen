import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((b <= c) || (d <= a)) {
			System.out.println(0);
		} else {
			if (a < c) {
				if (b < d) System.out.println(b - c);
				else System.out.println(d - c);
			} else {
				if (b < d) System.out.println(b - a);
				else System.out.println(d - a);
			}
		}
	}
}