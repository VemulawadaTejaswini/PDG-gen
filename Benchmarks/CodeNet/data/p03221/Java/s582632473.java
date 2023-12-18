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
		Map<String, List<Integer>> cityRelation = new HashMap<>();
		for (int i = 0; i < CITY; i++) {
			String pro = String.format("%06d", sc.nextInt());
			int city = sc.nextInt();
			City c = new City(pro, city);
			input.add(c);
			
			List<Integer> cityLst = cityRelation.get(pro);
			if (null == cityLst) {
				cityLst = new LinkedList<>();
			}
			cityLst.add(city);
			cityRelation.put(pro, cityLst);
		}
		sc.close();
		genCityIndex(input, cityRelation);
	}

	private static void genCityIndex(List<City> input,
			Map<String, List<Integer>> cityRelation) {

		for (Entry<String, List<Integer>> entry : cityRelation.entrySet()) {
			ArrayList<Integer> list = new ArrayList<>(entry.getValue());
			Collections.sort(list);
			cityRelation.put(entry.getKey(), list);
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

	public City(String provID, int city) {
		this.provID = provID;
		this.city = city;
	}

	public String getProvID() {
		return provID;
	}

	public int getCity() {
		return city;
	}

}