import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int Q = scn.nextInt();
		int[][] LR  = new int[N+1][N+1];
		for(int i = 0;i < M;i++){
			int l = scn.nextInt();
			int r = scn.nextInt();
			LR[l][r]++;
		}
		for(int i = 0;i < Q;i++) {
			int ans = 0;
			int l = scn.nextInt();
			int r = scn.nextInt();
			for(int ll = l;ll <=r;ll++) {
				for(int rr = ll;rr<=r;rr++) {
					ans+=LR[ll][rr];
				}
			}
			System.out.println(ans);
		}
		scn.close();
	}
}