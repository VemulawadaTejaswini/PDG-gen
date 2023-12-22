import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int[] list = new int[45];
		System.out.println(fibonacci(n, list));
	}

	static int fibonacci(int n, int[] list) {
		
		if (n < 0) {
			return 0;
		}
		if (n == 0 || n == 1) {
			return list[n] = 1;
		}
		if (list[n] != 0) {
			return list[n];
		}
		return list[n] = fibonacci(n - 1, list) + fibonacci(n - 2, list);
	}
}