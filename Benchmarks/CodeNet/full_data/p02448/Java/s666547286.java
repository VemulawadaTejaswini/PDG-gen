import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Item implements Comparable<Item> {
	int price;
	int weight;
	char type;
	long day;
	String name;
	
	public Item(int price, int weight, char type, long day, String name) {
		this.price = price;
		this.weight = weight;
		this.type = type;
		this.day = day;
		this.name = name;
	}
	
	@Override
	public int compareTo(Item o) {
		int res = Integer.compare(price, o.price);
		if (res == 0) {
			res = Integer.compare(weight, o.weight);
			if (res == 0) {
				res = Character.compare(type, o.type);
				if (res == 0) {
					res = Long.compare(day, o.day);
					if (res == 0) {
						res = name.compareTo(o.name);
					}
				}
			}
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
			list.add(new Item(sc.nextInt(), sc.nextInt(), sc.next().charAt(0), sc.nextLong(), sc.next()));
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).price + " " + list.get(i).weight + " " + list.get(i).type + " " + list.get(i).day + " " + list.get(i).name);
		}
	}
}

