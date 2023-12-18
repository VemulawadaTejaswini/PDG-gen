import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			boolean possible = true;
			for (int j = 0; j <= i; j++) {
				if (P[i] > P[j]) {
					possible = false;
					break;
				}
			}
			if (possible) answer++;
		}

		System.out.println(answer);
	}
}