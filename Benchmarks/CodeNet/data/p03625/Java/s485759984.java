import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i = 0, l = -1, b = -1;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Queue<Integer> maxQueue = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare (Integer a, Integer b) {
				return b-a;
			}
		});
		while (N-->0) {
			int a = sc.nextInt();
			m.put(a, m.get(a)==null ? 1 : m.get(a)+1);
			maxQueue.add(a);
		}
		while (!maxQueue.isEmpty()) {
			int k = maxQueue.poll();
			if (m.get(k)>=2) {
				if (l==-1) {
					l = k;
					m.put(k, m.get(k)-2);
					maxQueue.poll();
					continue;
				}
				if (b==-1) { b=k; break; }
			}
		}
		System.out.println((l==-1||b==-1) ? 0 : new BigInteger(""+l).multiply(new BigInteger(""+b)));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}