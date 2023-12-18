import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	
	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int v[] = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		System.out.println(search(0, k, v, new PriorityQueue<Integer>(), 0, 0, 0, n - 1));
		
	}
	
	int search(int num, int k, int[] v, PriorityQueue<Integer> pq, int sum, int val, int l , int r) {
		if(num == k || r < l) return sum;
		if(val < 0)pq.add(val);
		int max = sum;
		int w = search(num + 1, k, v, pq, sum + v[l], v[l], l + 1, r);
		if(max < w) max = w;
		w = search(num + 1, k, v, pq, sum + v[r], v[r], l, r - 1);
		if(max < w) max = w;
		if(!pq.isEmpty()) {
			int m = pq.poll();
			if(m < 0) {
				w = search(++num, k, v, pq, sum - m, 0, l, r);
				if(max < w) max = w;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
