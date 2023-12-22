import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}

		for(int k =0; k<n-1 ;k++) {
			System.out.print(A[k] + " ");
		}
		System.out.println(A[n-1]);

		for(int i = 1; i < n; i++) {
			int key = A[i];

			int j = i - 1;
			while( j>=0 && A[j] > key) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;

			for(int k =0; k<n-1 ;k++) {
				System.out.print(A[k] + " ");
			}
			System.out.println(A[n-1]);
		}
	}
}
