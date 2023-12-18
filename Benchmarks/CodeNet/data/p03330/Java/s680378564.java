
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	int C;
	int D[][];
	int c[][];
	int g[][];
	int cnt[];
	boolean used[];
	long ans = 100100100100100L;
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		C = sc.nextInt();
		D = new int[C+1][C+1];
		for(int i=1; i<=C; i++) {
			for(int j=1; j<=C; j++) {
				D[i][j]=sc.nextInt();
			}
		}
		c = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				c[i][j]=sc.nextInt();
			}
		}

		g = new int[3][C+1];
		cnt = new int[3];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int k = (i+j)%3;
				int l = c[i][j];
				g[k][l]++;
				cnt[k]++;
			}
		}
		used = new boolean[C+1];
		int ch[] = new int[3];
		nCk(ch, 0);
		System.out.println(ans);
		sc.close();
	}


	private void nCk(int ch[], int k) {
		if(k==3) {
			long tmp=0;
			for(int i=0; i<3; i++) {
				for(int j=1;j<=C; j++) {
					if(g[i][j]==0) continue;
					tmp += D[j][ch[i]] * g[i][j];
				}
			}
			ans = Math.min(tmp, ans);
			return;
		}
		for(int i=1; i<=C; i++) {
			if(!used[i]) {
				used[i]=true;
				ch[k]=i;
				nCk(ch, k+1);
				used[i]=false;
			}
		}
	}
}
