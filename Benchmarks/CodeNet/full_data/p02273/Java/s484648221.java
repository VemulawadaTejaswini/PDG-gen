
import java.util.Scanner;

// print the koch curve
public class Main {
	public static final double sin60 = Math.sqrt(3)/2.0;
	public static final double cos60 = 0.5;
	static class point{
		public double x;
		public double y;
		
		public point(double _x, double _y){
			x = _x;
			y = _y;
		}
		
		public void display() {
			System.out.println(x+" "+y);
		}
	}
	
	
	
	public static point rotate_60(point o, point t) {
		double d_x = t.x - o.x;
		double d_y = t.y - o.y;
		
		return new point(o.x + (cos60*d_x - sin60*d_y), o.y + (sin60*d_x + cos60*d_y));
	}
	
	public static void koch(point s, point e, int depth) {
		if(depth == 0) {
			s.display();
		}
		point x_1 = new point((2*s.x+e.x)/3.0, (2*s.y+e.y)/3.0);
		point x_2 = new point((s.x+2*e.x)/3.0, (s.y+2*e.y)/3.0);
		point x_mid = rotate_60(x_1, x_2);
		if(depth!=0){
			koch(s,x_1,depth-1);
			koch(x_1, x_mid, depth-1);
			koch(x_mid, x_2, depth-1);
			koch(x_2, e, depth-1);
		}
	}
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		point s = new point(0, 0);
		point e = new point(100,0);

		
		koch(s , e, n);
		e.display();
		cin.close();
	}
}