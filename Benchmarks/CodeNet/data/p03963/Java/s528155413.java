import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		int K = sc.nextInt();
		long count = K;
		for (int i = 0; i < N - 1; i++) {
			count *= (K - 1);
		}
		System.out.println(count);
		sc.close();
	}
}