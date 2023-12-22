

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		shellSort(A, N);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		scan.close();
	}

	static int cnt = 0;

	public static void shellSort(int[] A, int N) {
		// G(n+1)=3G(n)+1 n=0,1,2,,,
		int max = (N + 1) / 3;
		System.out.println(max);
		int[] G = new int[max];
		for (int i = 0; i < G.length; i++) {
			G[i] = 3 * i + 1;
			// ??????
			System.out.print(G[i]);
			if (i != G.length - 1) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}

		for (int i = G.length - 1; i >= 0; i--) {
			insertionSort(A, N, G[i]);
		}
		System.out.println(cnt);
	}

	public static void insertionSort(int[] A, int N, int g) {

		for (int i = g; i < N; i++) {
			int v = A[i];
			int j = i - g;
			// ?????§???????????????????????°???????????????????????\????????????????????????????????§??????
			while (j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j -= g;
				cnt++;
			}
			A[j + g] = v;
		}
	}
}