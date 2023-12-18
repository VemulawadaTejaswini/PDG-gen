import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		
		TreeSet<Long> s = new TreeSet<>();
		s.add(Long.MIN_VALUE);
		s.add(Long.MAX_VALUE);
		for (int i = 0; i < A; i++) {
			s.add(sc.nextLong());
		}
		
		TreeSet<Long> t = new TreeSet<>();
		t.add(Long.MIN_VALUE);
		t.add(Long.MAX_VALUE);
		for (int i = 0; i < B; i++) {
			t.add(sc.nextLong());
		}
		
		for (int i = 0; i < Q; i++) {
			long start = sc.nextLong();
			
			long smax = s.higher(start);
			long smin = s.lower(start);
			
			long tmax = t.higher(start);
			long tmin = t.lower(start);
			
			long min = Long.MAX_VALUE;
			if (smin != Long.MIN_VALUE && tmin != Long.MIN_VALUE) {
				long tmp = start - Math.min(smin, tmin);
				min = Math.min(tmp, min);
			}
			
			if (smax != Long.MAX_VALUE && tmax != Long.MAX_VALUE) {
				long tmp = Math.max(smax, tmax) - start;
				min = Math.min(tmp, min);
			}
			
			if (smin != Long.MIN_VALUE && tmax != Long.MAX_VALUE) {
				long tmp1 = start - smin;
				long tmp2 = tmax - start;
				
				long sum = tmp1 + tmp2 + Math.min(tmp1, tmp2);
				min = Math.min(sum, min);
			}
			
			if (tmin != Long.MIN_VALUE && smax != Long.MAX_VALUE) {
				long tmp1 = start - tmin;
				long tmp2 = smax - start;
				
				long sum = tmp1 + tmp2 + Math.min(tmp1, tmp2);
				min = Math.min(sum, min);
			}
			
			System.out.println(min);
		}
	}
}
