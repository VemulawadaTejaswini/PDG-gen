
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int m, t, p, r;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			m = sc.nextInt(); t = sc.nextInt(); p = sc.nextInt(); r = sc.nextInt();
			if( (m|t|p|r) == 0 ) break;
			T[] team = new T[t];
			for(int i=0;i<t;i++) team[i] = new T(i+1);
			for(int i=0;i<r;i++) {
				int m = sc.nextInt(), t = sc.nextInt(), p = sc.nextInt(), j = sc.nextInt();
				team[t-1].solve(p, m, j);
			}
			sort(team);
			System.out.print(team[0].id);
			for(int i=1;i<t;i++) System.out.print((team[i].sol == team[i-1].sol && team[i].pen == team[i-1].pen? "=": ",") + team[i].id);
			System.out.println();
		}
	}
	
	class T implements Comparable<T> {
		int id, sol, pen;
		int[] pt;
		T(int id) {
			this.id = id;
			sol = 0; pen = 0;
			pt = new int[p];
		}
		
		void solve(int p, int t, int j) {
			if(j == 0) {
				sol++; pen += t + pt[p-1] * 20;
			}
			else {
				pt[p-1]++;
			}
		}

		public int compareTo(T o) {
			if( sol != o.sol ) return o.sol - sol;
			if( pen != o.pen ) return pen - o.pen;
			return o.id - id;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}