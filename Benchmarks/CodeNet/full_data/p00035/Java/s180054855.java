import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			Vec2d[] p = new Vec2d[4];
			for(int j=0;j<4;j++) {
				p[j] = new Vec2d(sc.nextInt(),sc.nextInt());
			}
			System.out.println(Vec2d.intersect(p[0],p[1],p[2],p[3]) ? 1 : 0);
		}
	}
}

class Vec2d {
	int x = 0;
	int y = 0;
	public Vec2d(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int dot(Vec2d v) {
		return this.x*v.x+this.y*v.y;
	}
	public int cross(Vec2d v) {
		return this.x*v.y-this.y*v.x;
	}
	public Vec2d add(Vec2d v) {
		return new Vec2d(this.x+v.x,this.y+v.y);
	}
	public Vec2d subtract(Vec2d v) {
		return new Vec2d(this.x-v.x,this.y-v.y);
	}
	public Vec2d multiply(int k) {
		return new Vec2d(k*this.x,k*this.y);
	}
	public static boolean intersect(Vec2d p0,Vec2d p1,Vec2d p2,Vec2d p3) {
		Vec2d v1 = p1.subtract(p0);
		Vec2d v2 = p3.subtract(p2);
		Vec2d v = p2.subtract(p0);
		Vec2d v_ = p1.subtract(p0);
		int a = v1.cross(v2);
		if(a==0) {
			return v.cross(v_) == 0 && v.dot(v_) <= 0;
		}else{
			int a1 = -v1.cross(v);
			int a2 = -v2.cross(v);
			if (a>0) {
				return (0<=a1&&a1<=a&&0<=a2&&a2<=a);
			}else{
				return (a<=a1&&a1<=0&&a<=a2&&a2<=0);
			}
		}
	}
	public String toString() {
		return this.x + " " + this.y;
	}
}