import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if (0>(x+r) || 0>(y+r)) {
			System.out.print("No");
		} else if (W < (x + r) || H < (y + r)) {
			System.out.print("No");
		} else {
			System.out.print("Yes");
		}
	}
}
