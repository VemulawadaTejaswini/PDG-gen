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
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int K = Integer.parseInt(sc.next());
    	int[] NG = new int[10];
    	int d;
    	for (int i = 0; i < K; i++) {
        	d = Integer.parseInt(sc.next());
			NG[d] = 1;
		}
    	int ans = 999999, wk, sv1, sv2, sv3, sv4, sv5;
    	for (int i1 = 0; i1 < 10; i1++) {
    		if(NG[i1] == 1)	continue;
    		wk = i1;
    		if(wk >= N && wk < ans)	{ ans = wk; break; }
    		sv2 = wk;
    		for (int i2 = 0; i2 < 10; i2++) {
    			wk = sv2;
        		if(NG[i2] == 1)	continue;
        		wk += i2*10;
        		if(wk >= N && wk < ans)	{ ans = wk; break; };
        		sv3 = wk;
            	for (int i3 = 0; i3 < 10; i3++) {
        			wk = sv3;
            		if(NG[i3] == 1)	continue;
            		wk += i3*100;
            		if(wk >= N && wk < ans)	{ ans = wk; break; }
            		sv4 = wk;
                	for (int i4 = 0; i4 < 10; i4++) {
            			wk = sv4;
                		if(NG[i4] == 1)	continue;
                		wk += i4*1000;
                		if(wk >= N && wk < ans)	{ ans = wk; break; }
                		sv5 = wk;
                    	for (int i5 = 0; i5 < 10; i5++) {
                			wk = sv5;
                    		if(NG[i5] == 1)	continue;
                    		wk += i5*10000;
                    		if(wk >= N && wk < ans)	{ ans = wk; break; }
                    	}
                	}
            	}
    		}
    	}
    	out.println(ans);
    }
}

