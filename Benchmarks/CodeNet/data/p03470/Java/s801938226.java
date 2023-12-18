import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Set<Integer> s = new HashSet<Integer>();
		int N = sc.nextInt();
		while (N-->0) s.add(sc.nextInt());
		System.out.println(s.size());
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}