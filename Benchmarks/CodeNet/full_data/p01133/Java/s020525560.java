import java.util.*;
import java.awt.geom.Point2D;

public class Main {
	static int n;
	static Point2D d;
	static HashMap<Point2D,Boolean> c;

	static boolean dfs(Point2D p,double sum,int time){
		//if(sum >= d.distance(p)) return false;
		if(time == n) return true;
		
		for(Point2D pp : c.keySet()){
			if(c.get(pp)) continue;
			if(sum+p.distance(pp) >= d.distance(pp)) return false;
		}
		c.put(p, true);
		for(Point2D pp : c.keySet()){
			if(c.get(pp)) continue;
			if(dfs(pp,sum+p.distance(pp),time+1)) return true;
		}
		c.put(p, false);
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			Point2D h = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			d = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			if(n == 0) break;

			c = new HashMap<Point2D,Boolean>();
			c.put(h, false);
			for(int i=0;i<n;i++){
				c.put(new Point2D.Double(sc.nextDouble(),sc.nextDouble()), false);
			}
		
			System.out.println(dfs(h,0,0) ? "YES" : "NO");
		}
	}
}