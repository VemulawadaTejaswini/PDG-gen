import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main pc = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Integer,List<City>> map = new HashMap<>();
		for(int i=0;i<m;i++) {
			int p = in.nextInt();
			int y = in.nextInt();
			if(map.containsKey(p)) {
				map.get(p).add(pc.new City(p,y,i));
			}else {
				List<City> list = new ArrayList<>();
				list.add(pc.new City(p,y,i));
				map.put(p, list);
			}
		}
		
		List<City> allCities = new ArrayList<>();
		
		for(int p : map.keySet()) {
			List<City> list = map.get(p);
			list.sort((c1,c2)->c1.year-c2.year);
			for(int i=0;i<list.size();i++) {
				City city = list.get(i);
				city.cityNumber = get6digit(p) + get6digit(i+1);
				allCities.add(city);
			}
		}
		
		allCities.sort((c1,c2)->c1.number-c2.number);
		
		for(City city : allCities) {
			System.out.println(city.cityNumber);
		}
		in.close();
		

	}
	
	public static String get6digit(int x) {
		String ret = "";
		for(int i=0;i<6;i++) {
			ret = x%10 + ret;
			x /= 10;
		}
		return ret;
		
	}
	
	class City {
		public int prefecture;
		public int year;
		public int number;
		public String cityNumber;
		
		public City(int p,int y,int num) {
			this.prefecture = p;
			this.year = y;
			this.number = num;
		}
	}

}


