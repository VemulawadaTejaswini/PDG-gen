import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		System.out.println((int) (a / b) + " " + (int) (a % b) + " " + ((double) a / (double) b));
	}
}