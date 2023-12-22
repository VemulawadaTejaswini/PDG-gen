
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int[] num = new int[45];

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			fib(i);
		}
		System.out.println(num[n]);
	}

	private int fib(int n) {
		if (n == 0)
			return num[n] = 1;
		else if (n == 1)
			return num[n] = 1;
		else if(num[n]!=0)
			return num[n];
		else
			return num[n] = fib(n - 2) + fib(n - 1);
	}
}