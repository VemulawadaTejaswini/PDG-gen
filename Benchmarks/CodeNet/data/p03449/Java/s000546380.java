import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		int rem1 = 0;
		int rem2 = 0;

		int rec = 1;
		for (int j = 0; j < N; j++) {
			if (rec ==1) {
				sum += A[0][j];
				for (int k = j + 1; k < N; k++) {
					rem1 += A[0][k];
					rem2 += A[1][k];
				}
				if(A[1][j] >= rem2) {
					sum += A[1][j];
					rec = 2;
				}
			} else {
				sum += A[1][j];
			}
			rem1 = 0;
			rem2 = 0;
		}
		System.out.println(sum);
	}
}
