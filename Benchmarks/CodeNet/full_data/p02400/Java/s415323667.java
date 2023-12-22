import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		System.out.println(String.format("%.5f", Math.pow((double) r, 2) * Math.PI) + " " + String.format("%.5f", (double) r * 2 * Math.PI));
	}
}