import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		City[] cities = new City[n];
		for (int i = 0; i < n; i++) {
		    cities[i] = new City(i, sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(cities, new Comparator<City>() {
		    public int compare(City c1, City c2) {
		        if (c1.pref == c2.pref) {
		            return c1.year - c2.year;
		        } else {
		            return c1.pref - c2.pref;
		        }
		    }
		});
		int prev = 0;
		int num = 1;
		for (City c : cities) {
		    if (prev != c.pref) {
		        num = 1;
		        prev = c.pref;
		    } else {
		        num++;
		    }
		    c.num = num;
		}
		Arrays.sort(cities, new Comparator<City>() {
		    public int compare(City c1, City c2) {
		        return c1.idx - c2.idx;
		    }
		});
		StringBuilder sb = new StringBuilder();
		for (City c : cities) {
		    sb.append(c).append("\n");
		}
		System.out.print(sb);
	}
	
	static class City {
	    int idx;
	    int pref;
	    int year;
	    int num;
	    public City (int idx, int pref, int year) {
	        this.idx = idx;
	        this.pref = pref;
	        this.year = year;
	    }
	    
	    public String toString() {
	        return String.format("%06d", pref) + String.format("%06d", num);
	    }
	}
}
