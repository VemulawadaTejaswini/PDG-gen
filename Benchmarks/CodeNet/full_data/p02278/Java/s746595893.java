import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] S = new int[n];
		int[] A = new int[n];

		for (int i = 0; i < n; i ++) {
			S[i] = i;
			A[i] = scanner.nextInt();
		}

		scanner.close();

		quickSort(S, A, 0, n - 1);
		
		boolean[] did = new boolean[n];
		int cost = 0;
		
		for (int i = 0; i < n; i ++) {
			if (did[i]) continue;
			did[i] = true;
			if (S[i] == i) continue;
			
			int x = 0;
			int y = (A[i] + A[0]) * 2;
			for (int j = S[i]; S[j] != S[i]; j = S[j]) {
				did[j] = true;
				x += A[j] + A[i];
				y += A[j] + A[0];
			}
			cost += Math.min(x, y);
		}
		System.out.println(cost);
	}

	public static int partition (int[] S, int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i ++;
				int tempc = S[i];
				S[i] = S[j];
				S[j] = tempc;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}

		int tempc = S[++ i];
		int temp = A[i];
		S[i] = S[r];
		A[i] = A[r];
		S[r] = tempc;
		A[r] = temp;

		return i;
	}

	public static void quickSort(int[] S, int[] A, int p, int r) {
		if (p < r) {
			int q = partition(S, A, p, r);
			quickSort(S, A, p, q - 1);
			quickSort(S, A, q + 1, r);
		}
	}
} 

