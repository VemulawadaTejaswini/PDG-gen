// 必要なパッケージをインポートします。
import java.util.Scanner;
public class Main {
	static int[][]A;
	static int[]solve;
	static int N;
	static int M;
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main.N = sc.nextInt();
		Main.M = sc.nextInt();
		Main.A = new int[N+1][N+1];
		Main.solve = new int[N+1];
		for(int i = 0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[a][b]=1;
			A[b][a]=1;
		}
		dps(1);
		System.out.println(ans);
	}
	static void dps(int i) {
		solve[i]=1;
		for(int j=1;j<N+1;j++) {
			if(solve[j]!=1)break;
			if(j==N) {
				ans++;
			}
		}
		for(int j = 2; j<N+1;j++) {
			if(A[i][j]==1 && solve[j]==0) {
				dps(j);
				solve[j]= 0;
			}
		}
		return;
	}
}
