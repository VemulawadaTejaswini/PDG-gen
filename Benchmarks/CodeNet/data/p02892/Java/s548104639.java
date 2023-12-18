import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int adj[][] = new int[N][N];
		for(int i = 0 ; i < N ; ++i){
			String S = sc.next();
			for(int j = 0 ; j < N ; ++j){
				adj[i][j] = S.charAt(j) - '0';
			}
		}
		int color[] = new int[N];
		Arrays.fill(color, -1);
		Queue<Integer> q = new LinkedList<Integer>();
		// 与えられたグラフを2色に塗る
		q.add(0);
		color[0] = 0;
		boolean f = true;
		l: while(!q.isEmpty()){
			int cur = q.poll();
			int c = color[cur];
			for(int i = 0 ; i < N ; ++i){
				if(adj[cur][i] == 0){
					continue;
				}
				if(color[i] == -1){
					color[i] = 1 - c;
					q.add(i);
				}else if(color[i] == c){
					f = false;
					break l;
				}
			}
		}
		if(!f){
			System.out.println(-1);
			return ;
		}
		int dist[][] = new int[N][N];
		for(int i = 0 ; i < N ; ++i){
			for(int j = 0 ; j < N ; ++j){
				if(adj[i][j] == 1){
					dist[i][j] = 1;
				}else{
					dist[i][j] = -1;
				}
				if(i == j){
					dist[i][j] = 0;
				}
			}
		}
		for(int k = 0 ; k < N ; ++k){
			for(int i = 0 ; i < N ; ++i){
				for(int j = 0 ; j < N ; ++j){
					if(dist[i][k] > 0 && dist[k][j] > 0){
						int d = dist[i][k] + dist[k][j];
						if(dist[i][j] < 0){
							dist[i][j] = d;
						}else{
							dist[i][j] = Math.min(dist[i][j], d);
						}
					}
				}
			}
		}
		int m = 0;
		for(int i = 0 ; i < N ; ++i){
			for(int j = 0 ; j < N ; ++j){
				m = Math.max(dist[i][j], m);
			}
		}
//		System.out.println(Arrays.deepToString(dist));
		System.out.println(m + 1);
	}
}
