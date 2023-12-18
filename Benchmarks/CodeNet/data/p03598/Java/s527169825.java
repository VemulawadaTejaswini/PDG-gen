import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int l = 0;
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			l += Math.min(2 * x, 2 * (K - x));
		}
		sc.close();
		System.out.println(l);
	}
}
