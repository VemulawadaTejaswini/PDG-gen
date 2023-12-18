
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] a = new int[n][n - 1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int finish = 0;
		int[] matchNo = new int[n];

		int result = 0;

		while (true) {
			boolean[] isDone = new boolean[n];
			boolean hasTodayMatch = false;

			for (int i = 0; i < n; i++) {
				if (!isDone[i] && matchNo[i] != n - 1 && !isDone[a[i][matchNo[i]] - 1] && matchNo[a[i][matchNo[i]] - 1] != n - 1 && a[a[i][matchNo[i]] - 1][matchNo[a[i][matchNo[i]] - 1]] - 1 == i) {
					int vs = a[i][matchNo[i]] - 1;
					matchNo[i]++;
					matchNo[vs]++;
					isDone[i] = true;
					isDone[vs] = true;
					if (matchNo[i] == n - 1) {
						finish++;
					}
					if (matchNo[vs] == n - 1) {
						finish++;
					}
					hasTodayMatch = true;
				}
			}
			result++;
			if (!hasTodayMatch) {
				result = -1;
				break;
			}
			if (finish == n) {
				break;
			}
		}

		System.out.println(result);
	}

}
