import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = reader.nextInt();
		}
		Arrays.sort(A);
		boolean flag = true;
		for (int i = N-1; i > 0; i-=2) {
			if (A[i] != i || A[i-1] != i) {
				flag = false;
			}
		}
		if (N % 2 == 1) {
			flag = flag && A[0] == 0;
		}
		long ans = 0;
		if (flag) {
			ans = ((long) Math.pow(2, N/2)) % 1000000007;
		}
		System.out.print(ans);
		reader.close();
	}
}



