
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] x, y;
	int cx, cy, r;
	
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			x = new int[3];
			y = new int[3];
			x[0] = sc.nextInt();
			y[0] = sc.nextInt();
			if( (x[0]|y[0]) == 0 ) break;
			
			for(int i=1;i<3;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			cx = sc.nextInt();
			cy = sc.nextInt();
			r = sc.nextInt();
			
			if(inCir()) System.out.println("b");
			else {
				boolean a = inTri();
				boolean b = closs();
				if( a&(!b) ) System.out.println("a");
				else if(b) System.out.println("c");
				else System.out.println("d");
			}
		}
	}
	
	boolean inCir() {
		for(int i=0;i<3;i++) if( (cx-x[i])*(cx-x[i])+(cy-y[i])*(cy-y[i]) > r*r )
			return false;

		return true;
	}
	
	boolean inTri(){
		for(int i=0;i<3;i++) {
			if (clossLine(new int[]{x[i],x[(i+1)%3]}, new int[]{y[i],y[(i+1)%3]},
					  new int[]{cx,x[(i+2)%3]}, new int[]{cy,y[(i+2)%3]}) )
					  return false;
		}
		return true;
	}
	
	boolean clossLine(int[] x1, int[] y1, int[] x2, int[] y2) {
		boolean a = (y2[0]-y1[0])*(x1[1]-x1[0]) > (y1[1]-y1[0])*(x2[0]-x1[0]) 
				^	(y2[1]-y1[0])*(x1[1]-x1[0]) > (y1[1]-y1[0])*(x2[1]-x1[0]);
		boolean b = (y1[0]-y2[0])*(x2[1]-x2[0]) > (y2[1]-y2[0])*(x1[0]-x2[0]) 
				^	(y1[1]-y2[0])*(x2[1]-x2[0]) > (y2[1]-y2[0])*(x1[1]-x2[0]); 
		return a&b;
	}
	
	boolean closs() {
		for(int i=0;i<3;i++) {
			int dx = x[(i+1)%3] - x[i];
			int dy = y[(i+1)%3] - y[i];
			int px = cx-x[i];
			int py = cy-y[i];
			if( (dx*py - dy*px) * (dx*py - dy*px) < r*r*( dx*dx+dy*dy ) )
				return true;
		}
		return false;
	}
	
	double triArea(double a, double b, int c) {
		double s = (a+b+c)/2;
		return s*(s-a)*(s-b)*(s-c);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}