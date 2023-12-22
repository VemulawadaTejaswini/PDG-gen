import java.util.Scanner;

// ALDS1_4_D
public class Main {	
	int check(int[] A, int k, int p) {
		int sum = 0;
		int n = 0;
		int v = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > p) break;
			if (sum + A[i] <= p) sum += A[i];
			else {
				sum = A[i];
				n++;
			}
			if (n == k) break;
			v++;
		}
		return v;
	}
	
	int binarySearch(int[] A, int k, int n, int min, int max) {
		if (max <= min + 1) return max;
		int mid = (max + min) / 2;
		if (check(A, k, mid) >= n) return binarySearch(A, k, n, min, mid);
		else return binarySearch(A, k, n, mid, max);
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(binarySearch(A, k, n, 0, 10));//00000000));
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

