import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		System.out.println((a * b) + " " + (a * 2 + b * 2));
	}
}