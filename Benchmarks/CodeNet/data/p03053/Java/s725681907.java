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
    	char[][][] D = new char[2][][];
    	D[0] = ndc(H);
    	D[1] = new char[H][W];
    	int from = 0, to = 1, ans = 0;
    	boolean f;
    	while(true) {
    		f = true;
    		LOOP:
	    	for (int i = 0; i < H; i++) {
	    		for (int j = 0; j < W; j++) {
	    			if(D[from][i][j] == '.') {
	    				f = false;
	    				break LOOP;
	    			}
	    		}
	    	}
    		if(f)	break;
	    	for (int i = 0; i < H; i++) {
	    		for (int j = 0; j < W; j++) {
					D[to][i][j] = D[from][i][j];
				}
	    	}
	    	for (int i = 0; i < H; i++) {
	    		for (int j = 0; j < W; j++) {
	    			if(D[from][i][j] == '#') {
	    				if(i > 0)	D[to][i-1][j] = '#';
	    				if(j > 0)	D[to][i][j-1] = '#';
	    				if(j < W-1)	D[to][i][j+1] = '#';
	    				if(i < H-1)	D[to][i+1][j] = '#';
	    			}
	    		}
			}
	    	ans++;
	    	if(from == 0) {
	    		from = 1;	to = 0;
	    	} else {
	    		from = 0;	to = 1;
	    	}
		}
    	out.println(ans);
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
