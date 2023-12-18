import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int x = x2;
		int y = y2;
		int distX = x2 - x1;
		int distY = y2 - y1;

		for (int i = 0; i < 2; i++) {
			int tmp = distX;
			distX = distY;
			distY = tmp;

			distX = -distX;

			x2 += distX;
			y2 += distY;

			System.out.print(x2 + " " + y2 + " ");
		}
	}
}