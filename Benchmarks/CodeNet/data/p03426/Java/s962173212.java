import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    PP[] A;
    int[] WA;
    public void solve() {
    	int H = Integer.parseInt(sc.next());
    	int W = Integer.parseInt(sc.next());
    	int D = Integer.parseInt(sc.next());
    	A = new PP[H * W];
    	int a;
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W; j++) {
				a = Integer.parseInt(sc.next()) - 1;
				A[a] = new PP(i, j);
			}
		}
    	WA = new int[H * W];
    	PP p1, p2;
    	int wk;
    	for (int i = 0; i < (H * W - D); i++) {
    		p1 = A[i];  p2 = A[i+D];
			wk = Math.abs(p1.key - p2.key) + Math.abs(p1.val - p2.val);
			if(i - D >= 0)	WA[i] = WA[i-D] + wk;
			else			WA[i] = wk;
    	}
    	int Q = Integer.parseInt(sc.next());
    	int l, r;
    	for (int i = 0; i < Q; i++) {
    		l = Integer.parseInt(sc.next()) - 1;
    		r = Integer.parseInt(sc.next()) - 1;
    		if(l == r)		out.println(0);
    		else if(l < D)	out.println(WA[r-D]);
    		else			out.println(WA[r-D] - WA[l-D]);
		}
    }
    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
    }
}

