import java.util.Scanner;

public class ABC133 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		long[] ans = new long[N];
		boolean plus = true;
		for(int i = 0;i < N;i++) {
			ans[0] += plus?A[i]:-A[i];
			plus = !plus;
		}
		for(int i = 1;i <N;i++) {
			ans[i] = 2 * (A[i-1] - ans[i-1]/2);
		}
		for(int i = 0;i < N;i++) {
			System.out.print(((i==0)?"":" ") + ans[i]);
		}
	}

}