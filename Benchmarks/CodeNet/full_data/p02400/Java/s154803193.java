import java.util.Scanner;
class Main {
	public void ci() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double X = 3.141592653589;
		double S = r * 1.0 * r * 1.0 * X;
		double V = (r * 1.0 + r * 1.0) * X;
		System.out.printf("%2.6f %2.6f\n",S,V);
	}
	public static void main(String[] args) {
		new Main().ci();
	}
}