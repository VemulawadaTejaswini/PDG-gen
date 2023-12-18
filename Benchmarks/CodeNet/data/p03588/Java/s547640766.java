import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		int ans = 2000000000;
		for(int i = 0 ; i < N ; i++) {
			ans = Math.min(ans, A[i] + B[i]);
		}
		System.out.println(ans);
	}
}