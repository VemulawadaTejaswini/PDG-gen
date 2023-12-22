import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		System.out.printf("%f %f\n", a * a * Math.PI, a * 2 * Math.PI);
	}
}