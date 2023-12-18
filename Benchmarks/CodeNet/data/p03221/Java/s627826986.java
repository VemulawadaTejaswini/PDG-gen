import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		PriorityQueue<City> pq = new PriorityQueue<>((p1, p2) -> {
			int nc = Integer.compare(p1.p, p2.p);
			if (nc != 0)
				return nc;
			
			return Long.compare(p1.y, p2.y);
		});
		
		List<City> list = new ArrayList<>(N);
		
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			long y = sc.nextLong();
			
			City c = new City(p, y);
			pq.add(c);
			list.add(c);
		}
		
		int cityNum = pq.peek().p;
		int index = 1;
		while (!pq.isEmpty()) {
			City c = pq.poll();
			if (cityNum != c.p) {
				index = 1;
				cityNum = c.p;
			}
			
			c.ans = String.format("%05d%05d", cityNum, index);
			index++;
		}
		
		for (City c : list) {
			System.out.println(c.ans);
		}
	}
	
	static class City {
		int p;
		long y;
		String ans;
		
		City(int p, long y) {
			this.p = p;
			this.y = y;
		}
	}
}