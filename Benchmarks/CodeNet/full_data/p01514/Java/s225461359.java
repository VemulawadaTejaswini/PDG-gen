
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if( (t|p|r) == 0 ) break;
			
			int[][] wa = new int[t][p];
			Pair[] results = new Pair[t];
			for(int i=0;i<t;i++) results[i] = new Pair(i+1, 0, 0);
			for(int i=0;i<r;i++) {
				int tid = sc.nextInt()-1;
				int pid = sc.nextInt()-1;
				int time = sc.nextInt();
				String str = sc.next();
				if( str.equals("CORRECT")) {
					results[tid].penalty += time + wa[tid][pid] * 1200;
					results[tid].solved++;
				}
				else {
					wa[tid][pid]++;
				}
			}
			sort(results);
			for(Pair pairs: results) 
				System.out.println( pairs.id + " " + pairs.solved + " " + pairs.penalty );
			
		}
	}
	
	class Pair implements  Comparable<Pair> {
		int id, solved, penalty;
		Pair(int id, int solved, int penalty) {
			this.id = id;
			this.solved = solved;
			this.penalty = solved;
		}
		
		@Override
		public int compareTo(Pair p) {
			// TODO 自動生成されたメソッド・スタブ
			if( solved != p.solved ) return p.solved - solved;
			else {
				if( penalty != p.penalty ) return penalty - p.penalty;
			}
			return id - p.id;
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}