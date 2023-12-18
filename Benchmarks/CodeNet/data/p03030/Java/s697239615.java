

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Restaurant implements Comparable<Restaurant> {
	String city;
	int point;
	int i;

	public Restaurant(String city, int point, int i) {
		this.city = city;
		this.point = point;
		this.i = i;
	}

	public int compareTo(Restaurant other) {
		int ans = city.compareTo(other.city);
		if (ans != 0)
			return ans;
		return Integer.compare(other.point, point);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Restaurant> list = new ArrayList<Restaurant>();
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			String city = sc.next();
			int point = sc.nextInt();
			list.add(new Restaurant(city, point, i));
		}

		Collections.sort(list);

		for (Restaurant restaulant : list) {
			System.out.println(restaulant.i);
		}
	}
}