import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int num = 0, min = 10000;

		for (int i = 0-N; i < N; i++) {
			num=0;
			for (int j = 0; j < N; j++) {
				num += Math.abs(A[j] - (i + (j + 1)));
			}
			min=Math.min(min, num);
		}
		System.out.println(min);

	}
}