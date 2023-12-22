import java.util.*;

//reference to isikado
public class Main{
	Scanner sc = new Scanner(System.in);
	double r = 6378.1;
	double PI = Math.PI;
	
	class P3D{
		double [] p;
		public P3D(double[] p) {
			this.p = new double[3];
			for(int i =0; i < 3; i++){
				this.p[i] = p[i];
			}
			this.p = p;
		}
	}
	
	private double distance3D(P3D p1, P3D p2) {
		double res = 0;
		for(int i = 0; i < 3; i++){
			res += (p1.p[i] - p2.p[i]) * (p1.p[i] - p2.p[i]);
		}
		return Math.sqrt(res);
	}
	
	private void doit() {
		while(true){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			if(a == -1 && b == -1 && c == -1 && d == -1) break;
			double [][] rad = new double[2][2];
			rad[0][0] = a / 180 * PI;
			rad[0][1] = b / 180 * PI;
			rad[1][0] = c / 180 * PI;
			rad[1][1] = d / 180 * PI;
			P3D [] p = new P3D[2];
			for(int i = 0; i < 2; i++){
				double x = r * Math.cos(rad[i][0]) * Math.cos(rad[i][1]);
				double y = r * Math.cos(rad[i][0]) * Math.sin(rad[i][1]);
				double z = r * Math.sin(rad[i][0]);
				p[i] = new P3D(new double[]{x,y,z});
			}
			double dis = distance3D(p[0], p[1]);
			double deg = calc(dis);
			double ans = deg / 180 * r * PI;
			System.out.printf("%.0f\n", ans);
		}
	}

	private double calc(double dis) {
		double rr = r * r;
		double cos = (rr + rr - dis * dis) / (2 * rr); 
		double res = Math.toDegrees(Math.acos(cos));
		return res;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}