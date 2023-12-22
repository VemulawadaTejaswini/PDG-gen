import java.util.Scanner;

public class Main {

	static int c = 0;

	public static void bubbleSort(int[] A, int n) {

		boolean flag = true;

		while (flag) {
			flag = false;
			for (int i = n - 1; i > 0; i--) {
				if (A[i] < A[i - 1]) {
					int tmp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = tmp;
					c++;
					flag = true;
				}
			}
		}
	}

	public static void printArray(int[] A, int n) {

		for (int i = 0; i < n - 1; i++) {

			System.out.print(A[i] + " ");
		}
		System.out.println(A[n - 1]);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int A[] = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		bubbleSort(A, n);

		printArray(A, n);

		System.out.println(c);

	}

}

