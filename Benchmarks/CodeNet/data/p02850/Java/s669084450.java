
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int s;
		int t;
		Pair(int s, int t){
			this.s=s;
			this.t=t;
		}
	}

	HashMap<Pair, Integer>I = new HashMap<>();
	int color[][];
	boolean used[];
	boolean next[][];
	int N;
	int K = -1;
	int cs[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		ArrayList<ArrayList<Integer>> G = new ArrayList<ArrayList<Integer>>();
		ArrayList<Pair> vp = new ArrayList<Pair>();
		color=new int[N][N];
		used=new boolean[N];
		cs = new int[N];
		for(int i=0; i<N; i++) {
			G.add(new ArrayList<Integer>());
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				color[i][j]=0;
			}
			used[i]=false;
			cs[i]=0;
		}
		for(int i=0; i<N-1; i++) {
			int a = sc.nextInt();
			a--;
			int b = sc.nextInt();
			b--;
			G.get(a).add(b);
			G.get(b).add(a);
			vp.add(new Pair(a,b));
		}
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();

		used[0]=true;
		que.add(0);
		while(!que.isEmpty()) {
			int v = que.poll();
			if(K < G.get(v).size()) {
				K = G.get(v).size();
			}
			int cur=1;
			for(int u : G.get(v)) {
				if(used[u]) {
					continue;
				}
				if(cur == cs[v]) {
					cur++;
				}
				cs[u] = color[v][u] = color[u][v] = cur++;
				used[u]=true;
				que.add(u);
			}
		}
		System.out.println(K);
		for(int i=0; i<N-1; i++) {
			Pair p = vp.get(i);
			System.out.println(color[p.s][p.t]);
		}
		sc.close();
	}


}
