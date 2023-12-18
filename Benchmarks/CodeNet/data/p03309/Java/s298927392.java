import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Integer[] B = new Integer[N];
		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
			B[i] = A[i]-(i+1);
		}
		Arrays.sort(B);
		int t = B[B.length/2];
		int res = 0;
		for (int i=0; i<N; i++){
			res += Math.abs(A[i] - (t+(i+1)));
		}
		System.out.println(res);
	}
}
