import java.util.*;

class Restaurant {
	public int index;
	public String city;
	public int point;

	public Restaurant(int index, String city, int point) {
		this.index = index;
		this.city = city;
		this.point = point;
	}
}

class CityComparator implements Comparator<Restaurant> {
	@Override
	public int compare(Restaurant r1, Restaurant r2) {
		if (!r1.city.equals(r2.city)) {
			return r1.city.compareTo(r2.city);
		} else {
			return r1.point > r2.point ? -1 : 1;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		for (int i = 0; i < N; i++) {
			restaurants.add(new Restaurant(i + 1, sc.next(), sc.nextInt()));
		}
		sc.close();

		// sort
		Collections.sort(restaurants, new CityComparator());

		restaurants.forEach(r -> {
			System.out.println(r.index);
		});
	}
}
