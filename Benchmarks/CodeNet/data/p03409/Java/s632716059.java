

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		LinkedList<Coordinate> list = new LinkedList<>();
		int x = 0;
		int y = 0;
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			list.add(new Coordinate(x, y, "red"));
		}
		
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			list.add(new Coordinate(x, y, "blue"));
		}
		scanner.close();
		Collections.sort(list, new CoordinateConparator());
		
		
		Set<Coordinate> set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			Coordinate c = list.get(i);

			if (c.color.equals("red")) {
				set.add(c);
				
			}else {
				int maxy = 0;
				Coordinate removeCoordinate = null;
				for (Coordinate cy : set) {
					if (c.y > cy.y && cy.color.equals("red")) {
						if (maxy <= cy.y) {
							maxy = cy.y;
							removeCoordinate = cy;
							
						}
					}
				}
			
				set.remove(removeCoordinate);	
			}
		}
		System.out.println(n - set.size());
	}
	
}

class Coordinate {
	int x;
	int y;
	String color;
	public Coordinate(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
}

class CoordinateConparator implements Comparator<Coordinate> {
	
	@Override
	public int compare(Coordinate c1, Coordinate c2) {
		return c1.x < c2.x ? -1 : 1;
	}
}
