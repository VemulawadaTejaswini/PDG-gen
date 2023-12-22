import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
//		int[] A = {5, 4, 3, 2, 1, 0,};
//		int n = A.length;
//		insertionSort(A, n, 2);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] A = new int[n];
		for (int i=0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		Counter counter = new Counter(0);
		//int count = 0;
		int m = 1;

		int h = 1;
		while (h <= n/9) {
			h = 3*h + 1;// (1,) 4, 13, 40, 121, 364, 1093, ...
			m++;//		   (1,) 2,  3,  4,   5,   6,    7, ...
		}

		int[] G = new int[m];// [... 1093, 364, 121, 40, 13, 4, 1] : G[n] = G[n+1]*3 + 1
		for (int i=0; i < m; i++) {
			G[i] = h;
			h = (h-1)/3;
		}

		for (int i=0; i < m; i++) {
			insertionSort(A, n, G[i], counter);
		}

		System.out.println(m);

		for (int i = 0; i < m-1; i++) {
			System.out.print(G[i]);
		}
		System.out.println(G[m-1]);

		System.out.println(counter.count);

		for (int i=0; i < n; i++) {
			System.out.println(A[i]);
		}
	}

	static class Counter {
		int count;

		Counter(int n) {
			this.count = n;
		}

		Counter counting() {
			this.count++;
			return this;
		}
	}

	static void insertionSort(int[] A, int n, int g, Counter counter) {
		for (int i=g; i < n; i++) {
			int temp = A[i];
			int j = i - g;
			while (j >= 0 && A[j] > temp) {
				A[j+g] = A[j];
				j = j - g;
				counter.counting();
			}
			A[j+g] = temp;
//			System.out.println(java.util.Arrays.toString(A));
		}
	}

	static void shellSort(int[] A, int n) {
		Counter counter = new Counter(0);
		int m = 1;

		int h = 1;
		while (h <= n/9) {
			h = 3*h + 1;
			m++;
		}

		int[] G = new int[m];// [... 1093, 364, 121, 40, 13, 4, 1] : G[n] = G[n+1]*3 + 1
		for (int i=0; i < m; i++) {
			G[i] = h;
			h = (h-1)/3;
		}

		for (int i=0; i < m; i++) {
			insertionSort(A, n, G[i], counter);
		}
	}
}