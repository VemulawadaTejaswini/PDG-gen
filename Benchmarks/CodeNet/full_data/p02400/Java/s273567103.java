import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		System.out.println(Math.pow((double) r, 2) * Math.PI + " " + (double) r * 2 * Math.PI);
	}
}