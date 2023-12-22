import java.util.Scanner;

public class Algorithm1 {
	public static void main(String[] args) {
		int N;
		int[] A = new int[100] ;

		Scanner stdIn = new Scanner(System.in);

		N = stdIn.nextInt();
		for(int i = 0; i < N; i++){
			A[i] = stdIn.nextInt();
		}

		trace(A, N);
		insertionSort(A, N);
	}

	public static void insertionSort(int[] A, int N){
		int i, j , v;
		for(i = 1; i < N; i++){
			v = A[i];
			j = i - 1;
			while (j >= 0 && v < A[j]){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			trace(A, N);
		}
	}
	public static void trace(int[] A, int N){
		for(int i= 0; i < N; i++){
			if( i > 0)	System.out.print(" ");
		System.out.print(A[i]);
		}
		System.out.println();
	}
}