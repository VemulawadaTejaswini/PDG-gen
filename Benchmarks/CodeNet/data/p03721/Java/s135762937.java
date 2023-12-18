import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), n=N, t=0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Queue<Integer> minQueue = new PriorityQueue<Integer>();
		while (n-->0) {
			int b = sc.nextInt(), c = sc.nextInt();
			if (!m.containsKey(b)) minQueue.add(b);
			m.put(b,m.get(b)==null ? c : m.get(b)+c);
		}
		while (!minQueue.isEmpty()) {
			int k = minQueue.poll();
			if (t==K||t+m.get(k)>=K) {
				System.out.println(k); System.exit(0);				
			}
			t+=m.get(k);
		}
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}