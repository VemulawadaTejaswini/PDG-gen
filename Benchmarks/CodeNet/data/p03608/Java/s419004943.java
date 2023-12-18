import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		edge[] e = new edge[M];
		int dist[][] = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i!=j) dist[i][j] = Integer.MAX_VALUE;
				else dist[i][j] = 0;
			}
		}
		ArrayList<Integer> cities = new ArrayList<>();
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

		int s=0,t=0,max=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<R;j++) {
				if(max<dist[cities.get(i)-1][cities.get(j)-1]) {
					max = dist[i][j];
					s = i;
					t = j;
				}
			}
		}
		cities.remove(cities.indexOf(cities.get(s)));
		cities.remove(cities.indexOf(cities.get(t)));
		int result = dist[s][cities.get(0)];
		for(int i=0;i<R-3;i++){
			result += dist[cities.get(i)-1][cities.get(i+1)-1];
		}
		result += dist[cities.get(R-3)][t];


		out.println(result);
		out.flush();
	}
}
 class edge {
	int cost;

	public edge(final int a, final int b, final int c) {
		this.cost = c;
	}
 }
