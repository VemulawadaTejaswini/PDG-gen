import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		sugoroku();

	}

	public static void sugoroku() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer []X = new Integer[N];

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
   List<Integer> l = Arrays.asList(X);
		int M = sc.nextInt();
		int []A = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}

		for (int num : A) {
			if (X[num - 1] < 2019 && !(l.contains(X[num - 1]+1))) {
				X[num - 1]++;
			}
		}
		for (int num : X) {
			System.out.println(num);
		}
	}
}

