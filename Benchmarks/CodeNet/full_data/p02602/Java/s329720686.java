import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = K; i < N; i++) {
			if (A[i - K] >= A[i]) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

}