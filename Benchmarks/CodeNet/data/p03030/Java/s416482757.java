import java.util.*;
 
class Restaurant implements Comparable<Restaurant> {
	String direc;
	int num;
	int i;
	
	public Restaurant(String direc, int num, int i) {
		this.direc = direc;
		this.num = num;
		this.i = i;
	}
 
	public int compareTo(Restaurant other) {
		int ans = direc.compareTo(other.direc);
		if (ans != 0)
			return ans;
		return Integer.compare(other.num, num);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Restaurant> list = new ArrayList<Restaurant>();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String direc = sc.next();
			int num = sc.nextInt();
			list.add(new Restaurant(direc, num, i));
		}
		Collections.sort(list);
		for (Restaurant restaulant : list) {
			System.out.println(restaulant.i);
		}
	}
}