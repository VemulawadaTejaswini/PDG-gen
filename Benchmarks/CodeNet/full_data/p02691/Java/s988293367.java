import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		int minA = A[0];
		int minIdx = 0;
		for (int i = 1; i < N; i++) {
			if (A[i] + minA < i - minIdx) {
				continue;
			} else {
				for (int j = 0; j <= minIdx; j++) {
					if (j - i == A[i] + A[j]) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
