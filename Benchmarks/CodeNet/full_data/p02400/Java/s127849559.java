import java.util.Scanner;
class Main {
	public void ci() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double X = 3.141592653589;
		System.out.printf("%2.6f %2.6f", r * 1.0 * r * 1.0 * X,(r * 1.0 + r * 1.0) * X);
	}
	public static void main(String[] args) {
		new Main().ci();
	}
}