import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map <Integer,List<City>> mapList= new HashMap<Integer,List<City>>();
		Main main = new Main();
		for (int i=0;i<M;i++) {
			City c = main.new City();
			c.ken = sc.nextInt();;
			c.birth = sc.nextInt();
			c.num = i;
			List<City> cityList;
			if (mapList.containsKey(c.ken)==false) {
				cityList = new ArrayList<City>();
				mapList.put(c.ken, cityList);
			} else {
				cityList = mapList.get(c.ken);
			}
			cityList.add(c);
		}
		Set<Integer> set = mapList.keySet();
		Map <Integer,String> map= new HashMap<Integer,String>();
		for (Integer in:set) {
			List<City> city = mapList.get(in);
			Collections.sort(city);
			int count =1;
			for (int i=0;i<city.size();i++) {
				StringBuffer sb = new StringBuffer();
				sb.append(String.format("%06d", in));
				sb.append(String.format("%06d", count));
				count ++;
				map.put(city.get(i).num, sb.toString());
			}
		}

		Object[] num = map.keySet().toArray();
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.println(map.get(num[i]));
		}
	}

	public class City implements Comparable<City> {
		int ken ;
		int birth;
		int num;
		@Override
		public int compareTo(City o) {
			if (this.birth < o.birth) {
				return -1;
			}
			if (this.birth > o.birth) {
				return 1;
			}
			return 0;
		}

	}
}