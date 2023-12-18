import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j  < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();

		int b[] = new int[N];

		for (int k = 0; k < N; k++) {
			int tmp = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j  < 3; j++) {
					if (A[i][j] == tmp) A[i][j] = 0;
				}
			}
		}

		boolean possible = false;
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j  < 3; j++) {
				sum += A[i][j];
			}
			if (sum == 0) possible = true;
		}

		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j  < 3; j++) {
				sum += A[j][i];
			}
			if (sum == 0) possible = true;
		}

		if (A[0][0] + A[1][1] + A[2][2] == 0) possible = true;
		if (A[0][2] + A[1][1] + A[2][0] == 0) possible = true;


		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}