import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int counter = 0;
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		boolean flg = true;
		while (flg) {
			for (int i = 0; i < N; i++) {
				if (A[i] % 2 == 0) {
					A[i] = A[i] / 2;
				} else {
					flg = false;
					break;
				}
				if (i == N - 1) counter++;
			}
		}
		System.out.println(counter);
	}
}
