import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P {
		double x;
		double y;

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
			P[] p2 = new P[3];
			for (int a = 0; a < 3; a++) {
				p2[a] = p[a].sub(p[0]);
			}

			double r2 = p2[1].abs(p2[1]) / p2[2].sin(p2[2].sub(p2[1]));
			Double r = Math.abs(r2 / 2);
			if (r < 0.00001 || r.isNaN()) {
				System.out.println("0.000 0.000 0.000");
				continue;
			}
			P v1 = p2[1];
			P v2 = new P();

			v2.x = v1.y;
			v2.y = -v1.x;
			if (p2[2].dot(v2) < 0) {

				v2 = v2.neg();
			}
			P ans = p2[1].add(v2.norm(v2).mul(Math.sqrt(r*r - p2[1].abs(p2[1])*p2[1].abs(p2[1])))).mul(0.5).add(p[0]);
			NumberFormat format = NumberFormat.getInstance();
			format.setMaximumFractionDigits(3);
			format.setMinimumFractionDigits(3);
			
			if(ans.x<0.0001|| new Double(ans.x).isNaN()){
				System.out.print("0.000 "); 				
			}else{
				System.out.print(format.format(ans.x)+" "); 
			}
			if(ans.y<0.0001 || new Double(ans.y).isNaN()){
				System.out.print("0.000 "); 				
			}else{
				System.out.print(format.format(ans.y)+" "); 
			}
			if(r<0.0001){
				System.out.print("0.000"); 				
			}else{
				System.out.print(format.format(r)); 
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}