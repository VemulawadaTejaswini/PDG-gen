import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    list.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		double all = 0;
		for (int i = 0; i < n; i++) {
		    Point p = list.remove(i);
		    all += getLength(p, list);
		    list.add(i, p);
		}
		System.out.println(all / kaijo(n));
	}
	
	static double getLength(Point base, ArrayList<Point> list) {
	    if (list.size() == 0) {
	        return 0;
	    }
	    double ans = 0;
	    for (int i = 0; i < list.size(); i++) {
	        Point p = list.remove(i);
	        ans += p.getLength(base) * kaijo(list.size());
	        ans += getLength(p, list);
	        list.add(i, p);
	    }
	    return ans;
	}
	
	static int kaijo(int x) {
	    if (x <= 1) {
	        return 1;
	    } else {
	        return x * kaijo(x - 1);
	    }
	}
	
	static class Point {
	    int x;
	    int y;
	    
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    
	    public double getLength(Point another) {
	        return Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));
	    }
	    
	    public String toString() {
	        return "x:" + x + " y:" + y;
	    }
	}
}
