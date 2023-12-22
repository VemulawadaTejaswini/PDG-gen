import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[]A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();
		disp(A, N);
		insertionSort(A, N);
	}
	static void insertionSort(int[]A, int n) {
		for(int i = 1; i < n; i++) {
			int v = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			disp(A, n);
		}
	}
	static void disp(int[]A, int n) {
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(A[i]);
			}else {
				System.out.print(A[i] + " ");
			}
		}
	}
}
