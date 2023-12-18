import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	static int[] ans;
	static ArrayList<ArrayList<Integer>> ab;
	static HashMap<Integer, Integer> px = new HashMap<>(); 

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		sc.close();
		int a = m / n;
		int ans = gcd(m, a);
		out.println(ans);
	}
	static int gcd(int n, int m) {
		int tmp = m;
		m = n % m;
		n = tmp;
		if(m != 0) {
			return gcd(n, m);
		} else {
			return n;
		}
	}
}
