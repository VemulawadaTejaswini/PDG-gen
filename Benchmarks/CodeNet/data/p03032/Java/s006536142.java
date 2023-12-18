import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
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
    // 最大公約数の取得			
    long gcd(long a, long b) {			
    	if (b == 0)		
    		return a;	
    	return gcd(b, a % b);		
    }			
    			
    // 最小公倍数の取得			
    long lcm(long a, long b) {			
    	return a / gcd(a, b)  * b;		
    }			

    // ==================================================================
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int K = Integer.parseInt(sc.next());
    	int[] V = new int[N];
    	for (int i = 0; i < N; i++) {
			V[i] = Integer.parseInt(sc.next());
		}
    	PriorityQueue<Integer> PQ = new PriorityQueue<>();
    	int M = Math.min(N, K);
    	long ans = 0, total;
    	Integer wk;
    	for (int l = 0; l <= M; l++) {
			for (int r = 0; r <= M - l; r++) {
				total = 0;
				PQ.clear();
				for (int i = 0; i < l; i++) {
					total += V[i];
					PQ.add(V[i]);
				}
				for (int i = N - 1; i > N - 1 - r; i--) {
					total += V[i];
					PQ.add(V[i]);
				}
				for (int i = 0; i < K - r - l; i++) {
					wk = PQ.poll();
					if(wk == null || wk >= 0)		break;
					total -= wk;
				}
				ans = Math.max(ans, total);
			}
		}
    	out.println(ans);
    }
    // ==================================================================
}
class PP{
	public int key, val;
	public PP(int key, int val) {
		this.key = key;
		this.val = val;
	}
	public int getKey() {
		return key;
	}
	public int getVal() {
		return val;
	}
}