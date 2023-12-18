import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> x = new PriorityQueue<Integer>();
		for(int i = 0; i < m; i++) {
			x.add(sc.nextInt());
		}
		
		boolean ifFirst = true;
		int tmp = 0;
		PriorityQueue<Integer> d = new PriorityQueue<Integer>(Collections.reverseOrder());
		while(!x.isEmpty()) {
			int a = x.poll();
			if(ifFirst) {
				ifFirst = false;
				tmp = a;
			}else {
				d.add(a - tmp);
				tmp = a;
			}
		}
		
		for(int i = 0; i < n - 1; i++) {
			d.poll();
		}
		int ans = 0;
		while(!d.isEmpty()) {
			ans += d.poll();
		}
		
		System.out.println(ans);
	}
}