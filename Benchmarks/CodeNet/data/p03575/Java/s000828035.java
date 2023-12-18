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
			int one = s.nextInt();
			c[one-1]++;
			int two = s.nextInt();
			c[two-1]++;
			m[one-1][two-1] = 1;
			m[two-1][one-1] = 1;
			pp[x] = new Point(one-1, two-1);
		}
		
		int count = 0;
		for(Point p : pp) {
			int x = p.x;
			int y = p.y;
			//System.out.println(x+" "+y);
			
			boolean bridge = false;
			if(c[x]==1 || c[y]==1)
				bridge = true;
			if(c[x] ==2 && !bridge)
				bridge = checkString(new Point(x,findNext(y,x)),1);
			if (c[y] ==2 && !bridge)
				bridge = checkString(new Point(y,findNext(x,y)),1);
			
			if(bridge)
				count++;
		}
		
		System.out.println(count);
	}
	
	public static int findNext(int prev, int cur) {
		for(int x=0;x<m.length;x++)
			if(m[cur][x]==1 && prev!=x)
				return x;
			
		return -1;
	}
	
	public static boolean checkString(Point p, int dep) {
		//System.out.println(" "+p.x+" "+p.y);
		int next = p.y;
		if(c[next]==1) {
		//	System.out.println("  o");
			return true;
		}
		if(c[next]>=3 || dep > m.length) {
		//	System.out.println("  x");
			return false;
		}
		int y = findNext(p.x, next);
			
		return checkString(new Point(next, y), dep+1);
	}
}