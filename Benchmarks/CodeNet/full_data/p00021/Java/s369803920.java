import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P {
		Double x;
		Double y;

		P() {
		};

		P(Double x, Double y) {
			this.x = x;
			this.y = y;
		}

		Double vec(P p) {
			return this.x * p.y - p.x * this.y;
		}

		P org(P p) {
			return new P(this.x - p.x, this.y - p.y);
		}
	}

	void run() {
		int n = sc.nextInt();
		double EPS = 0.00000001;
		for (int i = 0; i < n; i++) {
			P[] data = new P[4];
			for (int j = 0; j < 4; j++) {
				data[j] = new P(sc.nextDouble(), sc.nextDouble());
			}
			System.out.println(Math.abs(data[0].org(data[1]).vec(
					data[2].org(data[3]))) < EPS ? "YES" : "NO");
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();

	}
}