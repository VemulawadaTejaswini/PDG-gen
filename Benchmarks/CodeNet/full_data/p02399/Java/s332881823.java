import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float x = a;
		float y = b;
		int d = a / b;
		int r = a % b;
		double f = x / y;

		System.out.println(String.format("%d %d %.5f", d,r,f) );
	}
}