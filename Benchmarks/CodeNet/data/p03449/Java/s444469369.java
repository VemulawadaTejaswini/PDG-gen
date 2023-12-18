
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A1 = new int[N];
		int[] A2 = new int[N];
		int A1sum = 0;
		int A2sum = 0;
		for (int i = 0; i < N; i++) {
			A1[i] = in.nextInt();
			A1sum += A1[i];
		}
		A1sum -= A1[0];
		for (int i = 0; i < N; i++) {
			A2[i] = in.nextInt();
			A2sum += A2[i];
		}
		A2sum -= A2[A2.length - 1];
		int ans = A1[0];
		for (int i = 0; i < N; i++) {
			if (i < N - 1 && A1sum > A2sum) {
				ans += A1[i + 1];
				A1sum -= A1[i + 1];
				A2sum -= A2[i];
			} else {
				ans += A2sum + A2[A2.length - 1];
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
}