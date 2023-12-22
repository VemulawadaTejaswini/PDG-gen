import java.util.Scanner;

class Main {
	static Integer[] F = new Integer[44];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(fibonacci(scanner.nextInt()));
	}
	
	static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 	F[n] = 1;
		} else if (F[n] != null) {
			return F[n];
		} else {
			return F[n] = fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
}