import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long K = sc.nextLong();
		int N = sc.nextInt();
		long[] A = new long[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}

		long[] B = new long[N];

		for(int i=0; i<N; i++) {
			if(A[i] <= (K-1)/2)
				B[i] = A[i] + K;
			else
				B[i] = A[i];
		}

		Arrays.sort(B);

		long ans;
		if(A[N-1] - A[0] < B[N-1] - B[0])
			ans = A[N-1] - A[0];
		else
			ans = B[N-1] - B[0];

		System.out.println(ans);
	}

}