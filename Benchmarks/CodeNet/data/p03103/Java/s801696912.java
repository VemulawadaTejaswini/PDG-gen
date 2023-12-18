import java.util.*;

public class Main {

	public static Drink [] drinks;

	public static class Drink implements Comparable<Drink>{
		long cost;
		long drinks;
		double cperd;

		public Drink(){

		}

		public Drink(long cost_, long drinks_){
			cost = cost_;
			drinks = drinks_;
		}

		@Override
		public int compareTo(Drink o) {
			// TODO Auto-generated method stub
			return (int)(this.cost - o.cost);
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		long total = 0;
		PriorityQueue <Drink> q = new PriorityQueue<Drink>();
		for(long i = 0 ;i<N; i++) {
			q.add(new Drink(sc.nextInt(),sc.nextInt()));
		}

		while(M > 0) {
			Drink cur = q.poll();
			if(M>cur.drinks) {
				total += cur.drinks*cur.cost;
				M -= cur.drinks;
			}
			else{
				total += M*cur.cost;
				M = 0;
			}

		}
		System.out.println(total);

	}

}