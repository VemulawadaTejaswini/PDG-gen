import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			long d = sc.nextLong();
			long a = sc.nextLong();

			List<Monster> monsters = new ArrayList<Monster>();
			//			PriorityQueue<Monster> pq = new PriorityQueue<>(n, new Comparator<Monster>() {
			//				@Override
			//				public int compare(Monster o1, Monster o2) {
			//					return Long.compare(o1.x, o2.x);
			//				}
			//				
			//			});

			for(int i = 0 ; i < n ; i++ ) {
				Monster m = new Monster();
				m.x = sc.nextLong();
				m.h = sc.nextLong();
				monsters.add(m);
				//				pq.add(m);
			}

			//			while(pq.size() > 0 ) {
			//				Monster target = pq.poll();
			//				
			//				long range = target.x + 2*a;
			//				while ( pq.peek() )
			//			}

			//			// sort by x axis
			//			Collections.sort(monsters,new Comparator<Monster>() {
			//				@Override
			//				public int compare(Monster o1, Monster o2) {
			//					return Long.compare(o1.x, o2.x);
			//				}
			//				
			//			});
			//			
			//monsters.stream().forEach(m -> System.out.println(m.x));
			int totalCount = 0;

			// start from m.x + d point and use bomb until m is dead
			while(monsters.size() > 0 ) {
				
				if ( monsters.get(0).h <= 0 ) {
					monsters.remove(0);
					continue;
				}
				
				long count = monsters.get(0).h / a + (monsters.get(0).h % a == 0 ? 0 : 1);
				

				//reduce count * a from ranged monsters
				long p = monsters.get(0).x + 2 * d;
				int j = 0;
				while(j < monsters.size()) {
					if ( monsters.get(j).x <= p ) {
						monsters.get(j).h -= count * a;
						j++;
					}
					else {
						break;
					}
				}
				
				totalCount += count;

			}
			
			System.out.println(totalCount);
		}

	}

	private static class Monster {
		public long x;
		public long h;
	}
}