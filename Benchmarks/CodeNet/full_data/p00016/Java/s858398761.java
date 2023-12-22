import java.util.Scanner;

public class Main {
	public static class P {
		public double x;
		public double y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static P ta(int d, int a) {
		double dx = d * Math.sin(a * Math.PI / 180.0);
		double dy = d * Math.cos(a * Math.PI / 180.0);
		return new P(dx, dy);
	} 
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			double x = 0.0;
			double y = 0.0;
			int a0 = 0;
			while(sc.hasNext()) {
				String[] str = sc.next().split(",");
				int d = Integer.parseInt(str[0]);
				int a = Integer.parseInt(str[1]);
				if(d == 0 && a == 0) break;
				P p = ta(d, a0);
				x += p.x;
				y += p.y;
				
				if(a < 0) a += 360;
				a0 += a;
				a0 %= 360;
			}
			System.out.printf("%d\n%d\n", (int)x, (int)y);
		}
	}
}
