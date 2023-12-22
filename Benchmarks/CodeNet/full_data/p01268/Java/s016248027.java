
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	int INF = 1 << 28;
	int MAX = 300000;
	boolean[] p;

	void run() {
		Scanner sc = new Scanner(System.in);
		p = new boolean[MAX+1];
		LinkedList<Integer> primes = new LinkedList<Integer>();
		for(int i=2;i<=MAX;i++) if( !p[i] ){
			primes.add(i);
			for(int j=i*2;j<=MAX;j+=i) p[j] = true;
		}
		
		int[] p_ind = new int[primes.size()];
		int s = primes.size();
		for(int i=0;i<s;i++) p_ind[i] = primes.removeFirst();
		
		
		for(;;) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if( n == -1 && p == -1 ) break;
			
//			debug(s);
			int l = 0;
			int r = s;
			while(l <= r) {
//				debug(l, r);
				int c = (l+r) / 2;
				if( p_ind[c] > n ) r = c-1;
				else if( p_ind[c] < n ) l = c+1;
				else {
					l = r = c+1;
					break;
				}
			}
			int ind = max(l, r);
			
//			debug(p_ind[ind]);
			
			LinkedList<Integer> ans = new LinkedList<Integer>();
			for(int i=ind;i<min(s, ind+300);i++) for(int j=i;j<min(s, ind+300);j++) {
				ans.add(p_ind[i] + p_ind[j]);
			}
			Collections.sort(ans);
//			debug(ans);
			System.out.println(ans.get(p-1));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}