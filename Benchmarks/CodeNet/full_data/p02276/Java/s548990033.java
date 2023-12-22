
// counting sort

import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int p = partation(A, 0, n - 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i == p) {
				sb.append("[").append(A[i]).append("]");
			} else {
				sb.append(A[i]);
			}
			sb.append((i != n - 1) ? " " : "\n");
		}
		System.out.print(sb);
	}
	public static int partation(int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		int t;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i++;
				t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		t = A[r];
		A[r] = A[i + 1];
		A[i + 1] = t;
		return i + 1;
	}	
}