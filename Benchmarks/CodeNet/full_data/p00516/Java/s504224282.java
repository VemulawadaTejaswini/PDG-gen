import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		int[] c = new int[N];
		for (int i = 0; i < M; ++i) {
			int B = sc.nextInt();
			for (int j = 0; j < N; ++j) {
				if (A[j] <= B) {
					c[j]++;
					break;
				}
			}
		}
		int max = 0;
		int mi = 0;
		for (int i = 0; i < N; ++i) {
			if (c[i] > max) {
				max = c[i];
				mi = i;
			}
		}
		System.out.println(mi + 1);
	}

}