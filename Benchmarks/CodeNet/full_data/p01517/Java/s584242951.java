
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	HashMap<String, Integer> civ2int;
	Civ[] civs;
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
			for(Civ civ: civs) {
				civ.setEnemy();
				debug(civ.name, civ.enemy, civ.val, civ.neighbor);
				
			}
			max = 0;
			dfs(0, 0, 0);
			System.out.println(max);
		}
	}
	
	void dfs(int x, long enemyes, int val) {
		debug(x, enemyes, (enemyes >> x), val);
		if( x == n ) {
			max = max( max, val );
			return;
		}
		if( ((enemyes >> x)&1) == 1 ) {
			dfs(x+1, enemyes,  val);
			return;
		}
		enemyes += 1<<x;
		dfs(x+1, enemyes|civs[x].enemy, val+civs[x].val);
		enemyes -= 1<<x;
		if(x != 0) dfs(x+1, enemyes, val);
	}
	
	class Civ implements Comparable<Civ> {
		String name;
		int val;
		String[] neighbor;
		long enemy;
		Civ (String name,int val, String[] neighbor) {
			this.name = name;
			this.val = val;
			this.neighbor = neighbor;
			enemy = 0;
		}
		
		void setEnemy() {
			for(String str: neighbor) {
				enemy |= 1 << (civ2int.get(str));
			}
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