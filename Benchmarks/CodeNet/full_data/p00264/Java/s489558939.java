import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static Vector2 ZERO = new Vector2(0,0);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int r = sc.nextInt();
			if (h+r == 0) {
				break;
			}
			Vector2[] home = new Vector2[h];
			Pair[] count = new Pair[h];
			for(int i=0;i<h;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				home[i] = new Vector2(x,y);
				count[i] = new Pair(i,0);
			}
			int u = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			double du = Math.toRadians(sc.nextInt())/2;
			double dm = Math.toRadians(sc.nextInt())/2;
			double ds = Math.toRadians(sc.nextInt())/2;
			Vector2[] posU = new Vector2[u];
			Vector2[] posM = new Vector2[m];
			Vector2[] posS = new Vector2[s];
			for(int i=0;i<u;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				posU[i] = new Vector2(x,y);
			}
			for(int i=0;i<m;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				posM[i] = new Vector2(x,y);
			}
			for(int i=0;i<s;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				posS[i] = new Vector2(x,y);
			}
			for(int i=0;i<r;i++) {
				int w = sc.nextInt();
				int a = sc.nextInt();
				Vector2 wind = new Vector2(Math.cos(Math.toRadians(w)),Math.sin(Math.toRadians(w)));
				for(int j=0;j<h;j++) {
					if (intersect(posU, wind, a, du, home[j])) {
						continue;
					}
					if (intersect(posM, wind, a, dm, home[j])) {
						continue;
					}
					if (intersect(posS, wind, a, ds, home[j])) {
						continue;
					}
					if (!intersect(ZERO,wind,a,du,home[j])) {
						continue;
					}
					count[j].b++;
				}
			}
			Arrays.sort(count,new Comparator<Pair>() {
				public int compare(Pair o1, Pair o2) {
					return o1.b- o2.b;
				}
			});
			int max = count[h-1].b;
			if (max == 0) {
				System.out.println("NA");
			}else{
				ArrayList<Integer> ans = new ArrayList<Integer>();
				for(int i=0;i<h;i++) {
					if (count[i].b == max) {
						ans.add(count[i].a);
					}
				}
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<ans.size();i++) {
					sb.append(ans.get(i)+1);
					if (i!=ans.size()-1) {
						sb.append(" ");
					}
				}
				System.out.println(sb);
			}
		}
	}
	public static boolean intersect(Vector2[] pos,Vector2 dir,double length,double ang,Vector2 r) {
		for(Vector2 r0:pos) {
			if (intersect(r0, dir, length, ang, r)) {
				return true;
			}
		}
		return false;
	}
	public static boolean intersect(Vector2 r0,Vector2 dir,double length,double ang,Vector2 r) {
		Vector2 r1 = r.subtract(r0);
		return r1.norm() < length && dir.dot(r1.normalize()) > Math.cos(ang);
	}
}
class Pair {
	int a,b;
	public Pair(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "(" + a + "," + b + ")";
	}
}
class Vector2 {
	double x = 0;
	double y = 0;
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
	public Vector2 add(Vector2 v) {
		return new Vector2(this.x+v.x,this.y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(this.x-v.x,this.y-v.y);
	}
	public Vector2 multiply(double k) {
		return new Vector2(k*this.x,k*this.y);
	}
	public Vector2 divide(double k) {
		return new Vector2(x/k,y/k);
	}
	public double norm() {
		return Math.sqrt(x*x+y*y);
	}
	public Vector2 normalize() {
		return this.divide(norm());
	}
	public String toString() {
		return this.x + " " + this.y;
	}
}