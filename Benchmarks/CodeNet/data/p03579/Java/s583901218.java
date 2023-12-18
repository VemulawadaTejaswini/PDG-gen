import java.util.Scanner;

public class Main {
	boolean used[];
	static int bi(int N,boolean br[][]) {
		int bi=0;
		int c[]=new int[N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(c[i]==c[j]&&br[i][j]) {
					c[i]+=1;
					if(c[i]==2) {
						return 0;
					}
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

		boolean br[][] = new boolean[N][N];
		for (int i = 0; i < M; i++) {
			br[A[i]][B[i]] = true;
			br[B[i]][A[i]] = true;
		}

		int bi=bi(N,br);

		if(bi==0) {
			c=N*(N-1)/2-M;
		}
		else {
			c=bi*(N-bi)-M;
		}
		System.out.println(c);
	}
}
