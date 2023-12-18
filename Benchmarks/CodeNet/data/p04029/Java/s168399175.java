import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();
		double ave = (n + 1)/2;
		System.out.println((int)(ave * n));
	}
}