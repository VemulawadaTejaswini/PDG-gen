import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];

		double sum = 0;
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			sum += X[i];
		}

		double average = Math.round(sum / N);

		int answer = 0;
		for (int i = 0; i < N; i++) {
			answer += Math.pow(X[i] - average, 2);
		}

		System.out.println(answer);
	}
}