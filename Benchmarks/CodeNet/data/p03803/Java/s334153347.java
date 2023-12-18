import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i < a; i++) {
			for (int j = 1; j < b; j++) {
				if (a == 1 || a > b) {
					System.out.println("Alice");
				} else if (b == 1 || b > a) {
					System.out.println("Bob");
				} else if (a == b) {
					System.out.println("Draw");
				}
			}
		}
	}
}