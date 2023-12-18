import java.util.Scanner;

public class Main {

	int[][] link;
	int[] colors;
		
	private void solve() {
		//input
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		link = new int[N][N];
		for(int i=0; i<N-1;i++) {
			int u = in.nextInt()-1;
			int v = in.nextInt()-1;
			int w = in.nextInt();
			link[u][v] = w;
			link[v][u] = w;
		}
		
		colors = new int[N];
		for(int i=0; i<N; i++) {
			colors[i] = -1;
		}
		draw(0,0);
		
		//output
		for (int b : colors) {
			System.out.println(b);
		}
	}

	private void draw(int node, int color) {
		if(colors[node] != -1) return;
		colors[node] = color;
		for(int next=0; next<link[node].length; next++) {
			if(link[node][next] == 0) continue;
			if((link[node][next] & 1) == 0) {
				draw(next, color);
			}else {
				draw(next, (color==0)?1:0);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}