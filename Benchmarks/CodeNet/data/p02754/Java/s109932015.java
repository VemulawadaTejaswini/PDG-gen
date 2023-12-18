import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		int countA = 0;
		int countB = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < A; j++) {
				countA++;
				if (countA + countB == N) {
					System.out.println(countA);
					return;
				}
			}

			for (int k = 0; k < B; k++) {
				countB++;
				if (countA + countB == N) {
					System.out.println(countA);
					return;
				}
			}
		}
		System.out.println(countA);
	}
}