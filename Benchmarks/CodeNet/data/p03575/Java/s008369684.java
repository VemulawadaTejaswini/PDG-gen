import java.util.*;
import java.awt.Point;

public class Main{
	public static int[] c;
	public static int[][] m;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int v = s.nextInt();
		
		c = new int[n];
		m = new int[n][n];
		Point[] pp = new Point[v];
		for(int x=0;x<v;x++) {
			int one = s.nextInt()-1;
			int two = s.nextInt()-1;
			m[one][c[one]] = two;
			m[two][c[two]] = one;
			pp[x] = new Point(one, two);
			c[one]++;
			c[two]++;
		}
		
		int count = 0;
		for(Point p : pp) {
			int x = p.x;
			int y = p.y;
			
			boolean bridge = false;
			if(c[x]==1 || c[y]==1)
				bridge = true;
			else {
				Set<Integer> side = new HashSet<Integer>();
				side.add(p.y);
				pop(p, side);
				side.remove(p.y);
				Set<Integer> temp = new HashSet<Integer>();
				bridge = pop(p.y, p.x, side, temp);
			}
			
			
			if(bridge)
				count++;
		}
		
		System.out.println(count);
	}
	
	public static void pop(Point p, Set<Integer> set) {
		set.add(p.x);
		for(int x=0;x<c[p.x];x++) {
			int y = m[p.x][x];
			if(!set.contains(y) && y!=p.y)
				pop(new Point(y, p.x), set);
		}
	}
	
	public static boolean pop(int px, int prev, Set<Integer> set, Set<Integer> side) {
		side.add(px);
		for(int x=0;x<c[px];x++) {
			int y = m[px][x];
			if(set.contains(y) && y!=prev)
				return false;
			if(!side.contains(y) && y!=prev)
				pop(y, px, set, side);
		}
		
		return true;
	}
}