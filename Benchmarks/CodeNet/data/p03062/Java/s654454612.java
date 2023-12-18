import java.util.Scanner;

public class Main {

	private static long[] A;

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		long[] A = new long[N];
		for(int i = 0 ; i < N ; i++ ) {
			A[i] = Long.parseLong(sc.next());
		}

		//Logic
		long answer = dp(N, 0);

		//Output
		System.out.println(answer);

	}

	private static long dp(int i, int j) {
		if(i == 0 && j == 0) {
			return 0;
		} else if (i == 0 && j == 1) {
			return -1000000000*100;
		}

		if(j == 0) {
			return Math.max(dp(i-1,0)+A[i-1], dp(i-1,1)-A[i-1]);
		} else {
			return Math.max(dp(i-1,0)-A[i-1], dp(i-1,1)+A[i-1]);
		}

	}

}
