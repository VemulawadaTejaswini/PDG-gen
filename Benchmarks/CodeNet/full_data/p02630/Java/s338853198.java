import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashMap<Long,Long> h = new HashMap<>();
		long sum = 0;
		while(n--!=0) {
			long c = s.nextInt();
			if(h.containsKey(c)) {
				h.put(c, h.get(c)+1);
			}
			else {
				h.put(c, 1l);
			}
			sum+=c;
		}
		int q = s.nextInt();
		while(q--!=0) {
			long b = s.nextInt();
			long c = s.nextInt();
			if(!h.containsKey(b)) {
				System.out.println(sum);
				continue;
			}
			long times = h.get(b);
			sum-=times*b;
			sum+=times*c;
			h.remove(b);
			if(h.containsKey(c)) {
				h.put(c,h.get(c)+times);
			}
			else {
				h.put(c, times);
			}
			
			System.out.println(sum);
		}
			
		
	}

}
