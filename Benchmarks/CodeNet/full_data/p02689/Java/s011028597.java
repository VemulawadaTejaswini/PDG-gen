import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] H = new int[N];
		boolean[] isGood = new boolean[N];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			H[i] = scan.nextInt();
			isGood[i] = true;
		}

		for (int i = 0; i < M; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			if (H[A - 1] >= H[B - 1]) isGood[B - 1] = false;
			else if (H[A - 1] == H [B - 1]) {
				isGood[A - 1] = false;
				isGood[B - 1] = false;
			}
			else isGood[A - 1] = false;
		}

		for (int i = 0; i < N; i++) {
			if (isGood[i]) answer++;
		}

		System.out.println(answer);
	}
}