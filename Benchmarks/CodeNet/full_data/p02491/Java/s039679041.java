import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		long d = a / b; // a/bの商
		long r = a % b; // a/bの剰余
		double f = (double)a / b; // a/bの商
		System.out.println(d+" "+r+" "+f);
	}
}