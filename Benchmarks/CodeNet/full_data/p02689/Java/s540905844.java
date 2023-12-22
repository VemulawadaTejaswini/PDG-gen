import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		List<String> list = new ArrayList<>();
		int[] arrayH = new int[N];

		for (Integer i = 0; i < N; i++) {
			String S = Integer.toString(i + 1);
			list.add(S);
		}

		for (int j = 0; j < N; j++) {
			arrayH[j] = sc.nextInt();
		}

		for (int k = 0; k < M; k++) {
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt() - 1;
			if (arrayH[X] < arrayH[Y]) {
				list.set(X, "0");
			} else if (arrayH[X] == arrayH[Y]) {
				list.set(X, "0");
				list.set(Y, "0");
			} else if (arrayH[X] > arrayH[Y]) {
				list.set(Y, "0");
			}
		}

		while (list.contains("0")) {
			list.remove("0");
		}
		System.out.println(list.size());

	}

}