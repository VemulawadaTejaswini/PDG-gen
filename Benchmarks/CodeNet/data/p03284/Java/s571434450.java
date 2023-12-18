import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int min = N/K;
		int max = N/K + N%K;
		int ans = 0;

		if (N % K == 0 ) {
			ans = 0;
		} else {
			ans = Math.abs(max - min);
		}

		System.out.println( ans );
	}
}