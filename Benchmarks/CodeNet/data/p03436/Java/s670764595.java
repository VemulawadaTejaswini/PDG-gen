import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

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
    // ==================================================================
    public void solve() {
    	int H = ni();
    	int W = ni();
    	char[][] D = ndc(H);
    	int bcnt = 0;
    	for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if(D[i][j] == '#')	bcnt++;
			}
		}
    	int[][] used = new int[H][W];
    	for (int i = 0; i < H; i++) {
			Arrays.fill(used[i], -1);
		}
    	used[0][0] = 0;
    	Queue<PP> que = new ArrayDeque<>();
    	que.add(new PP(0,0));
    	PP p;
    	int x, y;
    	while(!que.isEmpty()) {
    		p = que.poll();
    		y = p.y;
    		x = p.x;
    		if(y == H-1 && x == W-1) {
    			out.println(H*W - bcnt - used[y][x] - 1);
//    			out.println(" H*W = " + (H*W) + "  bcnt = " 
//    					+ bcnt + "  used = " + used[y][x]);
    			return;
    		}
    		if(y > 0 && D[y-1][x] != '#' && used[y-1][x] == -1) {
    			used[y-1][x] = used[y][x] + 1;
    			que.add(new PP(y-1,x));
    		}
    		if(x > 0 && D[y][x-1] != '#' && used[y][x-1] == -1)	{
    			used[y][x-1] = used[y][x] + 1;
    			que.add(new PP(y,x-1));
    		}
    		if(x < W-1 && D[y][x+1] != '#' && used[y][x+1] == -1) {
    			used[y][x+1] = used[y][x] + 1;
    			que.add(new PP(y,x+1));
    		}
    		if(y < H-1 && D[y+1][x] != '#' && used[y+1][x] == -1) {
    			used[y+1][x] = used[y][x] + 1;
    			que.add(new PP(y+1,x));
    		}
    	}
    }
    class PP {
    	int x, y;
    	public PP(int y, int x) {
    		this.x = x;
    		this.y = y;
    	}
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return Integer.parseInt(sc.next());
    }
    public long nl() {
    	return Long.parseLong(sc.next());
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
    public int[][] ndii(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
