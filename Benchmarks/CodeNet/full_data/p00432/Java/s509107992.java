
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, r;
	
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			r = sc.nextInt();
			LinkedList<Rect> rects = new LinkedList<Rect>();
			if( (n|r) == 0 ) break;
			for(int i=0;i<n;i++) {
				int x1 = Integer.parseInt(sc.next());
				int y1 = Integer.parseInt(sc.next());
				int x2 = Integer.parseInt(sc.next());
				int y2 = Integer.parseInt(sc.next());
				LinkedList<Rect> tmp = new LinkedList<Rect>();
				Rect rect = new Rect(x1, y1, x2, y2);
				for(Rect rect2: rects) {
					Rect lap = rect.LappRect(rect2);
					if( (lap.x1|lap.y1|lap.x2|lap.y2) != 0 ) {
						lap.c = rect2.c * -1;
						tmp.add(lap);
					}
				}
				rects.add(rect);
				rects.addAll(tmp);
			}
			if( r==1 ) {
				int area = 0;
				for(Rect rect: rects) {
//					debug(rect.x1, rect.y1, rect.x2, rect.y2, rect.c);
					area += rect.area();
				}
				System.out.println(area);
			}
			else {
				int area = 0;
				int line = 0;
				for(Rect rect: rects) {
//					debug(rect.x1, rect.y1, rect.x2, rect.y2, rect.c);
					area += rect.area();
					line += rect.line();
				}
//				debug("    ");
				System.out.println(area);
				System.out.println(line);
			}
		}
	}
	
	class Rect {
		int x1, y1, x2, y2;
		int c;
		Rect(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			c = 1;
		}
		
		int area() {
			return (x2-x1) * (y2-y1) * c;
		}
		
		int line() {
			return 2 * ( x2-x1 + y2-y1 ) * c;
		}
		
		Rect LappRect(Rect r) {
			int rx1 = max(x1, r.x1);
			int ry1 = max(y1, r.y1);
			int rx2 = min(x2, r.x2);
			int ry2 = min(y2, r.y2);
			
			if( rx1 <= rx2 && ry1 <= ry2 ) {
				return new Rect(rx1, ry1, rx2, ry2);
			}
			return new Rect(0, 0, 0, 0);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}