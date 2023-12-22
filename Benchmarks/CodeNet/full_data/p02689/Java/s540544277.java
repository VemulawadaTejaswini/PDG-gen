import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] H = new int[N];
		int[] A = new int[M];
		int[] B = new int[M];
		
		int[] good = new int[N];
		
		for(int i = 0; i < N; i ++) {
			H[i] = stdIn.nextInt();
			good[i] = 1;
		}
		for(int i = 0; i < M; i ++) {
			A[i] = stdIn.nextInt();
			B[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < M; i ++) {
			int a = A[i] - 1;
			int b = B[i] - 1;
			if(H[a] < H[b]) {
				good[a] = 0;
			}
			if(H[b] < H[a]) {
				good[b] = 0;
			}
			if(H[a] == H[b]) {
				good[a] = 0;
				good[b] = 0;
			}
		}
		
		int ans = 0;
		for(int i = 0; i < good.length; i ++) {
			if(0 < good[i]) {
				ans ++;
			}
		}
		System.out.println(ans);
	}
}
