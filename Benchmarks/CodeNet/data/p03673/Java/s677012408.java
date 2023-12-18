import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		int n = sc.nextInt();
		boolean addFirst = false;
		while (n-->0) {
			if (addFirst) l.add(0, sc.nextInt());
			else l.add(sc.nextInt());
			addFirst = !addFirst;
		}	
		if (addFirst) Collections.reverse(l);
		for (int a : l) System.out.print(a+" ");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}