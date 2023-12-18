import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
    // ==================================================================
    public void solve() {
        BigDecimal T1 = new BigDecimal(sc.next());
        BigDecimal T2 = new BigDecimal(sc.next());
        BigDecimal A1 = new BigDecimal(sc.next());
        BigDecimal A2 = new BigDecimal(sc.next());
        BigDecimal B1 = new BigDecimal(sc.next());
        BigDecimal B2 = new BigDecimal(sc.next());
        BigDecimal AT1 = T1.multiply(A1);
        BigDecimal BT1 = T1.multiply(B1);
        BigDecimal AT12 = AT1.add(T2.multiply(A2));
        BigDecimal BT12 = BT1.add(T2.multiply(B2));
        if(AT1.compareTo(BT1) > 0 && AT12.compareTo(BT12) > 0)		out.println("0");
        else if(AT1.compareTo(BT1) < 0 && AT12.compareTo(BT12) < 0)	out.println("0");
        else {
        	BigDecimal X = (B1.subtract(A1)).multiply(T1).divide(A2.subtract(B2), 9, BigDecimal.ROUND_DOWN);
        	if(X.compareTo(T2) == 0)		out.println("infinity");
        	else {
        		BigDecimal cnt;
        		if(AT12.compareTo(BT12) > 0) {
        			cnt = BT1.subtract(AT1).divide((AT12.subtract(BT12)),0, BigDecimal.ROUND_DOWN);
        		} else {
        			cnt = AT1.subtract(BT1).divide((BT12.subtract(AT12)),0, BigDecimal.ROUND_DOWN);
        		}
        		out.println(cnt.intValue() * 2 + 1);
        	}
        }
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
