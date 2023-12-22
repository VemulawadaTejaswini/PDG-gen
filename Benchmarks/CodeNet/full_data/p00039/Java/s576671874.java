
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	
	void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1); map.put('V', 5); map.put('X', 10);
		map.put('L', 50); map.put('C', 100); map.put('D', 500); map.put('M', 1000);
		while(sc.hasNext()) {
			String str = sc.next();
			int ans = 0, c = 1, buf = 0;
			for(int i=str.length()-1;i>=0;i--) {
				int val = map.get(str.charAt(i));
				if( buf > val ) c = -1;
				if( buf < val ) c = 1;
				ans += c*val;
				buf = val;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}