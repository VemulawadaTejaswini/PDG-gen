import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int Q = scn.nextInt();
		int[][] LR = new int[N+1][N+1];
 		for(int i = 0;i < M;i++){
			int l = scn.nextInt();
			int r = scn.nextInt();
			for(int k = 1;k <=l;k++) {
				for(int j = r;j <= N;j++) {
					LR[k][j]++;
				}
			}
		}
		for(int i = 0;i < Q;i++) {
			int l = scn.nextInt();
			int r = scn.nextInt();
			System.out.println(LR[l][r]);
		}
		scn.close();
	}
}
