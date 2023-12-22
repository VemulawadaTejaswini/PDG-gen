import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		while (true) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			if (x == 0 && y == 0)
				break;
			if (x < y)
				System.out.println(x + " " + y);
			else
				System.out.println(y + " " + x);
		}
		scanner.close();
	}
}