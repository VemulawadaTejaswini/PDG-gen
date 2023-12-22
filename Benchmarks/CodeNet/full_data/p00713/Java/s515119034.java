import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class point {
		double x;
		double y;

		point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		point[] getP(point tar) {
			double nx = tar.x + x;
			double ny = tar.y + y;
			nx /= 2;
			ny /= 2;
			point np = new point(nx, ny);
			double v = np.d2(this);
			if (v > 1) {
				return null;
			}
			double dx = tar.y - y;
			double dy = x - tar.x;

			double len = dx * dx + dy * dy;
			len = Math.sqrt(len);

			dx /= len;
			dy /= len;

			point[] ret = new point[2];

			ret[0] = new point(np.x + dx * Math.sqrt(1 - v), np.y + dy
					* Math.sqrt(1 - v));
			ret[1] = new point(np.x - dx * Math.sqrt(1 - v), np.y - dy
					* Math.sqrt(1 - v));
			return ret;
		}

		double d2(point tar) {
			return (tar.x - x) * (tar.x - x) + (tar.y - y) * (tar.y - y);
		}
		boolean near(point tar){
			return d2(tar) < 1;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			point p[] = new point[n];

			
			for(int i= 0; i <n ;i++){
				p[i] = new point(sc.nextDouble(),sc.nextDouble());
			}
			
			int ans = 1;
			for(int i = 0; i < n; i ++){
				for(int j =i+1 ; j < n ; j++){
					point np[] = p[i].getP(p[j]);
					if(np == null){
						continue;
					}
					for(point c : np){
						int a = 2;
						for(int z = 0; z < n ; z++){
							if(z == i || z==j){
//								System.out.println(c.d2(p[z]));
								continue;
							}
							if(c.near(p[z])){
								a++;
							}
						}
						ans = Math.max(a,ans);
					}
				}
			}
			System.out.println(ans);
			
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}