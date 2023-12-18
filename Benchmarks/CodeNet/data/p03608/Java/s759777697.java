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
			cities.add(Integer.parseInt(sc.next())-1);
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
		for(int i=0;i<R;i++) {
			result = Math.min(result,  search(cities.get(i),cities,0));
		}


		out.println(result);
		out.flush();
	}


	public static int search (int now, ArrayList<Integer> toVisit, int d) {
		int opt = Integer.MAX_VALUE;
		if(toVisit.size()==0) return 0;
		//ArrayList<Integer> copy = (ArrayList<Integer>) toVisit.clone();
//		for(int v : toVisit) {
//			copy.remove(copy.indexOf(v));
//			opt = Math.min(opt,search(v,copy,d+dist[cities.get(now)-1][cities.get(v)-1]));
//			copy.add(v);
//		}
		for(int i=0;i<toVisit.size();i++) {
			int v=toVisit.remove(0);
			opt = Math.min(opt,dist[now][v]+search(v,toVisit,d+dist[now][v]));
			toVisit.add(v);
		}
		return opt;
	}
}

class edge {
	int cost;

	public edge(int a, int b, int c) {
		this.cost = c;
	}
}