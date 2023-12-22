import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P {
		Double x;
		Double y;

		P() {
		}

		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}

		double dot(P p1) {
			return p1.x * this.x + p1.y * this.y;
		}

		double vec(P p) {
			return this.x * p.y - this.y * p.x;
		}

		P add(P p) {
			P ret = new P();
			ret.x = this.x + p.x;
			ret.y = this.y + p.y;
			return ret;
		}

		P sub(P p) {
			P ret = new P();
			ret.x = this.x - p.x;
			ret.y = this.y - p.y;
			return ret;
		}

		P rot(double theta) {
			P ret = new P();
			ret.x = this.x * Math.cos(theta) - this.y * Math.sin(theta);
			ret.y = this.y * Math.cos(theta) + this.x * Math.sin(theta);
			return ret;
		}

		double abs(P p) {
			return Math.sqrt(p.x * p.x + p.y * p.y);
		}

		P neg() {
			P ret = new P();
			ret.x = -this.x;
			ret.y = -this.y;
			return ret;
		}

		P norm(P p) {
			P ret = new P();
			ret.x = p.x / abs(p);
			ret.y = p.y / abs(p);
			return ret;
		}

		double sin(P p) {
			return this.vec(p) / abs(this) / abs(p);
		}

		P mul(double a) {
			P ret = new P();
			ret.x = this.x * a;
			ret.y = this.y * a;
			return ret;
		}
	}

	void run() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			P[] p = new P[3];
			for (int a = 0; a < 3; a++) {
				p[a] = new P();
				p[a].x = sc.nextDouble();
				p[a].y = sc.nextDouble();
			}
			P g01 = (p[0].add(p[1])).mul(0.5);
			P m01 = p[0].sub(p[1]);
			P x = new P(0,0);  // xx + yx = zx
			P y = new P(1,1);  // xy + yy = zy
			P z = new P(0,0);
			if(Math.abs(m01.y) > 0.0000001){
				Double m1 = -m01.x/m01.y;
				x.x = -m1;
				y.x = 1.0;
				z.x = -g01.x * m1 + g01.y;
			}else{
				x.x = 1.0;
				y.x = 0.0;
				z.x = g01.x;
			}
			// y - y0 = -1/m(x - x0)
			P g02 = (p[0].add(p[2])).mul(0.5);
			P m02 = p[0].sub(p[2]);			
			if(Math.abs(m02.y) > 0.0000001){
				Double m2 = -m02.x/m02.y;
				x.y = -m2;
				y.y = 1.0;
				z.y = -g02.x * m2 + g02.y;
			}else{
				x.y = 1.0;
				y.y = 0.0;
				z.y = g02.x;
			}
			
			double det = x.vec(y);
			double xx = z.vec(y)/det; // Cramer 
			double yy = x.vec(z)/det; // Cramer 
			double rr = new P().abs(new P(xx,yy).sub(p[0]));
			System.out.println(xx+" "+yy+" "+rr );
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}