import java.util.*;
public class Main {
	int limit;
	int[] dish;
	int ans = Integer.MIN_VALUE;
	
	boolean isPrime(int num) {
		if(num < 2) return(false);
		for(int r = 2; r * r <= num; r++) {
			if(num % r == 0) return(false);
		}
		return(true);
	}
	
	int solve() {
		Queue<Integer> sum = new LinkedList<Integer>();
		HashSet<Integer> closed = new HashSet<Integer>();
		sum.add(0);
		
		int ans = -1;
		while(!sum.isEmpty()) {
			int now = sum.poll();
			if(closed.contains(now)) continue;
			closed.add(now);
			for(int r = 0; r < dish.length; r++) {
				int next = now + dish[r];
				if(next <= limit) {
					if(isPrime(next)) ans = Math.max(ans, next);
					sum.add(next);
				}
			}
		}
		return(ans);
	}
	
	void doIt() {
		Scanner stdIn =new Scanner(System.in);
		
		while(true) {
			int kind = stdIn.nextInt();
			limit = stdIn.nextInt();
			if(kind + limit == 0) break;
			dish = new int[kind];
			for(int r = 0; r < kind; r++) {
				dish[r] = stdIn.nextInt();
			}
			int out = solve();
			System.out.println((out != -1) ? out : "NA");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}