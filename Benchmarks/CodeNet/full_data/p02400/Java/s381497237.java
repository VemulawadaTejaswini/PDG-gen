import java.util.Scanner;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		String a = String.format("%.5f", r * r * Math.PI);
		String b = String.format("%.5f", (r * 2) * Math.PI);
		System.out.println(a + " " + b);
	}
}