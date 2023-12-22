import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[] p = new double[8];
			for(int i = 0; i < 8; i++) {
				p[i] = sc.nextDouble() * 10;
			}
			Vec AB = new Vec(p[2] - p[0], p[3] - p[1]);
			Vec CD = new Vec(p[6] - p[4], p[7] - p[5]);
			double d = AB.x * CD.x + AB.y * CD.y;
			if(d == 0.0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	static class Vec {
		double x, y;
		Vec(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
}
