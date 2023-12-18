import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Vertex{
		List<Integer> adj;
		int parent;
		boolean leaf;
		int maxDepth;
		public Vertex() {
			adj = new ArrayList<Integer>();
		}
		void add(int e){
			adj.add(e);
		}
	}
	static void dfs(Vertex vs[] , int start , int[] depth){
		Arrays.fill(depth, -1);
		depth[start] = 0;
		vs[start].parent = start;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty()){
			int c = q.poll();
			int cd = depth[c];
			boolean leaf = true;
			for(int a : vs[c].adj){
				if(depth[a] >= 0){
					continue;
				}
				leaf = false;
				vs[a].parent = c;
				depth[a] = cd + 1;
				q.add(a);
			}
			vs[c].leaf = leaf;
		}
	}
	static int searchDepth(Vertex vs[] , int start , int[] depth){
		int maxDepth = depth[start];
		if(vs[start].leaf){
			vs[start].maxDepth = depth[start];
			return depth[start];
		}
		for(int i : vs[start].adj){
			if(i == vs[start].parent){
				continue;
			}
			int m = searchDepth(vs, i, depth);
			maxDepth = Math.max(m, maxDepth);
		}
		vs[start].maxDepth = maxDepth;
		return maxDepth;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int u = sc.nextInt() - 1;
		int v = sc.nextInt() - 1;
		Vertex vs[] = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}
		for(int i = 0 ; i < N - 1; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			vs[a].add(b);
			vs[b].add(a);
		}
		int depth[] = new int[N];
		dfs(vs , v , depth);
		searchDepth(vs , v , depth);
		int pu = u;
		int md = vs[u].maxDepth;
		int mi = u;
		while(pu != v){
			int d = depth[pu];
			int ud = depth[u] - depth[pu];
			int vd = depth[pu];
			if(ud >= vd){
				break;
			}
			if(md < vs[pu].maxDepth){
				mi = pu;
				md = vs[pu].maxDepth;
			}
//			System.out.println(ud+" "+vd+" "+pu+" "+vs[pu].maxDepth);
			pu = vs[pu].parent;
		}
		int T = 0;
		int cu = u;
		int vdepth = 0;
		boolean asc = true;
//		System.out.println(mi+" "+md);
		while(depth[cu] != vdepth){
//			System.out.println(cu+" "+vdepth+" "+depth[cu]+" "+vs[cu].leaf+" "+asc);
			if(T % 2 == 0){
				if(cu == mi){
					asc = false;
				}
				if(asc){
					cu = vs[cu].parent;
				}else if(vs[cu].leaf){
					cu = vs[cu].parent;							
				}else{
					for(int a : vs[cu].adj){
						if(a == vs[cu].parent){
							continue;
						}
						if(vs[a].maxDepth != md){
							continue;
						}
						cu = a;
						break;
					}
				}
			}else{
				++vdepth;
			}
//			System.out.println(cu+" "+vdepth+" "+depth[cu]);
			++T;
		}
		System.out.println(T / 2);			
	}
}
