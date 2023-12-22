
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int size;
	HashMap<Character, Integer> map;
	HashMap<Character, Integer> ans;
	HashSet<Character> first;
	char[] charas;
	int[] ind;
	int cnt;
	String[] str;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			map = new HashMap<Character, Integer>();
			HashSet<Character> cs = new HashSet<Character>();
			first = new HashSet<Character>();
			str = new String[n];
			for(int i=0;i<n-1;i++) {
				str[i] = sc.next();
				int tmp = 1;
				for(int j=str[i].length()-1;j>=0;j--) {
					if( !map.containsKey(str[i].charAt(j)) )
						map.put(str[i].charAt(j), tmp * 1);
					else map.put(str[i].charAt(j), map.get(str[i].charAt(j)) + tmp * 1);
					cs.add(str[i].charAt(j));
					tmp *= 10;
					
				}
				if(str[i].length() != 1)
					first.add(str[i].charAt(0));
			}
			str[n-1] = sc.next();
			int tmp = 1;
			ans = new HashMap<Character, Integer>();
			
			for(int j=str[n-1].length()-1;j>=0;j--) {
				if( !ans.containsKey(str[n-1].charAt(j)) )
					ans.put(str[n-1].charAt(j), tmp * 1);
				else ans.put(str[n-1].charAt(j), ans.get(str[n-1].charAt(j)) + tmp * 1);
				cs.add(str[n-1].charAt(j));
				tmp *= 10;
				if( str[n-1].length() != 1 )
					first.add(str[n-1].charAt(0));
			}
			size = cs.size();
			charas = new char[size];
			int i=0;
			for(char c: cs) charas[i++] = c;
			cnt = 0;

//			debug(map);
//			debug(ans);
//			debug(charas);
//			debug(first);
			dfs(0, new boolean[10], 0);
			System.out.println(cnt);
			
		}
	}
	
	void dfs(int i, boolean[] used, int sum) {
		
		if( i == size ) {
			if(sum == 0) {
				
//				debug(ind);
				cnt++;
			}
		}
		else {
			if(!used[0]) {
				if( !first.contains(charas[i]) ) {
					used[0] = true;
					int tmp = 0;
					dfs(i+1, used, sum + tmp);
					used[0] = false;
				}
				
			}
			for(int j=1;j<10;j++) {
				if(!used[j]) {
					used[j] = true;
					int tmp = 0;
					if(map.containsKey(charas[i])) tmp += map.get(charas[i]) * j;
					if(ans.containsKey(charas[i])) tmp -= ans.get(charas[i]) * j;
					dfs(i+1, used, sum + tmp);
					used[j] = false;
				}
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