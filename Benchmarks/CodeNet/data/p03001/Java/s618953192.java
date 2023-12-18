import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextInt();
		long H = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();

		if (W / 2 == x && H / 2 == y) {
			System.out.println(W * H / 2 + " " + 1);
		} else {
			System.out.println(W * H / 2 + " " + 0);
		}
	}
}
