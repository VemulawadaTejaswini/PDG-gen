import java.util.*;
public class Main {
	public static class City{
		private int pref;
		private int year;
		private int num;
		private String No;
		
		public City(int p, int y, int n) {
			this.pref = p;
			this.year = y;
			this.num = n;
		}
		
		public int getPref() {
			return pref;
		}
		public int getYear() {
			return year;
		}
		public int getNum() {
			return num;
		}
		public String getNo() {
			return No;
		}
		public void setNo(String No) {
			this.No = No;
		}
	}
	
	public static class Comp1 implements Comparator<City> {
	    public int compare(City x1, City x2) {
	        if(x1.getPref() < x2.getPref()) {
	            return -1;
	        } 
	        else if(x1.getPref() > x2.getPref()){
	            return 1;
	        } 
	        else{
	        	if(x1.getYear() < x2.getYear()) {
	        		return -1;
	        	}
	        	else if(x1.getYear() > x2.getYear()) {
	        		return 1;
	        	}
	        	else {
	        		return 0;
	        	}
	        }
	    }
	}
	
	public static class Comp2 implements Comparator<City> {
	    public int compare(City x1, City x2) {
	        if(x1.getNum() < x2.getNum()) {
	            return -1;
	        } 
	        else{
	            return 1;
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		ArrayList <City> cities = new ArrayList<City>();
		for(int i = 0; i < M; i++) {
			int P = stdIn.nextInt();
			int Y = stdIn.nextInt();
			City city = new City(P, Y, i);
			cities.add(city);
		}
		Collections.sort(cities, new Comp1());
		String str = String.format("%012d", cities.get(0).getPref()*1000000+1);
		cities.get(0).setNo(str);
		int index = 2;
		for(int i = 1; i < M; i++) {
			if(cities.get(i-1).getPref() != cities.get(i).getPref()) {
				index = 1;
			}
			str = String.format("%012d", cities.get(i).getPref()*1000000+index);
			cities.get(i).setNo(str);
			index++;
		}
		Collections.sort(cities, new Comp2());
		for(City c:cities) {
			System.out.println(c.getNo());
		}

	}

}