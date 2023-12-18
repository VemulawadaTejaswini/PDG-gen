import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveA();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];

		Arrays.sort(X);

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}

		Integer n = 0;

		if (N % 2 == 0) {
			n = N / 2;
		} else {
			n = (N + 1) / 2;
		}

		for (int i = 0; i < N; i++) {

			List<Integer> listX = new ArrayList<Integer>();

			for (int j = 0; j < N; j++) {

				listX.add(X[j]);
			}

			listX.remove(i);
			Collections.sort(listX,Collections.reverseOrder());


			System.out.println(listX.get(n - 1));
		}

	}
}