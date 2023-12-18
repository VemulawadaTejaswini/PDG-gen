import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String I = "";
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S[] = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
			if (i == K - 1) {
				S[i] = S[i].toLowerCase();
			}
			I += S[i];
		}
		System.out.print(I);
	}
}
