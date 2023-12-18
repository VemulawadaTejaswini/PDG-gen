import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();
		int prevT = 0;
		int prevX = 0;
		int prevY = 0;
		for (int i = 0; i < num; i++) {
			int t = stdin.nextInt();
			int x = stdin.nextInt();
			int y = stdin.nextInt();

			int time = t - prevT;
			int move = Math.abs(x - prevX) + Math.abs(y - prevY);
			if ((time < move) || ((time - move) % 2 > 0)) {
				System.out.println("No");
				return;
			}

			prevT = t;
			prevX = x;
			prevY = y;
		}

		System.out.println("Yes");
	}

}
