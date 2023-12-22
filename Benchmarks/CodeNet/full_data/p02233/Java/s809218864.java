import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(Main.fibonacciNumber(scan.nextInt()));
	}

	static int fibonacciNumber(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
		}
	}
	
}