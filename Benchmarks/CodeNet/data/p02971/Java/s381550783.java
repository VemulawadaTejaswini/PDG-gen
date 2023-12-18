
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int j = 0; j < N; j++) {
			max = 0;
			for (int i = 0; i < N; i++) {
				if (j == i) {
					continue;
				}

				if (max <= A[i]) {
					max = A[i];
				}
			}
			System.out.println(max);
		}
	}
}
