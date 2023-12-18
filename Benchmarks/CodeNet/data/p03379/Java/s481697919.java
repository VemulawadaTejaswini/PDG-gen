import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];

		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = X[i];
		}

		Arrays.sort(X);

		int ansR = X[N/2];
		int ansL = X[N/2 - 1];

		for(int i = 0; i < N; i++) {
			if(Y[i] > ansL) {
				System.out.println(ansL);
			} else {
				System.out.println(ansR);
			}
		}

	}
}
