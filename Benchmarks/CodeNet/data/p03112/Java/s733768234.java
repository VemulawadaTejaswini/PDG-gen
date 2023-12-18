import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), q = sc.nextInt();
		
		TreeSet<Long> t = new TreeSet<Long>(),
				s = new TreeSet<Long>();
		
		for (int i=0; i<a; i++) s.add(sc.nextLong());
		for (int i=0; i<b; i++) t.add(sc.nextLong());
		
		for (int i=0; i<q; i++) {
			long pos = sc.nextLong();
			Long tl = pos - t.lower(pos), tr = t.higher(pos) - pos, 
					sl = pos - s.lower(pos), sr = s.higher(pos) - pos;
			if (tl==null) tl = 1L<<30;
			if (tr==null) tl = 1L<<30;
			if (sl==null) tl = 1L<<30;
			if (sr==null) tl = 1L<<30;
			
			long min = Math.min(Math.min(tl, sl), Math.min(tr, sr));
			min = Math.min(min, tl + sr + Math.min(tl, sr));
			min = Math.min(min, tr + sl + Math.min(tr, sl));
			
			System.out.println(min);
			
		}
	}
}