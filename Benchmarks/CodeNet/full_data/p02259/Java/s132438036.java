import java.util.Scanner;

public class Main{
	public static int bubbleSort(int A[], int N) {
		int a;
		int b;
		int count = 0;
		for (int i =0; i <N-1; i++) {
			for (int j = N - 1; j >i; j--) {
				if ( A[j-1]>A[j]) {
					b = A[j-1];
					A[j-1] = A[j];
					A[j] = b;
					count++;
				} 
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		int count = bubbleSort(A, N);
		for (int i = 0; i < N; i++) {
			if (i != N - 1) {
				System.out.print(A[i] + " ");
			} else {
				System.out.println(A[i]);
			}
		}
		System.out.println(count);
	}

}

