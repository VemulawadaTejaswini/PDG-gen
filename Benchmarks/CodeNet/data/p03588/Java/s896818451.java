import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int maxA = -1; int minA = 1001001001;
		int maxB = -1; int minB = 1001001001;
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			if(maxA < A[i]) maxA = A[i];
			if(minA > A[i]) minA = A[i];
			if(maxB < B[i]) maxB = B[i];
			if(minB > B[i]) minB = B[i];
		}
		long ans = maxA - minA + 1;
		ans += minA - 1;
		ans += minB;
		System.out.println(ans);
	}
}