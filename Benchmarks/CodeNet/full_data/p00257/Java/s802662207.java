import java.util.*;

public class Main {
	Scanner sc;
	
	int max;
	int n;
	int[] d;
	boolean[] done;
	void dfs(int depth) {
		if( depth >= n + 1 ) {
			return;
		}
		if( done[depth] ) {
			return;
		}
		done[depth] = true;
		
		for( int i = 1; i <= max; ++i ) {
			int ni = Math.min(depth + i, n + 1);
			ni = Math.max(Math.min(ni + d[ni], n + 1), 0);
			
			dfs(ni);
		}
		
		return;
	}
	
	int cnt;
	int num;
	void search(int depth) {
		if( depth >= n + 1 ) {
			return;
		}
		if( done[depth] ) {
			++cnt;
			return;
		}
		done[depth] = true;
		
		for( int i = 1; i <= max; ++i ) {
			int ni = Math.min(depth + i, n + 1);
			ni = Math.max(Math.min(ni + d[ni], n + 1), 0);
			
			++num;
			search(ni);
		}
	}
	
	void solve() {
		sc = new Scanner(System.in);
		
		while(true) {
			max = sc.nextInt();
			
			if( max == 0 ) break;
			
			n = sc.nextInt();
			d = new int[n + 2];
			
			d[0] = 0;
			for( int i = 1; i <= n; ++i ) {
				d[i] = sc.nextInt();
			}
			d[n+1] = 0;
			
			done = new boolean[n + 2];
			dfs(0);
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for( int i = 0; i <= n; ++i ) {
				if(done[i]) list.add(i);
			}
			
			boolean ans = false;
			for( int i : list ) {
				cnt = 0;
				num = 0;
				done = new boolean[n + 2];
				search(i);
				
				ans |= cnt==num;
			}
			
			System.out.println(ans ? "NG" : "OK");
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void debug(Object... os) {
		System.out.println(Arrays.deepToString(os));
	}
}