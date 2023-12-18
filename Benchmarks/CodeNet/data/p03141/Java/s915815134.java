import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private class Dish implements Comparable<Dish> {
		public long A;
		public long B;
		
		public Dish(long A, long B) {
			this.A = A;
			this.B = B;
		}
		
		@Override
		public int compareTo(Dish o) {
			if (this.A + this.B > o.A + o.B) {
				return 1;
			} else if (this.A + this.B == o.A + o.B) {
				if (this.A > o.A) {
					return 1;
				}
				return 0;
			} else {
				return -1;
			}
		}
		
	}
	
	public long solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		Dish[] dish = new Dish[N];
		
		for (int i=0; i<N; i++) {
			long Ai = in.nextLong();
			long Bi = in.nextLong();
			
			dish[i] = new Dish(Ai, Bi);
		}
		in.close();
		
		Arrays.sort(dish);
		
		long score = 0;
		
		for (int i=0; i<N; i++) {
			if (i%2 == 0) {
				score += dish[N-i-1].A;
			} else {
				score -= dish[N-i-1].B;
			}
		}
		
		return score;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		long result = main.solve();
		
		System.out.println(result);
	}
}
