import java.util.*;

public class Main {
	
	static class Drinks implements Comparable<Drinks>{
		long cost, drinks;
		public Drinks (long c, long d) {
			cost = c;
			drinks = d;
		}
		@Override
		public int compareTo(Drinks o) {
			// TODO Auto-generated method stub
			return (int) (cost - o.cost);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt(), M = sc.nextInt(), cost = 0;
		PriorityQueue<Drinks> q = new PriorityQueue<Drinks>();
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			q.add(new Drinks(a, b));
		}
		for (int i = 0; i < N; i++) {
			Drinks p = q.poll();
			long c = p.cost, d = p.drinks;
			if (M - d < 0) {
				cost += c*M;
				M = 0;
			}
			else {
				cost += c*d;
				M -= d;
			}
			if (M == 0) break;
		}
		System.out.println(cost);
	}

}