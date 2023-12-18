import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			Map<String, Entry> map = new HashMap<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				String s = sc.next();

				if (map.containsKey(s)) {
					map.get(s).count++;
				}
				else {
					Entry entry = new Entry(s);
					entry.count++;
					map.put(s, entry);
				}
			}
			
			PriorityQueue<Entry> pq = new PriorityQueue<>(
					new Comparator<Entry>() {
						@Override
						public int compare(Entry o1, Entry o2) {
							if ( Integer.compare(o1.count, o2.count) == 0 ) {
								return o1.s.compareTo(o2.s);
							}
							else {
								return -1 *  Integer.compare(o1.count, o2.count);
							}
						}
						
					}
			);
			
			for(Entry entry : map.values()) {
				pq.add(entry);
			}
			
			int maxValue = pq.peek().count;
			while(true) {
				Entry e = pq.poll();
								
				if ( e != null && e.count == maxValue ) {
					System.out.println(e.s);
				}
				else {
					return;
				}
			}
		}
	}
	
	private static class Entry {
		
		public Entry(String s) {
			this.s = s;
		}
		public int count;
		public String s;
	}
}