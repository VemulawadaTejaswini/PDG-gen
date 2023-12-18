import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long k = sc.nextLong();
						
			Long a[] = new Long[n];
			long f[] = new long[n];
			for(int i = 0 ; i < n ; i++ ) {
				a[i] = sc.nextLong();
			}
			for(int i = 0 ; i < n ; i++ ) {
				f[i] = sc.nextLong();
			}
			
			Arrays.sort(a, Collections.reverseOrder());
			Arrays.sort(f);
			
			Comparator<Combination> comp = new Comparator<Combination>() {

				@Override
				public int compare(Combination o1, Combination o2) {
					return Long.compare(o1.a * o1.f, o2.a * o2.f) * -1;
				}
				
			};
			
			PriorityQueue<Combination> pq = new PriorityQueue<Combination>(comp);
			
			for(int i = 0 ; i < n ; i++ ) {
				Combination c = new Combination();
				c.a = a[i];
				c.f = f[i];
				pq.add(c);
			}

			for(int i = 0 ; i < k ; i++ ) {
				Combination c = pq.remove();
				if ( c.a > 0 ) {
					c.a--;
				}
				pq.add(c);
			}
			
			Combination c = pq.remove();
			System.out.println(c.a * c.f);
		}
	}
	
	public static class Combination {
		public long a;
		public long f;
		
	}
}