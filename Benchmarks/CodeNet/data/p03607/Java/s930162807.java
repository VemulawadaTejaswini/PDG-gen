import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Set<Integer> s = new HashSet<Integer>();
		int N = sc.nextInt(), t = 0;
		while (N-->0) {
			int a = sc.nextInt();
			if (s.contains(a)) s.remove(a);
			else s.add(a);
		}
		System.out.println(s.size());
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}