import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		boolean[] doHave = new boolean[N + 1];
		int answer = 0;

		for (int i = 0; i < K; i++) {
			int d = scan.nextInt();
			for (int k = 0; k < d; k++) {
				doHave[scan.nextInt()] = true;
			}
		}

		for (int i = 1; i <= N; i++) {
			if (!doHave[i]) answer++;
		}

		System.out.println(answer);
	}
}