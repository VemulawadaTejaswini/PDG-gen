import java.util.*;

class City {
	public int no;
	public String id;
	public int pref;
	public long year;

	public City(int no, int pref, long year) {
		this.no = no;
		this.pref = pref;
		this.year = year;
	}
}

class CityComparator implements Comparator<City> {
	@Override
	public int compare(City c1, City c2) {
		if (c1.pref != c2.pref) {
			return c1.pref < c2.pref ? -1 : 1;
		} else {
			return c1.year < c2.year ? -1 : 1;
		}
	}
}

class CityResetComparator implements Comparator<City> {
	@Override
	public int compare(City c1, City c2) {
		return c1.no < c2.no ? -1 : 1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < M; i++) {
			int pref = sc.nextInt();
			long year = sc.nextLong();
			cities.add(new City(i, pref, year));
		}

		// sort
		Collections.sort(cities, new CityComparator());
		int[] prefCnt = new int[N + 1];
		Arrays.fill(prefCnt, 1);

		for (City city : cities) {
			// create identifier id
			city.id = paddingZero(city.pref) + paddingZero(prefCnt[city.pref]);
			prefCnt[city.pref]++;
		}

		// re-sort
		Collections.sort(cities, new CityResetComparator());

		for (City city : cities) {
			System.out.println(city.id);
		}

		sc.close();
	}

	public static String paddingZero(int val) {
		String str = String.valueOf(val);
		String paddingStr = String.format("%6s", str).replace(" ", "0");
    return paddingStr;
	}
}
