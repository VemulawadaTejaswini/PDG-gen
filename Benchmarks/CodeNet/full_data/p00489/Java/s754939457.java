
import java.util.*;
import java.util.Map.Entry;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	HashMap<Integer, Integer> score;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		score = new HashMap<Integer, Integer>();
		for( int i=0;i<n*(n-1)/2;i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if( score.containsKey(a) ) {
				score.put(a, score.get(a) + ( (c > d)? 3: ( c == d )? 1: 0 ) );
			}
			else {
				score.put(a, ( (c > d)? 3: ( c == d )? 1: 0 ) );
			}
			if( score.containsKey(b) ) {
				score.put(b, score.get(b) + ( (c < d)? 3: ( c == d )? 1: 0 ) );
			}
			else {
				score.put(b, ( (c < d)? 3: ( c == d )? 1: 0 ) );
			}
		}
//		debug(score);
		Pair[] pairs = new Pair[n];
		int i=0;
		for(Map.Entry<Integer, Integer> entry: score.entrySet()) {
			pairs[i++] = new Pair( entry.getKey(), entry.getValue() );
		}
		sort(pairs, new MyComp());
		i = 1;
		int[] ans = new int[n];
		ans[pairs[0].f-1] = i;
		for(int j=1;j<n;j++) {
			if( pairs[j].s != pairs[j-1].s ) {
				ans[pairs[j].f-1] = j + 1;
				i = j + 1;
			}
			if( pairs[j].s == pairs[j-1].s ) ans[pairs[j].f-1] = i;
		}
		ans[pairs[n-1].f-1] = i;
		for(int ind: ans) System.out.println(ind);
		
	}
	
	class MyComp implements Comparator<Pair> {

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO 自動生成されたメソッド・スタブ
			return o2.s - o1.s;
		}
		
	}
	
	class Pair {
		int f, s;
		Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}