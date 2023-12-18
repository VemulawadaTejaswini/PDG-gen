import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Restaurant{
		public Restaurant(int id, String name, int score) {
			this.id = id;
			this.name = name;
			this.score = score;
		}
		int id;
		String name;
		int score;
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			List<Restaurant> restaurants = new ArrayList<>();
			for(int i = 0; i < N; i++) {
				restaurants.add(new Restaurant(i + 1, sc.next(), sc.nextInt()));
			}
			Collections.sort(restaurants, (l, r) -> {
				int c = l.name.compareTo(r.name);
				if(c != 0) return c;
				return r.score - l.score;
			});
			restaurants.forEach(r -> System.out.println(r.id));
		}
	}
}
