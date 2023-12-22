import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] A = new int[N];
		int ans = 1;

		for(int i = 0;i < N;i++) {
			A[i] = scan.nextInt();
		}

		Arrays.sort(A);

		for(int i = 1;i <= N;i++) {
			for(int j = 0;j < N - i;j++) {
				if(A[N-i] % A[j] == 0) {
					break;
				}
				if(j == N - i - 1) {
					ans++;
				}
			}
		}

		if(A[0] == A[1]) {
			ans--;
		}

		System.out.println(ans);

	}
}