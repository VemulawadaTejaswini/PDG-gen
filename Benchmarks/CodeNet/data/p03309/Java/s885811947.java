import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long ave = 0;

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			A[i] -= i+1;
			ave += A[i];
		}ave /= N;

		int[] ans = new int[5];

		for(int j=0; j<N; j++) {
			ans[0] += Math.abs(A[j] - ave);
			ans[1] += Math.abs(A[j] - ave - 1);
			ans[2] += Math.abs(A[j] - ave + 1);
			ans[3] += Math.abs(A[j] - ave - 2);
			ans[4] += Math.abs(A[j] - ave - 2);
		}Arrays.sort(ans);

		System.out.println(ans[0]);

	}

}
