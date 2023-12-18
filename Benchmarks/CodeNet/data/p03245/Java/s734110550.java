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
    	int N = ni();
    	int[] U = new int[N];
    	int[] V = new int[N];
    	int wk, amari = 0, x, y;
    	for (int i = 0; i < N; i++) {
			x = ni();
			y = ni();
			wk = (Math.abs(x) + Math.abs(y)) % 2;
			if(i != 0 && wk != amari) {
				out.println(-1);
				return;
			}
			amari = wk;
			U[i] = x + y;
			V[i] = x - y;
		}
    	// ２の累乗（大　→　小）を配列に設定する
    	int mcnt = 30;
    	long[] d;
    	if(amari == 0)	{
    		d = new long[mcnt+1];
    		d[mcnt] = 1;
    	} else {
    		d = new long[mcnt];
    	}
    	for (int i = mcnt - 1; i >= 0; i--) {
    		d[d.length - i - 1] = (1L << i);
    	}
    	out.println(d.length);
    	for (int i = 0; i < d.length; i++) {
    		out.print(d[i] + " ");
    	}
    	out.println();
    	StringBuffer sb = new StringBuffer();
    	long sumX, sumY;
    	boolean xp, yp;
    	for (int i = 0; i < N; i++) {
        	sumX = sumY = 0;
        	sb.setLength(0);
	    	// ２の累乗の足し算、引き算した結果で、入力値と一致させる
	    	for (int j = 0; j < d.length; j++) {
	    		if(sumX <= U[i]) {
	    			xp = true;
	    			sumX += d[j];
//	        		out.println(" + d[" + j + "] = " + d[j] + "  -->  sumX = " + sumX);
	    		} else {
	    			xp = false;
	    			sumX -= d[j];
//	        		out.println(" - d[" + j + "] = " + d[j] + "  -->  sumX = " + sumX);
	    		}
	    		if(sumY <= V[i]) {
	    			yp = true;
	    			sumY += d[j];
//	        		out.println(" + d[" + j + "] = " + d[j] + "  -->  sumY = " + sumY);
	    		} else {
	    			yp = false;
	    			sumY -= d[j];
//	        		out.println(" - d[" + j + "] = " + d[j] + "  -->  sumY = " + sumY);
	    		}
	    		if(!xp && !yp)		sb.append("L");
	    		else if(xp && yp)	sb.append("R");
	    		else if(xp && !yp)	sb.append("U");
	    		else				sb.append("D");
	    	}
//	    	out.println("結果  = " + sumX + " " + sumY);
	    	out.println(sb.toString());
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
}
