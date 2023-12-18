import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int power = 1;
		for(int i = 1; i <= n; i++) {
			power *= i;
			power %= 1000000007;
		}
		System.out.print(power);
	}
}