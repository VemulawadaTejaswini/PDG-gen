import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int[][] map = new int[H+1][W+1];
		int[] X = new int[H*W+1];
		int[] Y = new int[H*W+1];
		for(int i=1; i<=H; i++) {
			for(int j=1; j<=W; j++) {
				int a = sc.nextInt();
				map[i][j] = a;
				X[a] = i;
				Y[a] = j;
			}
		}
		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			int N = (R-L)/D;
			int ans = 0;
			if(N == 1) {
				System.out.println(0);
			} else {
				for(int j=0; j<N; j++) {
					int x = X[L+j*D];
					int y = Y[L+j*D];
					int x2 = X[L+j*D+D];
					int y2 = Y[L+j*D+D];
					ans += Math.abs(x2-x) + Math.abs(y2-y);
				}
			}
			System.out.println(ans);
		}
		
		
		
		
		
	}

}
