import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		Work[] works = new Work[n];
		for(int i = 0; i < n; i++) {
			works[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(works);
		int now = 0;
		for(int i = 0; i < n; i++) {
			now += works[i].c;
			if(now > works[i].l) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	
	class Work implements Comparable<Work>{
		int c, l;//cost, limit
		Work(int cost, int limit) {
			c = cost; l = limit;
		}
		@Override
		public int compareTo(Work arg0) {
			if(this.l != arg0.l) {
				return (this.l < arg0.l)?-1:1;
			}
			else if(this.c != arg0.c) {
				return (this.c < arg0.c)?-1:1;
			}
			return 0;
		}
	}

	long gcd(long a, long b) {
		long w;
		while(b != 0) {
			w = a % b;
			a = b;
			b = w;
		}
		return a;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
