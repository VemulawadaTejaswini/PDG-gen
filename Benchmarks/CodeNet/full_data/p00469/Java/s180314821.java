
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, k;
	int nums[];
	HashSet<String> ans;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			k = sc.nextInt();
			if( (n|k) == 0 ) break;
			nums = new int[n];
			ans = new HashSet<String>();
			for(int i=0;i<n;i++) nums[i] = Integer.parseInt(sc.next());
			dfs(0, new boolean[n], "");
			System.out.println(ans.size());
		}
	}
	
	void dfs(int i, boolean[] used, String str) {
		if( k == i ) {
//			debug(str);
			ans.add(str);
		}
		for(int j=0;j<n;j++) {
			if( !used[j] ) {
				used[j] = true;
				dfs(i+1, used, str + nums[j]);
				used[j] = false;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}