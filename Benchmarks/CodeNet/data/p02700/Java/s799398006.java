import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		boolean win = false;
		while (a > 0 || b > 0) {
			c -= b;
			if (c <= 0) {
				win = true;
				break;
			}
			a -= d;
			if (a <= 0) {
				break;
			}
		}
		if (win) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
