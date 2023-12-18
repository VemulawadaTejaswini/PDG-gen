import java.util.Scanner;

public class Main {
	static Long h1;
	static Long h2;
	static Long w1;
	static Long w2;
	static Long h, w;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextLong();
		w = sc.nextLong();

		init();

		Long ansA = h*w;
		Long ansB = h*w;

		Long max, min;

		Long a = 0L; Long b = 0L; Long c = 0L;



		if(h % 3 == 0 || w % 3 == 0) {
			System.out.println(0);
		} else {

			while(true) {
				a = h1 * w1;
				b = h1 * w2;
				c = h2 * w;
				if(getMax(a, b, c) - getMin(a, b, c) < ansA) {
					ansA = getMax(a, b, c) - getMin(a, b, c);
				} else {
					break;
				}
				h1 += 1;
				h2 -= 1;

			}

			init();
			while(true) {
				a = w1 * h1;
				b = w1 * h2;
				c = w2 * h;

				if(getMax(a, b, c) - getMin(a, b, c) < ansB) {
					ansB = getMax(a, b, c) - getMin(a, b, c);
				} else {
					break;
				}
				w1 += 1;
				w2 -= 1;

			}

			if(ansA <= ansB) {
				System.out.println(ansA);
			} else {
				System.out.println(ansB);
			}
		}

	}

	public static void init() {
		h1 = h / 2;
		h2 = h / 2;
		w1 = w / 2;
		w2 = w / 2;

		if(h % 2 == 1) {
			h2 += 1;
		}
		if(w % 2 == 1) {
			w2 += 1;
		}
	}

	public static Long getMax(Long a, Long b, Long c) {

		if(a >= b && a >= c) {
			return a;
		} else if(b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public static Long getMin(Long a, Long b, Long c) {

		if(a <= b && a <= c) {
			return a;
		} else if(b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}
}
