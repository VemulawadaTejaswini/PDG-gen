import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		double C = Math.toRadians(scan.nextDouble());
		double S = a * b * Math.sin(C) / 2;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2  * a * b * Math.cos(C));
		double h = b * Math.sin(C);
		String line_sep = System.getProperty("line.separator");
		System.out.println(S + line_sep + c + line_sep + h);
	}
}