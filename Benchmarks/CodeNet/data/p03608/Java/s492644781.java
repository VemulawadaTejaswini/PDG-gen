import java.util.Scanner;

public class Main {

	int N;
	int INF = Integer.MAX_VALUE/10;

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int R = in.nextInt();
		boolean[] town = new boolean[N+1];
		for (int i = 0; i < R; i++) {
			town[in.nextInt()] = true;
		}
		int[][] edge = new int[N+1][N+1];
		for (int i = 0; i < N+1; i++) {
			for (int j = 0; j < N+1; j++) {
				edge[i][j] = INF;
			}
		}
		
		for (int i = 0; i < M; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			edge[A][B] = C;
			edge[B][A] = C;
		}
		solveWF(edge);
		System.out.println(getAns(town,edge,-1));

	}
	
	private int getAns(boolean[] town, int[][] edge,int prev){
		int plus = Integer.MAX_VALUE;
		boolean active = false;
		for (int i = 0; i < town.length; i++) {
			if(town[i]){
				active = true;
				town[i] = false;
				plus = Math.min(plus, ((prev==-1)?0:edge[prev][i]) + getAns(town,edge,i));
				town[i] = true;
			}
		}
		return (active)?plus:0;
	}
	
	private void solveWF(int[][] edge){ // none - INF
		for(int k=0;k<edge.length;k++){
			for(int i=0;i<edge.length;i++){
				for(int j=0;j<edge.length;j++){
					edge[i][j] = Math.min(edge[i][j],edge[i][k]+edge[k][j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}