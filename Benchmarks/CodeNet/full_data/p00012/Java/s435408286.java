import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			Vector2 r1 = new Vector2(sc.nextDouble(), sc.nextDouble());
			Vector2 r2 = new Vector2(sc.nextDouble(), sc.nextDouble());
			Vector2 r3 = new Vector2(sc.nextDouble(), sc.nextDouble());
			Vector2 rp = new Vector2(sc.nextDouble(), sc.nextDouble());
			if (r2.subtract(r1).cross(r3.subtract(r2)) < 0) {
				Vector2 temp = r2;
				r2 = r3;
				r3 = temp;
			}
			boolean ans = true;
			ans &= Vector2.dist(r1, r2, rp) > 0;
			ans &= Vector2.dist(r2, r3, rp) > 0;
			ans &= Vector2.dist(r3, r1, rp) > 0;
			System.out.println(ans ? "YES" : "NO");
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
	public Vector2 normalize() {
		return divide(norm());
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
	public Vector2 rotate270() {
		return new Vector2(y,-x);
	}
	public static double dist(Vector2 r1,Vector2 r2,Vector2 p) {
		return r2.subtract(r1).normalize().cross(p.subtract(r1));
	}
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}