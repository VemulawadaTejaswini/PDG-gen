import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = a / b;
		int r = a % b;
		double f = (double) a / b;

		System.out.printf(d + " " + r + " " + String.format("%.5f",f));
	}

}