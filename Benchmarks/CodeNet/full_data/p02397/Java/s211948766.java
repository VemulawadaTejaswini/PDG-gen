import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if (x == 0 && y == 0) break;
			
			if (x > y) {
				int t = x;
				x = y;
				y = t;
			}
			
			System.out.println(x + " " + y);
		}
	}

}

