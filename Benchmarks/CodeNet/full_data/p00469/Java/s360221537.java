
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, k;
	String nums[];
	HashSet<String> ans;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			k = sc.nextInt();
			if( (n|k) == 0 ) break;
			nums = new String[n];
			ans = new HashSet<String>();
			for(int i=0;i<n;i++) nums[i] = sc.next();
			dfs(0, new boolean[n], new StringBuilder(""));
			System.out.println(ans.size());
		}
	}
	
	void dfs(int i, boolean[] used, StringBuilder str) {
//		debug(str.toString());
		if( k == i ) {
//			debug(str);
			ans.add(str.toString());
		}
		for(int j=0;j<n;j++) {
			if( !used[j] ) {
				used[j] = true;
				dfs(i+1, used, str.append(nums[j]));
				str.delete(str.length()-nums[j].length(), str.length());
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