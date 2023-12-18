import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
    	char[] C1 = sc.next().toCharArray();
		char[] C2 = sc.next().toCharArray();
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		int cnt1, cnt2;
		for (int i = 0; i < C1.length; i++) {
			cnt1 = (int)(C1[i] - '0');
			cnt2 = (int)(C2[i] - '0');
			if(map1.get(cnt1) == null) {
				map1.put(cnt1, cnt2);
			} else if(map1.get(cnt1) != cnt2) {
				out.println("No");	return;
			}
			if(map2.get(cnt2) == null) {
				map2.put(cnt2, cnt1);
			} else if(map2.get(cnt2) != cnt1) {
				out.println("No");	return;
			}
		}
		out.println("Yes");
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