import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		int count = 0;
		int num = 0;
		int j = 0;
		int i = 0;

		for (i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		i = 0;

		for (j = 0; j < N; j++) {
			num = 0;
			for (i = 0; i + j < N; i++) {

				if ((num = num + A[i + j]) == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
