import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		
		
		if (x - r < 0) {
			System.out.println("No");
			return;
		}
			
		
		if (y - r < 0) {
			System.out.println("No");
			return;
		}
		
		if (x + r > w) {
			System.out.println("No");
			return;
		}
		
		if (y + r > h) {
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
	}
}

