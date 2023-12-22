import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int P = sc.nextInt();
			if (N == 0 && M == 0 && P == 0)
				break;
			int X[] = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				X[i] = sc.nextInt();
				sum += X[i];
			}
			if (X[M - 1] != 0)
				System.out.println(sum * (100 - P) / X[M - 1]);
			else
				System.out.println("0");
		}
	}
}