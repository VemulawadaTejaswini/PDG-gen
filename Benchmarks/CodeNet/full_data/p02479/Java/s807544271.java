import java.util.Scanner;


class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		double PI = Math.PI;
		System.out.printf("%f %f\n", a * a * PI, a * 2 * PI);
	}
}