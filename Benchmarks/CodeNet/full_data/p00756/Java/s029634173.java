import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	List<Disc> discs = new ArrayList<Disc>();
	Set<Disc> ups = new HashSet<Disc>();
	Set<Disc> used = new HashSet<Disc>();
	Map<Set<Disc>, Integer> memo = new HashMap<Set<Disc>, Integer>();
	int max = -1;

	public static void main(String[] args) {
		while(true) {
			n = sc.nextInt();
			if(n == 0) break;

			// init
			Main m =new Main();
			m.dfs(0);
			System.out.println(m.max-2);
		}
	}

	Main() {
		for(int i=0; i<n; i++) {
			Disc d = new Disc(sc, i);
			int deep = 0;
			for(Disc op : discs) {
				if( d.butsu(op) ) deep = Math.max(deep, op.deep);
			}
			deep++;
			if(deep == 1) ups.add(d);
			discs.add(d);
		}
	}

	void dfs(int m) {
		// memo
		if( memo.containsKey(used) ) return;

		// max
		max = Math.max(max, m);

		// go
		List<Disc> tmp = new ArrayList<Disc>(ups);
		for(int i=0; i<tmp.size(); i++) {
			Disc d = tmp.get(i);
			for(int j=i+1; j<tmp.size(); j++) {
				Disc op = tmp.get(j);
				if(d.equals(op)) continue;
				if(d.c == op.c) {
					push(d, op);
					dfs(m+2);
					push(d, op);
				}
			}
		}
	}

	void push(Disc a, Disc b) {
		pushSub(a);
		pushSub(b);
	}
	private void pushSub(Disc a) {
		used.add(a);
		discs.remove(a);
		ups.remove(a);
		ups.addAll(underAll(a));
	}

	void pop(Disc a, Disc b) {
		popSub(a);
		popSub(b);
	}
	private void popSub(Disc a) {
		used.remove(a);
		discs.add(a);
		ups.removeAll(underAll(a));
		ups.add(a);
	}

	boolean butsuAny(Disc d) {
		for(Disc op : discs) {
			if( d.butsu(op) ) return true;
		}
		return false;
	}

	Set<Disc> butsuAll(Disc d) {
		Set<Disc> res = new HashSet<Disc>();
		for(Disc op : discs) {
			if( d.butsu(op) ) res.add(op);
		}
		return res;
	}

	Set<Disc> underAll(Disc d) {
		Set<Disc> res = new HashSet<Disc>();
		for(Disc op : discs) {
			if( d.butsu(op) && d.deep == op.deep+1 ) res.add(op);
		}
		return res;
	}

}


class Disc {
	int x, y, r, c;
	int id;
	int deep;

	Disc(Scanner sc, int i) {
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		id = i;
	}

	boolean butsu(Disc op) {
		return false;
	}

}