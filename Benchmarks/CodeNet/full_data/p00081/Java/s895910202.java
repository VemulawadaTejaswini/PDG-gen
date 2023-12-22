import java.io.*;
import java.util.StringTokenizer;

class Point {
	double x,y;
	Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
}

class Vec {
	double x,y;
	Vec(Point p1,Point p2) {
		this.x = p2.x-p1.x;
		this.y = p2.y-p1.y;
	}
	Vec(Vec v1,Vec v2) {
		this.x = v2.x-v1.x;
		this.y = v2.y-v1.y;
	}
	Vec(double x,double y) {
		this.x = x;
		this.y = y;
	}
	double Size() {
		return Math.pow(this.x,2)+Math.pow(this.y,2);
	}
	Vec projection(Vec v) {
		double f = (this.x*v.x+this.y*v.y)/this.Size();
		return new Vec(f*this.x,f*this.y);
	}
	void arrange() {
		this.x *= 2;
		this.y *= 2;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				Point P1 = new Point(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
				Point P2 = new Point(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
				Point Q = new Point(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
				Vec a = new Vec(P1,P2);
				Vec b = new Vec(P1,Q);
				Vec c = new Vec(b,a.projection(b));
				c.arrange();
				System.out.println((Q.x+c.x)+" "+(Q.y+c.y));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static double dot(Vec a,Vec b) {
		return a.x*b.x+a.y*b.y;
	}
}