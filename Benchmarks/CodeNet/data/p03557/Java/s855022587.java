import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.next());

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(scan.next());
		}
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(scan.next());
		}
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = Integer.parseInt(scan.next());
		}
		
		scan.close();

		// start
		int result = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		
		for (int i = 0; i < B.length; i++) {
			result += getPosition(A, B[i]) * getPosition2(C, B[i]);
		}
		
		System.out.println(result);

	}
	
public static int getPosition(int[] a, int key) {
		
		int tempP = Arrays.binarySearch(a, key);
		
		if (tempP >= 0) {
			return tempP;
		} else {
			return -(tempP+1);
		}
	}
	
public static int getPosition2(int[] a, int key) {
		
		int tempP = Arrays.binarySearch(a, key)+1;
		
		if (tempP >= 0) {
			return a.length - tempP;
		} else {
			return a.length + tempP;
		}
	}

}
