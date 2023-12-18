import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
import java.util.Random;
import java.util.Map.Entry;
import java.util.Objects;
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
    //================================================================================
    public void solve() {
    	int H = Integer.parseInt(sc.next());
    	int W = Integer.parseInt(sc.next());
    	String s;
    	char[][] A = new char[H][];
    	Set<Integer> set = new HashSet<>();
    	int cnt = 0;
    	for (int i = 0; i < H; i++) {
    		s = sc.next();
    		if(!s.contains("#"))	continue;
			A[cnt] = s.toCharArray();
			for (int j = 0; j < A[cnt].length; j++) {
				if(A[cnt][j] == '#')		set.add(j);
			}
			cnt++;
		}
    	for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < W; j++) {
				if(set.contains(j))	out.print(A[i][j]);
			}
			out.println();
		}
    }
}