
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P{
		int d;
		int k;
		P(int d, int k){
			this.d=d;
			this.k=k;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
		for(int i=0; i<n; i++) {
			ll.add(new ArrayList<Integer>());
		}
		for(int i=0; i<n; i++) {
			int t = sc.nextInt();
			int d = sc.nextInt();
			ll.get(--t).add(d);
		}
		for(ArrayList<Integer> l : ll) {
			Collections.sort(l);
		}

		ArrayList<P> pl = new ArrayList<P>();
		for(ArrayList<Integer> l : ll) {
			for(int i=0; i<l.size(); i++) {
				int d = l.get(i);
				P p = new P(d, (i==l.size()-1) ? 1 : 0);
				pl.add(p);
			}
		}
		Collections.sort(pl, (p1, p2)->Integer.compare(p1.d, p2.d));

		int choose = 0;
		long sum = 0;
		long max = 0;
		int kind = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=pl.size()-1; i>=0; i--) {
			int d = pl.get(i).d;
			sum += d;
			kind += pl.get(i).k;
			choose++;
			if(choose > k) {
				sum -= pq.poll();
				choose--;
			}
			if(choose == k) {
				max = Math.max(max, sum + kind*kind);
			}
			if( pl.get(i).k==0) {
				pq.add(d);
			}
			if(kind==k) break;
		}
		System.out.println(max);
		sc.close();
	}


}
