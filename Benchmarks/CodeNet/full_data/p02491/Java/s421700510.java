import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		int d = a / b; // a/bの商
		int r = a % b; // a/bの剰余
		double f = (double)a / b; // a/bの商
		System.out.println(d+" "+r+" "+f);
	}
}