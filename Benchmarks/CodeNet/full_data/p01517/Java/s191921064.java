
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	HashMap<String, Integer> civ2int;
	Civ[] civs;
	boolean[] visited;
	int max;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			
			civs = new Civ[n];
			
			for(int i=0;i<n;i++) {
				String name = sc.next();
				int val = sc.nextInt();
				int m = sc.nextInt();
				String[] neighbor = new String[m];
				for(int j=0;j<m;j++) {
					neighbor[j] = sc.next();
				}
				civs[i] = new Civ(name, val, neighbor);
			}
			
			int tmp = civs[0].val;
			civs[0].val = 10000;
			sort(civs);
			civs[0].val = tmp;
			
			civ2int = new HashMap<String, Integer>();
			for(int i=0;i<n;i++) civ2int.put(civs[i].name, i);
			debug(civ2int);
			for(Civ civ: civs) debug(civ.name, civ.val, civ.neighbor);
			max = 0;
			visited = new boolean[n];
			dfs(0, 0);
			System.out.println(max);
		}
	}
	
	void dfs(int x, int val) {
		debug(x, val);
		debug(visited);
		if( x == n ) {
			max = max( max, val );
			return;
		}
		if( visited[x] ) {
			dfs(x+1, val);
			return;
		}
		visited[x] = true;
		boolean flg = false;
		for(String neighbor: civs[x].neighbor) {
			int next = civ2int.get(neighbor);
			flg |= visited[ next ];
			visited[next] = true;
		}
		dfs(x+1, val+civs[x].val);
		visited[x] = false;
		if(flg && x != 0) dfs(x+1, val);
		for(String neighbor: civs[x].neighbor) {
			int next = civ2int.get(neighbor);
			visited[next] = false;
		}
	}
	
	class Civ implements Comparable<Civ> {
		String name;
		int val;
		String[] neighbor;
		Civ (String name,int val, String[] neighbor) {
			this.name = name;
			this.val = val;
			this.neighbor = neighbor;
		}
		@Override
		public int compareTo(Civ o) {
			// TODO 自動生成されたメソッド・スタブ
			return o.val - val;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}