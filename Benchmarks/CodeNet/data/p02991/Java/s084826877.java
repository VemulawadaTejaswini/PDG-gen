import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P {
		int v;
		int l;
		P(int v, int l){
			this.v=v;
			this.l=l;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<ArrayList<Integer>> g = new ArrayList<>();
		for(int i=0; i<n; i++) g.add(new ArrayList<>());
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			g.get(a).add(b);
		}
		int s = sc.nextInt();
		int t = sc.nextInt();
		s--;
		t--;
		int dist[][] = new int[n][3];
		int INF = 1001001001;
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				dist[i][j] = INF;
			}
		}
		ArrayDeque<P> q = new ArrayDeque<>();
		dist[s][0] = 0;
		q.add(new P(s,0));
		while(! q.isEmpty()) {
			P p = q.pop();
			int v = p.v;
			int l = p.l;
			int nl = (l+1)%3;
			for (int nv : g.get(v)) {
				if(dist[nv][nl] != INF) continue;
				dist[nv][nl] = dist[v][l] + 1;
				q.add(new P(nv, nl));
			}
		}
		if(dist[t][0] == INF) {
			System.out.println(-1);
			sc.close();
			return;
		}

		int ans = dist[t][0] / 3;
		System.out.println(ans);
		sc.close();
	}

}
