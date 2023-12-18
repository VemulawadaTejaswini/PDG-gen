import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int N = sc.nextInt();
			double M = sc.nextInt();
			int[] A = new int[N];

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			double soutokuhyo = 0;
			for (int i = 0; i < N; i++) {
				soutokuhyo += A[i];
			}
			double yuukouper = soutokuhyo * (1 / (4 * M));
			double ninki = 0;
			for (int i = 0; i < N; i++) {
				if (A[i] >= yuukouper) {
					ninki++;
				}
			}

			String ans;
			if (ninki >= M) {
				ans = "Yes";
			} else {
				ans = "No";
			}
			System.out.println(ans);

		} finally

		{
			sc.close();
		}
	}

}
