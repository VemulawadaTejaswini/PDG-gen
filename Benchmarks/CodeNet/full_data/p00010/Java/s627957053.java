import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			Vector2 ra = new Vector2(sc.nextDouble(),sc.nextDouble());
			Vector2 rb = new Vector2(sc.nextDouble(),sc.nextDouble());
			Vector2 rc = new Vector2(sc.nextDouble(),sc.nextDouble());
			Vector2 rm = ra.add(rb).divide(2);
			Vector2 dmo = ra.subtract(rb).rotate90();
			Vector2 rn = ra.add(rc).divide(2);
			Vector2 dno = ra.subtract(rc).rotate90();
			Vector2 ro = Vector2.intersect(rm, dmo, rn, dno);
			double radius = ro.subtract(ra).norm();
			System.out.println(df.format(ro.x) + " " + df.format(ro.y) + " " + df.format(radius));
		}
	}

}
class Vector2 {
	public double x;
	public double y;
	public Vector2(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double dot(Vector2 v) {
		return this.x*v.x+this.y*v.y;
	}
	public double cross(Vector2 v) {
		return this.x*v.y-this.y*v.x;
	}
	public double norm() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public Vector2 add(Vector2 v) {
		return new Vector2(x+v.x,y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(x-v.x,y-v.y);
	}
	public Vector2 multiply(double k) {
		return new Vector2(x*k,y*k);
	}
	public Vector2 divide(double k) {
		return new Vector2(x/k,y/k);
	}
	public Vector2 rotate90() {
		return new Vector2(-y,x);
	}
	public static Vector2 intersect(Vector2 r1,Vector2 d1,Vector2 r2,Vector2 d2) {
		return r1.add(d1.multiply(-d2.cross(r2.subtract(r1)) / d1.cross(d2)));
	}
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}