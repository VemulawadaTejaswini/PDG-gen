import java.util.Arrays;
import java.util.Scanner;

class Main {

	static int lowerbound(int[] A, int key) {
		int high = A.length;
		int low = -1;
		while(high - low > 1) {
			int mid = (low + high)/2;
			if(A[mid] >= key) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};

		int[] B = new int[n];
		for(int i=0; i<n; i++){
			B[i] = sc.nextInt();
		};

		int[] C = new int[n];
		for(int i=0; i<n; i++){
			C[i] = sc.nextInt();
		};
		sc.close();

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int count = 0;
		for(int i=0; i<B.length; i++){
			int x = lowerbound(A, B[i]);
			int y = C.length - lowerbound(C, B[i]);
			count += x * y;
		};
		System.out.println(count);
	}
}