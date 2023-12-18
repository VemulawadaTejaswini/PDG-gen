import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
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
    	int X = Integer.parseInt(sc.next());
    	int Y = Integer.parseInt(sc.next());
    	int Z = Integer.parseInt(sc.next());
    	int K = Integer.parseInt(sc.next());
    	long[] A = new long[X];
    	for (int i = 0; i < X; i++) {
			A[i] = Long.parseLong(sc.next());
		}
    	long[] B = new long[Y];
    	for (int i = 0; i < Y; i++) {
			B[i] = Long.parseLong(sc.next());
		}
    	long[] C = new long[Z];
    	for (int i = 0; i < Z; i++) {
			C[i] = Long.parseLong(sc.next());
		}
    	long[] AB = new long[1000*1000];
    	int kk = 0;
    	for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				AB[kk] = A[i] + B[j];
//				out.println("AB[" + kk + "] = " + AB[kk] 
//						+ "  A[" + i + "] = " + A[i]
//						+ "  B[" + j + "] = " + B[j]);
				kk++;
			}
		}
    	Arrays.sort(AB);
    	long[] ABC = new long[3000 * 1000];
    	kk = 0;
    	for (int i = AB.length -1; i >= Math.max(0, AB.length - 3000) ; i--) {
			for (int j = 0; j < Z; j++) {
				ABC[kk] = AB[i] + C[j];
//				out.println("ABC[" + kk + "] = " + ABC[kk] 
//						+ "  AB[" + i + "] = " + AB[i]
//						+ "  C[" + j + "] = " + C[j]);
				kk++;
			}
		}
    	Arrays.sort(ABC);
    	for (int i = ABC.length - 1; i >= Math.max(0, ABC.length - K) ; i--) {
			out.println(ABC[i]);
		}
    }
}

