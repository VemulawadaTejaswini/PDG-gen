
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] e = new ArrayList[V];
		for (int i = 0; i < V; i++)
			e[i] = new ArrayList<>();
		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			e[s].add(t);
		}
		int Q = sc.nextInt();
		int[] scc = stronglyConnectedComponents(e);
		for (int i = 0; i < Q; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			if (scc[u]==scc[v]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
	
	
	int[] dfsnum;
	int[] low;
	ArrayDeque<Integer> S = new ArrayDeque<>();
	ArrayList<Integer> T = new ArrayList<>();
	int N = 0;
	int NOW = 0;
	boolean[] used;
	int[] ret;
	boolean[] arrived;

	int[] stronglyConnectedComponents(ArrayList<Integer> e[]) {
		int n = e.length;
		dfsnum = new int[n];
		low = new int[n];
		used = new boolean[n];
		ret = new int[n];
		arrived=new boolean[n];
		ArrayDeque<Integer> stack=new ArrayDeque<Integer>();

		for (int i = 0; i < n; i++) {
			if (used[i])
				continue;
			if (dfsnum[i] == 0) {
				stack.addFirst(i);

				while(!stack.isEmpty()){
					ArrayList<Integer>[] pending=new ArrayList[n];
					for(int j=0;j<n;j++)
						pending[j]=new ArrayList<>();

					int ii=stack.peekFirst();
					S.addFirst(ii);
					dfsnum[ii] = N;
					N++;
					low[ii] = dfsnum[ii];
					if(arrived[ii]){
						for(int j=0;j<pending[ii].size();j++){
							int d=pending[ii].get(j);
							low[ii]=Math.min(low[ii], low[d]);
						}
					}else{
						for (int j : e[ii]) {
							if (used[j])
								continue;
							if (!T.contains(j)) {
								T.add(j);
								stack.add(j);
								pending[i].add(j);
							} else {
								low[ii] = Math.min(dfsnum[j], low[ii]);
							}
						}
						arrived[ii]=true;
					}
					if (low[ii] == dfsnum[ii]) {
						int v;
						do {
							v = S.removeFirst();
							ret[v] = NOW;
							used[v] = true;
						} while (v != ii);
						NOW++;
						stack.removeFirst();
					}
				}
			}
		}
		return ret;
	}
}