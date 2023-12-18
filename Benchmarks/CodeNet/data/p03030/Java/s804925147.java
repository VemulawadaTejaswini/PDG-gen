import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer size = sc.nextInt();
		ArrayList<Restaurant> list = new ArrayList<Restaurant>();
		Integer count = 0;

		while (count < size) {
			count += 1;
			String city = sc.next();
			int score = sc.nextInt();
			Restaurant res = new Main().new Restaurant(city, score ,count);
			list.add(res);
		}

		Comparator<Restaurant> comparator =
				  Comparator.comparing(Restaurant::getCity).thenComparing(Comparator.comparing(Restaurant::getScore).reversed());

		list.stream().sorted(comparator).forEach(a -> System.out.println(a.getId()));

	}

	public class Restaurant {
		private int id;
		private String city;
		private int score;

		Restaurant(String city, int score, int id){
			this.id = id;
			this.city = city;
			this.score = score;
		}

		public int getId() {return id;}
		public String getCity() { return city;}
		public int getScore() {return score;}
	}

}