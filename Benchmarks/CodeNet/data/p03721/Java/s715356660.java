import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		for (int x=0;x<n;x++) {
			int num = s.nextInt();
			int times = s.nextInt();
			Integer prev = m.get(num);
			if(prev!=null)
				m.put(num, m.get(num)+prev);
			else
				m.put(num, times);
		}
		
		Iterator<Integer> it = m.keySet().iterator();
		int count = 0;
		int cur;
		do {
			cur = it.next();
			count+= m.get(cur);
		} while(count<k);
		
		System.out.println(cur);
	}
}