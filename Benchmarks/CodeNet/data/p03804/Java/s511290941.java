import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] A = new String[N];
		String[] B = new String[M];
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.next();
		}
		for(int i = 0 ; i < M ; i++) {
			B[i] = sc.next();
		}
		for(int i = 0 ; i <= N - M ; i++) {
			for(int j = 0 ; j <= N - M ; j++) {
				if(check(i, j, A, B, M)) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

	public static boolean check(int x, int y, String[] A, String[] B, int M) {
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < M ; j++) {
				if(A[x + i].charAt(y + j) != B[i].charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
