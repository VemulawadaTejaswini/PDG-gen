import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];

		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}

		Arrays.sort(X);

		for(int i = 0; i < N/2; i++) {
			System.out.println(X[N/2]);
		}
		for(int i = N/2; i < N; i++) {
			System.out.println(X[N/2-1]);
		}
	}

}
