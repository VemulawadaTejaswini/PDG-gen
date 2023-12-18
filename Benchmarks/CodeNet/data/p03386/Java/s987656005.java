import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), K = sc.nextInt(), no = K, i = A, j = B;
		SortedSet<Integer> s = new TreeSet<Integer>();
		while (no-->0) {
			if (i>B) break;
			s.add(i++);
		}
		no = K;
		while (no-->0) {
			if (j<A) break;
			s.add(j--);
		}
		for (int a : s) System.out.println(a);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}