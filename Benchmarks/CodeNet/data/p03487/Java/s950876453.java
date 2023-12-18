import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int N = sc.nextInt(), t = 0;
		while (N-->0) {
			int a = sc.nextInt();
			m.put(a, m.get(a)==null ? 1 : m.get(a)+1);
		}
		for (Map.Entry<Integer, Integer> e : m.entrySet()) 
			if (e.getKey()!=e.getValue()) 
				t+=(e.getValue()>e.getKey()) ? e.getValue()-e.getKey() : e.getValue();
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}