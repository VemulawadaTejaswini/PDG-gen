import java.math.BigDecimal;
import java.util.Scanner;

class vec2 {
	private double _x, _y;
	vec2(double x, double y) {
		_x = x;
		_y = y;
	}
	vec2 scalarMultiple(double k) {
		return new vec2(k * _x, k * _y);
	}
	vec2 plus(vec2 v) {
		return new vec2(_x + v._x, _y + v._y);
	}
	vec2 minus(vec2 v) {
		return this.plus(v.scalarMultiple(-1));
	}
	double innerMultiple(vec2 v) {
		return _x * v._x + _y * v._y;
	}
	double norm() {
		return Math.sqrt(_x * _x + _y * _y);
	}
	double getX() {
		return _x;
	}
	double getY() {
		return _y;
	}
}

class triangle {
	private vec2 _A, _B, _C;
	private double _a, _b, _c;
	triangle(vec2 A, vec2 B, vec2 C) {
		_A = A;
		_B = B;
		_C = C;
		_a = _B.minus(_C).norm();
		_b = _C.minus(_A).norm();
		_c = _A.minus(_B).norm();
	}
	vec2 circumcenter() {
		double x = _A.minus(_B).innerMultiple(_C.minus(_A));
		double y = _B.minus(_C).innerMultiple(_A.minus(_B));
		double z = _C.minus(_A).innerMultiple(_B.minus(_C));
		return _A.scalarMultiple(z * x + x * y).plus(_B.scalarMultiple(x * y + y * z)).plus(_C.scalarMultiple(y * z + z * x)).scalarMultiple(1.0 / (2 * (y * z + z * x + x * y)));
	}
	double area() {
		return Math.sqrt((_a + _b + _c) * (-_a + _b + _c) * (_a - _b + _c) * (_a + _b - _c)) / 4;
	}
	double radiusOfCircumscribedCircle() {
		double sinA = 2 * area() / _b / _c;
		return _a / sinA / 2;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		triangle tr;
		for (int i = 0; i < n; ++i) {
			vec2 v1 = new vec2(sc.nextDouble(), sc.nextDouble());
			vec2 v2 = new vec2(sc.nextDouble(), sc.nextDouble());
			vec2 v3 = new vec2(sc.nextDouble(), sc.nextDouble());
			tr = new triangle(v1, v2, v3);
			double qx = new BigDecimal(String.valueOf(tr.circumcenter().getX())).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			double qy = new BigDecimal(String.valueOf(tr.circumcenter().getY())).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			double R = new BigDecimal(String.valueOf(tr.radiusOfCircumscribedCircle())).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf("%.3f %.3f %.3f\n", qx, qy, R);
		}
		sc.close();
	}
}
