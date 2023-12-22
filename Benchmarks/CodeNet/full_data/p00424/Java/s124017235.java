
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			HashMap<Character, Character> trans = new HashMap<Character, Character>();
			for(int i=0;i<n;i++) {
				char c1 = sc.next().charAt(0);
				char c2 = sc.next().charAt(0);
				trans.put(c1, c2);
			}
			
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				char c = sc.next().charAt(0);
				if( trans.containsKey(c) ) System.out.print( (char)trans.get(c) );
				else System.out.print( (char)c );
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}