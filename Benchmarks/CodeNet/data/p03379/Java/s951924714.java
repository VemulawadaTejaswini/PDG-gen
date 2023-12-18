import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for (int i = 0; i < N; i++)
			X[i] = sc.nextInt();
		sc.close();

		int[] xSort = Arrays.copyOf(X, N);
		Arrays.sort(xSort);
		int midA = xSort[(N - 1) / 2];
		int midB = xSort[N / 2];

		for (int i = 0; i < N; i++)
			System.out.println(X[i] <= midA ? midB : midA);
	}
}