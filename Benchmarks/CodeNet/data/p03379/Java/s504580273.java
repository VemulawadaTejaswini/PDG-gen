import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] X = new long[N];
		long[] I = new long[N];
		for(int i = 0;i < N;i++) {
			X[i] = scn.nextLong();
			I[i] = X[i];
		}
		Arrays.sort(X);

		long under = X[N/2-1], upper = X[N/2];
		for(int i = 0;i < N;i++) {
			System.out.println((I[i] >= upper)?under:upper);
		}
	}

}
