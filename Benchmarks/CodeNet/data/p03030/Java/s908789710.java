import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		List<Restaurant> restList;
		int n;

		n = sc.nextInt();
		restList = new ArrayList<>(n);

		String name;
		int point;
		for(int i = 1; i <=n; i++) {
			name = sc.next();
			point = sc.nextInt();
			Restaurant rest = new Restaurant(i, name, point);
			restList.add(rest);
		}


		Map<String, List<Restaurant>> restMap = restList.stream()
		.collect(Collectors.groupingBy(Restaurant::getName));

		restMap.keySet().stream()
		.sorted(Comparator.comparing(data -> data))
		.map(key -> restMap.get(key)
					.stream()
					.sorted(Comparator.comparing((Restaurant data) -> data.getPoint()).reversed())
					.collect(Collectors.toList())

		)
		.forEach(data ->
			{
				for(Restaurant elem : data) {
					System.out.println(elem.id);
				}
			}
			);

		sc.close();

	}

}

class Restaurant{
	int id;
	String name;
	int point;

	public Restaurant(int id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPoint() {
		return point;
	}

}

