import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Restaurant> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String city = sc.next();
			int score = Integer.parseInt(sc.next());
			list.add(new Restaurant(city, score, i + 1));
		}
		Collections.sort(list);
		list.stream().forEach(System.out::println);
	}
}

class Restaurant implements Comparable<Restaurant> {
	String city;
	int score;
	int index;

	public Restaurant(String city, int score, int index) {
		this.city = city;
		this.score = score;
		this.index = index;
	}

	@Override
	public String toString() {
		return Integer.toString(index);
	}

	@Override
	public int compareTo(Restaurant o) {

		int i = this.city.compareTo(o.city);
		if (i == 0)
			i = o.score - this.score;
		return i;
	}

}
