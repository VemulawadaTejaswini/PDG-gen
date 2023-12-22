import java.io.*;

class Point {
	double x,y;
	Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
}

class Vec {
	double x,y;
	Point s,e;
	Vec(Point p1,Point p2) {
		this.s = p1;
		this.e = p2;
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
	Vec rotate() {
		return new Vec(this.y/Size(),(-1)*this.x/Size());	
	}
	double Size() {
		return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
	}
	void arrange(Vec r) {
		this.x *= -1;
		this.y *= -1;
		this.x += r.x;
		this.y += r.y;
		this.x *= -1;
		this.y *= -1;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("-1")) {
				int n = Integer.parseInt(buf);
				double x = -1.0;
				double y = 0.0;
				Vec v1 = new Vec(x,y);
				for (int i=2;i<=n;i++) {
					Vec v2 = v1.rotate();
					v1.arrange(v2);
				}
				System.out.println((-1)*v1.x);
				System.out.println((-1)*v1.y);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}