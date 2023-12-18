import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static int  PRE,CITY ;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		PRE = sc.nextInt();
		CITY = sc.nextInt();
		List<City> input = new ArrayList<>(CITY);
		for (int i = 0; i < CITY; i++) {
			City c = new City(sc.nextInt(), sc.nextInt());
			input.add(c);
		}
		sc.close();
		genCityIndex(input);
	}

	private static void genCityIndex(List<City> input) {
		Map<String, List<Integer>> cityRelation = new HashMap<>();
		for (City city : input) {
			String pro = city.getProvID();
			List<Integer> cityLst = cityRelation.get(pro);
			if (null == cityLst) {
				cityLst = new LinkedList<>();
			}
			cityLst.add(city.getCity());
			cityRelation.put(pro, cityLst);
		}

		for (Entry<String, List<Integer>> entry : cityRelation.entrySet()) {
			String pro = entry.getKey();
			ArrayList<Integer> list = new ArrayList<>(entry.getValue());
			Collections.sort(list);
			cityRelation.put(pro, list);
		}

		for (City city : input) {
			String pro = city.getProvID();
			int cityIndex = Collections.binarySearch(cityRelation.get(pro),
					city.getCity());
			System.out.println(pro + String.format("%06d", cityIndex + 1));
		}

	}

}

class City {

	private String provID;
	private int city;

	public City(Integer provID, int city) {
		this.provID = String.format("%06d", provID);
		this.city = city;
	}

	public String getProvID() {
		return provID;
	}

	public int getCity() {
		return city;
	}

}