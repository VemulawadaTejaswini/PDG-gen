import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}
		insertionSort(array);
		scan.close();

	}

	private static void insertionSort(int[] A) {
		// N個の要素を含む0-オリジンの配列A
		int v = 0;
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			v = A[i];
			j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j -= 1;
				A[j + 1] = v;

			}
			for (int n = 0; n < A.length; n++) {
				if (n > 0) {
					System.out.print(" ");
				}
				System.out.print(A[n]);
			}
			System.out.print("\r\n");

		}
	}
}
