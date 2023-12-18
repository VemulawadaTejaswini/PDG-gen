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
    boolean check(int[] src, int[] dest) {
    	boolean ans = true;
    	for (int i = 0; i < src.length; i++) {
			if(src[i] != dest[i]) {
				ans = false;
				break;
			}
		}
    	return ans;
    }
    public void solve() {
    	int N = ni();
    	int[] P = ndi(N);
    	int[] Q = ndi(N);
    	int[] ord = new int[N];
    	for (int i = 0; i < N; i++) {
			ord[i] = i+1;
		}
    	int cnt = 1, a = 0, b = 0;
        do {
//        	for (int i = 0; i < N; i++) {
//				out.print(ord[i] + " ");
//			}
//        	out.println("");
        	if(Arrays.equals(ord, P))	a = cnt;
        	if(Arrays.equals(ord, Q))	b = cnt;
//        	if(check(ord, P))	a = cnt;
//        	if(check(ord, Q))	b = cnt;
        	cnt++;
        	// 処理を書く								
        } while (next_permutation(ord));
        out.println(Math.abs(a-b));
    }
    									
    // 与えられた配列の中身を辞書順に、次の順列をセットする（次がなければ　false を返す）									
    public boolean next_permutation(int[] a) {									
    	for (int i = a.length - 2; i >= 0; i--) {								
    		if (a[i] < a[i + 1]) {							
    			for (int j = a.length - 1;; j--) {						
    				if (a[i] < a[j]) {					
    					int temp = a[i];				
    					a[i] = a[j];				
    					a[j] = temp;				
    					for (i++, j = a.length - 1; i < j; i++, j--) {				
    						temp = a[i];			
    						a[i] = a[j];			
    						a[j] = temp;			
    					}				
    					return true;				
    				}					
    			}						
    		}							
    	}								
    	return false;								
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
