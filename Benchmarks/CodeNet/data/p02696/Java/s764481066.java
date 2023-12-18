import java.util.Scanner;

public class Main {

	public static long floor(double num) {
		long result = (long)num;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();

		long ans = 0;
		for(int i = 0; i <= N; i++) {
			ans = floor(A * i / B) - A*floor(i/B);
		}
		System.out.println(ans);
		sc.close();
	}

}
