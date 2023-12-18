import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int PRE = sc.nextInt();
		int CITY = sc.nextInt();
		List<City> input = new ArrayList<>(CITY);
		
		City c = new City();
		for (int i = 0; i < CITY; i++) {
			City clone = (City) c.clone();
			clone.setProvID(String.format("%06d", sc.nextInt()));
			clone.setCity(sc.nextInt());
			input.add(clone);
		}
		sc.close();
		genCityIndex(input);
	}

	private static void genCityIndex(List<City> input) {
		Map<String, List<Integer>> cityRelation = new HashMap<>();
		for(City city : input){
			String pro = city.getProvID();
			List<Integer> cityLst = cityRelation.get(pro);
			if (null == cityLst) {
				cityLst = new LinkedList<>();
			}
			cityLst.add(city.getCity());
			cityRelation.put(pro, cityLst);
		}

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

class City implements Cloneable {

	private String provID;
	private int city;

	public City() {
	}

	public void setProvID(String provID) {
		this.provID = provID;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getProvID() {
		return provID;
	}

	public int getCity() {
		return city;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (City) super.clone();
	}
}
