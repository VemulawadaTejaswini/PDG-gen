import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] num = new String[8];

			int N = Integer.parseInt(str);
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				num = str.split(" ", 0);
				point A = new point(num[0], num[1]);
				point B = new point(num[2], num[3]);
				point C = new point(num[4], num[5]);
				point D = new point(num[6], num[7]);

				vector AB = new vector(A, B);
				vector CD = new vector(C, D);

				if (AB.slope.compareTo(CD.slope) == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class point {
	BigDecimal x;
	BigDecimal y;

	public point (String a, String b) {
		this.x = new BigDecimal(a);
		this.y = new BigDecimal(b);
	}

	public point (BigDecimal a, BigDecimal b) {
		this.x = new BigDecimal(a.toPlainString());
		this.y = new BigDecimal(b.toPlainString());
	}
}

//Definition of vector
 class vector {
	BigDecimal vx;
	BigDecimal vy;
	BigDecimal slope;

	public vector (point a, point b) {
		this.vx = new BigDecimal(b.x.toPlainString());
		this.vx = this.vx.subtract(a.x);
		this.vy = new BigDecimal(b.y.toPlainString());
		this.vy = this.vy.subtract(a.y);
		this.slope = new BigDecimal(this.vy.toPlainString());
		this.slope = this.slope.divide(this.vx, 5, BigDecimal.ROUND_HALF_UP);
	}
	public vector (BigDecimal p, BigDecimal q) {
		this.vx = new BigDecimal(p.toPlainString());
		this.vy = new BigDecimal(q.toPlainString());
		this.slope = new BigDecimal(this.vy.toPlainString());
		this.slope = this.slope.divide(this.vx, 5, BigDecimal.ROUND_HALF_UP);
	}
}