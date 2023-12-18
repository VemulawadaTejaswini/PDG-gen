import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = N + func(Math.min(N-X, X), Math.max(N-X, X));
		System.out.println(sum);
		sc.close();
	}

	private static int func(int a, int b) {
		if (a==0) return -1;
		return 2*a*(int)(b/a)+func(b%a, a);
	}
}
