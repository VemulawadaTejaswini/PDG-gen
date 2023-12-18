import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] > max) {
				max = A[i];
			}
		}
		int maxhalf = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (A[i] < Math.abs(max / 2 - maxhalf)) {
				maxhalf = A[i];
			}
		}

		System.out.println(max + " " + maxhalf);

	}
}
