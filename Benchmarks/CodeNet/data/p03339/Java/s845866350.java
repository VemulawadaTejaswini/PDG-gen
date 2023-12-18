import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String S = reader.next();
		char[] arr = S.toCharArray();
		int[] accumulateE = new int[N+1];
		int[] accumulateW = new int[N+1];

		for (int i = 1; i <= N; i++) {
			accumulateW[i] = accumulateW[i-1];
			if (arr[i-1] == 'W') {
				accumulateW[i]++;
			}
		}

		for (int i = N - 1; i >= 0; i--) {
			accumulateE[i] = accumulateE[i+1];
			if (arr[i] == 'E') {
				accumulateE[i]++;
			}
		}

		int min = 30000;
		for (int i = 0; i < N; i++) {
			int count = accumulateW[i];
			if (i < N + 1) {
				count += accumulateE[i + 1];
			}
			if (count < min) {
				min = count;
			}
		}

		reader.close();
		System.out.print(min);
	}
}

