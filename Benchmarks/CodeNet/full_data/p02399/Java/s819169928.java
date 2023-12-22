import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double d = (double)a / b;
		String str = String.format("%.5f", d);
		System.out.println((a / b) + " " + (a % b) + " " + str);
	}
}