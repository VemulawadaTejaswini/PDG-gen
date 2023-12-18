import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0;i < N;i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0;i < N;i++) {
			C[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long res = 1;
		for(int i = 0;i < N;i++) {
			int target = B[i];
			int left = 0;
			int right = A.length;
			while(left < right) {
				int middle = (left + right)/2;
				if(A[middle] >= target) {
					right = middle;
				}else  {
					left = middle+1;
				}
			}
			res += left;

			target++;
			left = 0;
			right = C.length;
			while(left < right) {
				int middle = (left + right)/2;
				if(C[middle] >= target) {
					right = middle;
				}else  {
					left = middle+1;
				}
			}
			res += (C.length-left);
		}
		System.out.println(res);
	}
}