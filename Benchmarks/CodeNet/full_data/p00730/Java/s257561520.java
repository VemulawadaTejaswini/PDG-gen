
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			if( (n|w|h) == 0) break;
			
			LinkedList<Rect> rects = new LinkedList<Rect>();
			rects.add(new Rect(w, h));
			for(int i=0;i<n;i++) {
				int p = sc.nextInt()-1;
				int s = sc.nextInt();
				Rect rect = rects.remove(p);
//				debug(rect.w, rect.h, s);
				Rect[] next = rect.cut(s);
				for(Rect tmp: next) rects.addLast(tmp);
			}
			int[] area = new int[n+1];
			for(int i=0;i<n+1;i++) {
				Rect tmp = rects.removeFirst();
				area[i] = tmp.w * tmp.h;
			}
			sort(area);
			System.out.print(area[0]);
			for(int i=1;i<n+1;i++) {
				System.out.print(" " + area[i]);
			}
			System.out.println();
		}
	}
	
	class Rect {
		int w, h;
		Rect(int w, int h) {
			this.w = w;
			this.h = h;
		}
		
		Rect[] cut(int s) {
			Rect[] rects = new Rect[2];
			s = s % (w+h);
			if(s < w) {
				rects[0] = new Rect(s, h);
				rects[1] = new Rect(w-s, h);
			}
			else {
				rects[0] = new Rect(w, s-w);
				rects[1] = new Rect(w, h-(s-w));
			}
			if( rects[0].w * rects[0].h > rects[1].w * rects[1].h ) {
				Rect tmp = new Rect(rects[0].w, rects[0].h);
				rects[0].w = rects[1].w; rects[0].h = rects[1].h;
				rects[1].w = tmp.w; rects[1].h = tmp.h;
			}
			return rects;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}