import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		City[] cities = new City[m];
		for (int i = 0; i < m; i++) {
			cities[i] = new City(sc.nextInt(), i, sc.nextInt());
		}
		Arrays.sort(cities, new Comparator<City>() {
		public int compare(City c1, City c2) {
			if (c1.getP() != c2.getP()) {
				return c1.getP() - c2.getP();
			} else {
				return c1.getYear() - c2.getYear();
			}
		}
		});
		int idx = 0;
		City previous = null;
		for (City c : cities) {
			if (previous == null || previous.getP() != c.getP()){
				idx = 0;
				idx++;
				c.setNo(idx);
				previous = c;
			} else {
				idx++;
				c.setNo(idx);
			}
		}
		Arrays.sort(cities, new Comparator<City>() {
		public int compare(City c1, City c2) {
			return c1.getId() - c2.getId();
		}
		});
		for (City c : cities) {
			System.out.println(c);
		}
		
	}
	
	public static class City {
		private int p;
		private int id;
		private int year;
		private int no;
		
		public City(int p, int id, int year) {
			this.p = p;
			this.id = id;
			this.year = year;
		}
		
		public int getYear() { 
			return year;
		}
		
		public int getP() {
			return p;
		}
		
		public int getId() {
			return id;
		}
		
		public void setNo(int no) {
			this.no = no;
		}
		
		public String toString(){
			return String.format("%06d", p) + String.format("%06d", no);
		}
	}
	
	
}