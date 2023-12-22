import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		double PI = Math.acos(-1.0);
		System.out.printf("%f %f\n", a * a * PI, a * 2 * PI);
	}
}