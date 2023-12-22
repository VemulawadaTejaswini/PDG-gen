import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int W = scn.nextInt();
		int H = scn.nextInt();
		int x = scn.nextInt();
		int y = scn.nextInt();
		int r = scn.nextInt();

		if (x >= r && y >= r && x <= W - r && y <= H - r) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
