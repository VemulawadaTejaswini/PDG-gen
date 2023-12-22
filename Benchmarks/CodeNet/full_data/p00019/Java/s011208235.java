import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println( factional( sc.nextInt() ) );
	}

	private static long factional(int nextInt) {
		int n = nextInt;

		long ans = (n == 0) ? 1: n * factional(n - 1);

		return ans;
	}

}
