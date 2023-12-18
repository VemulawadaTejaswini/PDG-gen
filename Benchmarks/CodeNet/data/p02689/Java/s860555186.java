import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		long[] H = new long[N];
		boolean[] isGood = new boolean[N];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			H[i] = scan.nextLong();
			isGood[i] = true;
		}

		for (int i = 0; i < M; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			if (H[A - 1] > H[B - 1]) isGood[B - 1] = false;
			else if (H[A - 1] == H[B - 1]) {}
			else isGood[A - 1] = false;
		}

		for (int i = 0; i < N; i++) {
			if (isGood[i]) answer++;
		}

		System.out.println(answer);
	}
}