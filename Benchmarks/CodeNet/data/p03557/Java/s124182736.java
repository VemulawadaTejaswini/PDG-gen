import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(B);
		
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		Arrays.sort(C);
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			int b = B[i];
			
			ans += binarySearch(A, b) * (C.length - binarySearch(C, b+1));
		}
		
		System.out.println(ans);
	}
	
	static long binarySearch(int[] m, int key) {
		int l = -1;
		int r = m.length;
		
		while((r-l) > 1) {
			int mid = (r + l) / 2;
			
			if (m[mid] >= key) {
				r = mid;
			} else {
				l = mid;
			}
		}
		
		return r;
	}
}
