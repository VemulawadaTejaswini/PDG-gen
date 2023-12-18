import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}

		int answer = 1;
		for (int i = N - 1; 0 <= i; i--) {
			for (int j = i - 1; 0 <= j; j--) {
				if (P[i] > P[j]) break;
				if (j == 0) answer++;
			}
		}

		System.out.println(answer);
	}
}