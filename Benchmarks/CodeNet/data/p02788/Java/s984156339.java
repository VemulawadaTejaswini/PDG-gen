import static java.util.Comparator.comparing;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==========================================================
    final long INF = 100000000000000000L;
    int N; 
    long D, A;
    List<PPL> list = new ArrayList<>();
    PriorityQueue<bomb> PQ = new PriorityQueue<bomb>(comparing(bomb::getStart)); 
    List<bomb> save = new ArrayList<>();
    public void solve() {
    	N = ni();
    	D = nl();
    	A = nl();
    	long x, h;
    	for (int i = 0; i < N; i++) {
			x = nl();
			h = nl();
			list.add(new PPL(x,h));
		}
    	list.sort(comparing(PPL::getKey));
    	long start = 0, end = 0, ans = 0, sv = 0, wk, cnt;
    	bomb bb;
    	for (PPL pp : list) {
    		wk = pp.val;
    		while(wk > 0) {
    			bb = PQ.poll();
    			if(bb == null) {
    				cnt = (wk + A - 1) / A;
    				ans += cnt;
    				bb = new bomb(pp.key, pp.key + 2 * D, cnt * A);
    				save.add(bb);
    				break;
    			}
    			if(bb.start <= pp.key && bb.end >= pp.key) {
    				wk -= bb.value;
    				save.add(bb);
    			}
    		}
    		PQ.addAll(save);
		}
    	out.println(ans);
    }
    class bomb {
    	public long start, end;
    	public long value;
    	public bomb(long start, long end, long value){
    		this.start = start;
    		this.end = end;
    		this.value = value;
    	}
    	public long getStart() {
    		return start;
    	}
    }
    class PPL {
    	public long key, val;
    	public PPL(long key, long val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public void setKey(long key) {
			this.key = key;
		}
		public long getVal() {
			return val;
		}
		public void setVal(long val) {
			this.val = val;
		}
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return sc.nextInt();
    }
    public long nl() {
    	return sc.nextLong();
    }
    public String ns() {
    	return sc.next();
    }
    public char[] nc() {
    	return sc.next().toCharArray();
    }
    public int[] ndi(int N) {
    	int[] ans = new int[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ni();
		}
    	return ans;
    }
    public long[] ndl(int N) {
    	long[] ans = new long[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = nl();
		}
    	return ans;
    }
    public String[] nds(int N) {
    	String[] ans = new String[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ns();
		}
    	return ans;
    }
    public char[][] ndc(int N) {
    	char[][] ans = new char[N][];
    	for (int i = 0; i < N; i++) {
			ans[i] = nc();
		}
    	return ans;
    }
    public int[][] nddi(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
