import java.util.*;
import java.util.Map.Entry;

import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static Map<String, Integer> ip;
	static Map<String, ArrayList<String> > recipe;
	static String query;
	static final int INF = 999999999;
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		
		ip = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++)  ip.put(sc.next(), sc.nextInt());
		
		m = sc.nextInt();
		recipe = new HashMap<String, ArrayList<String> >();
		int k;
		String o;
		ArrayList<String> q;
		for(int i = 0; i < m; i++) {
			o = sc.next();
			k = sc.nextInt();
			q = new ArrayList<String>();
			for(int j = 0; j < k; j++) {
				q.add(sc.next());
				
			}
			recipe.put(o, q);
		}
		
		query = sc.next();
		return true;
	}
	
	static void solve() {
		System.out.println(rec(query));
	}
	
	static int rec(String item) {
		int value = ip.get(item);
		if(!recipe.containsKey(item)) return value;
		
		int tmp = 0;
		ArrayList<String> items = recipe.get(item);
		for(int i = 0; i < items.size(); i++) {
			tmp += rec(items.get(i));
		}
		
		ip.put(item, min(value, tmp));
		return Math.min(value, tmp);
	}
	
	public static void main(String[] args) {
		while(read()) solve();
	}
}