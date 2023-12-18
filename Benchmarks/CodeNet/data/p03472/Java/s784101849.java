import java.util.*;
// warm-up
public class Main {

	static class Kitana implements Comparable<Kitana> {
		int d=0, i=0; // Damage, index
		boolean w = false;
		Kitana (int a, boolean t) {
			d=a; w=t;
		}
		public int compareTo (Kitana other) {
			return other.d-d;
		}
		public String toString() {
			return "Damage: "+d+" Wield: "+w;
		}
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		List<Kitana> k = new ArrayList<Kitana>();
		int N = sc.nextInt(), H = sc.nextInt(), D = 0, t = 0, c = 0;
		while (N-->0) {
			k.add(new Kitana(sc.nextInt(), true));
			k.add(new Kitana(sc.nextInt(), false));
		}
		Collections.sort(k);
		for (Kitana o : k) {
			if (!o.w) { t+=o.d; c++; }
			if (t>H) break;
			if (o.w) {
				while (t+D<H) { D+=o.d; c++; }
				break;
			}
		}
		System.out.println(c);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}