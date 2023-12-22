import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(fibonacci(scanner.nextInt()));
	}
	
	static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 	1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}

}