import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] P = new int[N];
		int[] M = new int[N];
		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				P[i] = 1;
			}
			else {
				P[i] = i + 2;
			}
		}
		for (int i = 0; i < N; i++) {
			M[i] = (i + 1) % P[i];
		}
		System.out.println(Arrays.stream(M).sum());
	}
}