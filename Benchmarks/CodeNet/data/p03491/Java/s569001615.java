import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long L = sc.nextLong();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			add(set, s);
		}
		
		PriorityQueue<String> q = new PriorityQueue<String>(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return - (s1.length() - s2.length());
			}
		});
		for(String s : set)
			q.add(s);
		
		long xor=0;
		while(! set.contains("")) {
			String s = q.poll();
			String rev = revTail(s);
			
			xor ^= (((L - rev.length())%2)+1);
			add(set, rev);
		}
		
		System.out.println(xor==0 ? "Bob" : "Alice");
		sc.close();
	}
	
	static void add(HashSet<String> set, String s) {
		while(s.length()>0) {
			String rev = revTail(s);
			if(set.contains(rev)) {
				set.remove(rev);
				s = s.substring(0, s.length()-1);
			} else {
				break;
			}
			
		}
		set.add(s);
	}
	
	static String revTail(String s) {
		int M = s.length();
		if(M==0)
			return s;
		return s.substring(0, M-1) + (s.charAt(M-1)=='0' ? "1" : "0");
	}
}
