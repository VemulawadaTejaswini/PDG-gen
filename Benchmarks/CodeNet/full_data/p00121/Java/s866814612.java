
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	void run() {
		Scanner sc = new Scanner(System.in);
		pow = new int[8];
		pow[0] = 1;
		for (int i=1;i<8;i++) pow[i] = pow[i-1]*10;
		solve();
//		debug(map.size(), 2*3*4*5*6*7*8);
		for (;sc.hasNext();) {
			String num = "";
			for (int i=0;i<8;i++) {
				num += sc.nextInt();
			}
			System.out.println(map.get(Integer.parseInt(num)));
		}
	}

	void solve() {
		LinkedList<Integer> q = new LinkedList<Integer>();
		LinkedList<Integer> d = new LinkedList<Integer>();
		q.add(1234567);
		d.add(0);
		map.put(1234567,  0);
		while(!q.isEmpty()) {
			int cp = q.removeFirst(), cd = d.removeFirst();
//			debug(nextState(cp));
			for (int i: nextState(cp)) if (! map.containsKey(i)) {
				map.put(i, cd + 1);
				q.add(i); d.add(cd + 1);
			}
		}
	}
	
	int[] pow;
	int[] nextState(int s) {
		int p=0;
		String num = "" + s;
		if (num.length() == 7) p = 0;
		else for (;p<8;p++) if (num.charAt(p) == '0') break;
		p = 7-p;
		if (p == 1 || p == 2 || p == 5 || p == 6) {
			int[] next = new int[3];
			next[0] = swap(s, p, p-1);
			next[1] = swap(s, p, p+1);
			next[2] = swap(s, p, (p+4)%8);
			return next;
		}
		if (p == 0 || p == 4) {
			int[] next = new int[2];
			next[0] = swap(s, p, p+1);
			next[1] = swap(s, p, (p+4)%8);
			return next;
		}
		int[] next = new int[2];
		next[0] = swap(s, p, p-1);
		next[1] = swap(s, p, (p+4)%8);
		return next;
	}

	int swap(int a, int s, int t) {
		int tmp1 = (a / pow[s]) % 10;
		int tmp2 = (a / pow[t]) % 10;

		return a + (tmp2 - tmp1) * pow[s] + (tmp1 - tmp2) * pow[t];
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}