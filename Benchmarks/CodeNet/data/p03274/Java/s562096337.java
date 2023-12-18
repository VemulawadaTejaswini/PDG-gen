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
    	int N = Integer.parseInt(sc.next());
    	int K = Integer.parseInt(sc.next());
    	int[] X = new int[N];
    	int l = 0, r = 0, z = 0;
    	for (int i = 0; i < N; i++) {
			X[i] = Integer.parseInt(sc.next());
			if(X[i] < 0)		l++;
			else if(X[i] == 0)	z++;
			else 				r++;
		}
    	if(K <= z) {
    		out.println(0);
    		return;
    	}
    	K -= z;
    	long ans = 1000000000000000000L;
    	for (int i = 1; i <= K; i++) {
    		if(l < i)			break;
    		else if(i == K && K <= l)		ans = Math.min(ans, -X[l-i]);
    		else if(i + r < K)	continue;
    		else 	ans = Math.min(ans, -X[l-i]*2 + X[l+z+(K-i)-1]);
		}
    	for (int i = 1; i <= K; i++) {
    		if(r < i)			break;
    		else if(i == K && K <= r)		ans = Math.min(ans, X[l+z+i-1]);
    		else if(i + l < K)	continue;
    		else 	ans = Math.min(ans, X[l+z+i-1]*2 - X[l-(K-i)]);
		}
    	out.println(ans);
    }
}