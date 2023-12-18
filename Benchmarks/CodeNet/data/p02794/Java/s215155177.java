import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int adj[][] = new int[N][N];
		for(int i = 0 ; i < N - 1 ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj[a][b] = i + 1;
			adj[b][a] = i + 1;
		}
		int M = sc.nextInt();
		List<List<Integer>> rules = new ArrayList<List<Integer>>();
		for(int i = 0 ; i < M ; ++i){
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			Queue<Integer> q = new LinkedList<Integer>();
			int back[] = new int[N];
			Arrays.fill(back, -1);
			back[u] = u;
			q.add(u);
			List<Integer> path = new ArrayList<Integer>();
			while(!q.isEmpty()){
				int cur = q.poll();
				if(cur == v){
					while(back[cur] != u){
						int b = back[cur];
						path.add(adj[cur][b] - 1);
						cur = b;
					}
					path.add(adj[cur][u] - 1);
					break;
				}
				for(int a = 0 ; a < N ; ++a){
					if(adj[cur][a] == 0){
						continue;
					}
					if(back[a] != -1){
						continue;
					}
					back[a] = cur;
					q.add(a);
				}
			}
			rules.add(path);			
		}
		long ret = 0;
		int B = 1 << M;
		for(int i = 1 ; i < B ; ++i){
			int nb = Integer.bitCount(i);
			long ns = 0;
			for(int j = 0 ; j < M ; ++j){
				if((i & (1 << j)) == 0){
					continue;
				}
				List<Integer> l = rules.get(j);
				for(int r : l){
					ns = ns | (1L << r);
				}
			}
			int nb2 = Long.bitCount(ns);
			long pat = 1L << (N - 1 - nb2);
			if(nb % 2 == 0){
				ret = ret - pat;
			}else{
				ret = ret + pat;
			}
		}
		ret = (1L << (N - 1)) - ret;
		System.out.println(ret);
	}
}
