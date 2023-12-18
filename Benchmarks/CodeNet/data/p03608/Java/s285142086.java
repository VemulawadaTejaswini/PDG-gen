
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	int M;
	int R;
	int D[][];
	int r[];
	int INF=1000000000;
	int ans = INF;
	boolean used[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		R=sc.nextInt();
		r=new int[R];
		for(int i=0; i<R; i++) {
			r[i]=sc.nextInt();r[i]--;
		}
		D=new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				D[i][j]=INF;
				if(i==j) {
					D[i][j]=0;
				}
			}
		}
		for(int i=0; i<M; i++) {
			int a=sc.nextInt();a--;
			int b=sc.nextInt();b--;
			int c=sc.nextInt();
			D[a][b]=c;
			D[b][a]=c;
		}
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				if(D[i][k]==INF) continue;
				for(int j=0; j<N; j++) {
					if(D[k][j]==INF) continue;
					D[i][j] = Math.min(D[i][j], D[i][k]+D[k][j]);
				}
			}
		}
		used = new boolean[R];
		for(int i=0; i<R; i++) {
			used[i]=true;
			dfs(1,0,i);
			used[i]=false;
		}
		System.out.println(ans);
		sc.close();
	}

	private void dfs(int c, int sum, int prev) {
		if(c==R) {
			ans = Math.min(ans, sum);
		}else {
			for(int i=0; i<R; i++) {
				if(!used[i]) {
					used[i]=true;
					dfs(c+1, sum + D[r[prev]][r[i]], i);
					used[i]=false;
				}
			}
		}
	}

}
