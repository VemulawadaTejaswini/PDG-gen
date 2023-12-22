import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		sc.close();
		int d = (int) ((int)a / b);
		int r = (int) ((int)a % b);
		float f = a / b;
		System.out.printf("%d %d %.5f", d, r, f);
	}
}