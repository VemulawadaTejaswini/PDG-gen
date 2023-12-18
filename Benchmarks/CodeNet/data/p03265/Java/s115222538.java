import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int width = x2 - x1;
		int height = y2 - y1;

		int x3 = x2 - height;
		int y3 = y2 + width;
		int x4 = x1 - height;
		int y4 = y1 + width;

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

	}
}