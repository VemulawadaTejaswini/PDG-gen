import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class q {
		double x;
		double y;
		double z;
		double r;

		q(double xx, double yy, double zz, double rr) {
			x = xx;
			y = yy;
			z = zz;
			r = rr;
		}

	}

	void run() {
		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			double[] vec = new double[3];

			q[] d = new q[n];
			double vl = 0;
			for (int i = 0; i < 3; i++) {
				vec[i] = sc.nextDouble();
				vl += vec[i] * vec[i];
			}
			for (int i = 0; i < 3; i++) {
				vec[i] /= Math.sqrt(vl);
			}

			for (int i = 0; i < n; i++) {
				d[i] = new q(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
						sc.nextDouble());
			}

			double[] p = new double[3];

			int c =-1; 
			int Xp = -1;
			for (;;) {
				c++;
				double Kp = Double.MAX_VALUE;
				System.err.println("---");
				System.err.println(Xp+","+c +"|"+p[0]+" "+p[1]+" "+p[2]+"/"+vec[0]+" "+vec[1]+" "+vec[2]);
				for (int i = 0; i < n; i++) {
					if(i == Xp){
						continue;
					}
					double x2 = d[i].x - p[0];
					double y2 = d[i].y - p[1];
					double z2 = d[i].z - p[2];

					double vvl = x2 * x2 + y2 * y2 + z2 * z2;
					double dot = vec[0] * x2 + vec[1] * y2 + vec[2] * z2;
					if(dot<0){
						continue;
					}
					double r2 = Math.sqrt(vvl - dot *dot);
					System.err.println(i + " "+r2+" "+d[i].r);
					if (r2 < d[i].r) {
						if (Kp > dot - Math.sqrt(d[i].r * d[i].r - r2 * r2)) {
							Kp = dot - Math.sqrt(d[i].r * d[i].r - r2 * r2);
							Xp = i;
						}
					}
				}

				if (Kp == Double.MAX_VALUE) {
					break;
				}

				p[0] += vec[0] * Kp;
				p[1] += vec[1] * Kp;
				p[2] += vec[2] * Kp;

				double vx = p[0] - d[Xp].x;
				double vy = p[1] - d[Xp].y;
				double vz = p[2] - d[Xp].z;
				
				double vvl = Math.sqrt(vx*vx+vy*vy+vz*vz);

				vx /= vvl;
				vy /= vvl;
				vz /= vvl;
				
				double vvdot = vx*(-vec[0]) + vy*(-vec[1]) + vz * (-vec[2]);
				vec[0] = 2*vvdot*vx + vec[0];
				vec[1] = 2*vvdot*vy + vec[1];
				vec[2] = 2*vvdot*vz + vec[2];
				
				double vl2 = 0;
				for(int i = 0; i < 3; i ++){
					vl2 += vec[i]*vec[i];
				}
				vl2 = Math.sqrt(vl2);
				for(int i = 0 ; i<3;i++){
					vec[i] /= vl2;
				}
				
			}
			System.out.println(p[0] + " " + p[1] + " " + p[2]);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}