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
		//  1<=M<=N<= 50
		for(int i = 0 ; i <= N - M ; i++) {
			for(int j = 0 ; j <= N - M ; j++) {
				if(check(i,j,A,B,M)) {
					System.out.println("Yes");
					return;
				} else {
					System.out.println("No");
					return;
				}
			}
		}
	}

	public static boolean check(int x, int y, String[] A, String[] B, int M) {
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < M ; j++) {
				if(B[i].charAt(j) != A[i + x].charAt(j + y)) {
					return false;
				}
			}
		}
		return true;
	}
}
