
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

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
			int ind = 0;
			for(;;ind++) {
				if(p_ind[ind] > n ) break;
			}
			
//			debug(p_ind[ind]);
			
			LinkedList<Integer> ans = new LinkedList<Integer>();
			for(int i=ind;i<min(s, ind+100);i++) for(int j=i;j<min(s, ind+100);j++) {
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