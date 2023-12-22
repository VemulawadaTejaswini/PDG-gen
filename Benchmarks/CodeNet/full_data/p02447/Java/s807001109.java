
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Point {
	int x;
	int y;
	Point(int a,int b){
		x = a;
		y = b;
	}
}

class MyComparator implements Comparator<Point> {
	public int compare(Point p1,Point p2) {
		if(p1.x > p2.x) {
			return 1;
		}else if(p1.x == p2.x && p1.y > p2.y) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Point> L = new ArrayList<>();
		
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			Point p = new Point(a,b);
			L.add(p);
			
		}
		Collections.sort(L,new MyComparator());
		
		for(int i=0;i<L.size();i++) {
			System.out.println(L.get(i).x + " " + L.get(i).y);
		}
	}
}
