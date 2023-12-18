import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int areaNum = sc.nextInt();
		int cityNum = sc.nextInt();
		
		List<Set<City>> l = new ArrayList<Set<City>>();
		
		for(int i = 0; i < areaNum; i++) {
			l.add(new TreeSet<City>(new Comparator<City>(){  
				 public int compare(City c1, City c2) {           
				        return c1.getTime()-c2.getTime();//降序排列  
				    } 
			}));
		}
		
		for(int i = 0; i < cityNum; i++) {
			int area = sc.nextInt();
			int time = sc.nextInt();
			l.get(area-1).add(new City(area-1, time, i));
		}
		
		Set<City> result = new TreeSet<City>(new Comparator<City>(){  
			 public int compare(City c1, City c2) {           
			        return c1.getOrder()-c2.getOrder();//降序排列  
			    } 
		});
		
		for(int i = 0; i < areaNum; i++){
			int j = 1;
//			if(l.get(i).size())
			for(Object c : l.get(i)){
				City c1 = (City)c;
				c1.setCode(formatNum(c1.getArea()+1, j));
				j++;
				result.add(c1);
			}
		}
		
		for(City c : result) {
			System.out.println(c.getCode());
		}
		
	}
	
	 
	
	private static String formatNum(int area, int order){
		String areaC = String.format("%06d", area);
		String timeC = String.format("%06d", order);
		return areaC+timeC;
	}
	
	static class City {
		private int time;
		private int area;
		private int order;
		private String code;
		public City( int area, int time, int order) {
			super();
			this.time = time;
			this.area = area;
			this.order = order;
		}
		
		
		
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		public int getArea() {
			return area;
		}
		public void setArea(int area) {
			this.area = area;
		}
		public int getOrder() {
			return order;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		
	}
}