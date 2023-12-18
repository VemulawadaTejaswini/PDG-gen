import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		if (A[0] == A[N - 1] && A[0] == 0) {
			System.out.println("Yes");
			return;
		} else if (A[0] == A[N / 3 - 1] && A[N / 3 - 1] != A[N / 3] && A[N / 3] == A[N / 3 * 2 - 1]
				&& A[N / 3 * 2 - 1] != A[N / 3 * 2]&&A[N / 3 * 2]==A[N -1]) {
			if (N % 3 != 0) {
				System.out.println("No");
				return;
			} else {
				System.out.println("Yes");
				return;
			}
		} else if (A[0]==0&&A[N/2]==A[0]&&A[N/2+1]!=A[N/2]) {
			if (N%2==0) {
				System.out.println("No");
				return;
			} else {
				System.out.println("Yes");
				return;
			}
		} else {
			System.out.println("No");
			return;
		}
	}
}