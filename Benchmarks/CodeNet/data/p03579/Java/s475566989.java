import java.util.Scanner;

public class Main {
	boolean used[];
	static int dfs(int N,int br[][],int bi) {

		int c[]=new int[N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(c[i]==c[j]&&br[i][j]!=0) {
					c[i]+=1;
				}
				if(c[i]==2) {
					bi=0;
					return bi;
				}
			}
		}
		for(int i=0;i<N;i++) {
				bi+=c[i];
		}
		return bi;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int c = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[M];
		int B[] = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}

		int br[][] = new int[N][N];
		for (int i = 0; i < M; i++) {
			br[A[i]][B[i]] = 1;
			br[B[i]][A[i]] = 1;
		}

		int bi=0;

		bi=dfs(N,br,bi);

		if(bi==0) {
			c=N*(N-1)/2-M;
		}
		else {
			c=bi*(N-bi)-M;
		}
		System.out.println(c);
	}
}
