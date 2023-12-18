import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int X[] = new int[N];

		for (int i = 0; i < N; i++) {
			X[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(X);

		int mSmall = X[N / 2 - 1];
		int mLarge = X[N / 2];

		for (int i = 0; i < N / 2; i++) {
			System.out.println(mSmall);
		}
		for (int i = 0; i < N / 2; i++) {
			System.out.println(mLarge);
		}

	}

}