import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Item implements Comparable<Item> {
	int x;
	int y;
	
	public Item(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Item o) {
		int res = Integer.compare(x, o.x);
		if (res == 0) {
			res = Integer.compare(y, o.y);
		}
		return res;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Item> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Item(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).x + " " + list.get(i).y);
		}
	}
}

