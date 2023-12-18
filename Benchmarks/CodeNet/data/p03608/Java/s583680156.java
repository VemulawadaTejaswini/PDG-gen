import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> cities = new ArrayList<>();
	static int N,M,R;
	static int dist[][];
	static boolean used[];
	static int result;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		R = Integer.parseInt(sc.next());
		dist = new int[N][N];
		used = new boolean[R];
		edge[] e = new edge[M];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i!=j) dist[i][j] = Integer.MAX_VALUE;
				else dist[i][j] = 0;
			}
		}
		for (int i = 0; i < R; i++) {
			cities.add(Integer.parseInt(sc.next()));
		}
		for (int i = 0; i < M; i++) {
			int a = Integer.parseInt(sc.next()) - 1;
			int b = Integer.parseInt(sc.next()) - 1;
			int c = Integer.parseInt(sc.next());
			e[i] = new edge(a,b,c);
			dist[a][b] = Math.min(c,dist[a][b]);
			dist[b][a] = Math.min(c,dist[b][a]);
		}

		for(int k=0;k<N;k++){
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
				}
			}
		}

		result = Integer.MAX_VALUE;
		dfs(0,-1,0);


		out.println(result);
		out.flush();
	}


	public static void  dfs(int count, int las, int subdist) {
		if(count == R) {
			if(result>subdist) result = subdist;
			return;
		}

		for(int i=0;i<R;i++) {
			if(!used[i]) {
				if(las == -1) {
					dfs(count+1, i, 0);
					used[i] = true;
				}
				else {
					dfs(count+1, i, subdist + dist[cities.get(las)-1][cities.get(i)-1]);
				}
				used[i] = false;
			}
		}
	}
}

class edge {
	int cost;

	public edge(int a, int b, int c) {
		this.cost = c;
	}
}