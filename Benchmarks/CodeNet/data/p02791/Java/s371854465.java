import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int sum = 1;

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < N; i++) {
			if (P[i] < P[i - 1]) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
