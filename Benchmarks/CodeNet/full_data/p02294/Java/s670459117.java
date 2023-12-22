import java.util.Scanner;

public class Main{
	static final double EPS = 0.00000000001;
	static final int COUNTER_CLOCKWISE = 1;
	static final int CLOCKWISE = -1;
	static final int ONLINE_BACK = 2;
	static final int ONLINE_FRONT = -2;
	static final int ON_SEGMENT = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			int[]p0 = new int[2];
			int[]p1 = new int[2];
			int[]p2 = new int[2];
			int[]p3 = new int[2];
			p0[0] = scan.nextInt();
			p0[1] = scan.nextInt();
			p1[0] = scan.nextInt();
			p1[1] = scan.nextInt();
			p2[0] = scan.nextInt();
			p2[1] = scan.nextInt();
			p3[0] = scan.nextInt();
			p3[1] = scan.nextInt();
			if(intersect(p0, p1, p2, p3)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		scan.close();

	}
	static boolean intersect(int[]p1, int[]p2, int[]p3, int[]p4) {
		if(ccw(p1, p2, p3) * ccw(p1, p2, p4) <= 0 && ccw(p3, p4, p1) * ccw(p3, p4, p2) <= 0) {
			return true;
		}else {
			return false;
		}
	}
	static int ccw(int[]p0, int[]p1, int[]p2) {
		int[]a = {p1[0] - p0[0], p1[1] - p0[1]};
		int[]b = {p2[0] - p0[0], p2[1] - p0[1]};
		if(cross(a, b) > EPS) return COUNTER_CLOCKWISE;
		if(cross(a, b) < -EPS) return CLOCKWISE;
		if(dot(a, b) < -EPS) return ONLINE_BACK;
		if(norm(a) < norm(b)) return ONLINE_FRONT;
		return ON_SEGMENT;
	}
	static int norm(int[]p) {
		return p[0] * p[0] + p[1] * p[1];
	}
	static int[] vec(int[]p1, int[]p2) {
		int[]u = {p2[0] - p1[0], p2[1] - p1[1]};
		return u;
	}
	static int dot(int[]u, int[]v) {
		return u[0] * v[0] + u[1] * v[1];
	}
	static int cross(int[]u, int[]v) {
		return u[0] * v[1] - u[1] * v[0];
	}
}
