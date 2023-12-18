import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> minQueue = new PriorityQueue<Integer>();
		int n = sc.nextInt(), s = 0, k = 0;
		while (n-->0) {
			int a = sc.nextInt();
			minQueue.add(a);
			s+=a;
		}
		if (s%10==0) {
			while (!minQueue.isEmpty()) {
				int o = minQueue.poll();
				if ((s-o)%10!=0) {
					System.out.println(s-o); System.exit(0);
				}
			}
		}
		System.out.println(s%10==0 ? 0 : s);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}