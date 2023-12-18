import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int w[] = new int[N];

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int S1 = 0;
			int S2 = 0;
			for (int j = 0; j <=i; j++) {
				S1 += w[j];
			}
			for (int j = i+1; j < N; j++) {
				S2 += w[j];
			}
			min = Math.min(Math.abs(S1-S2), min);
		}
		System.out.println(min);
	}
}
