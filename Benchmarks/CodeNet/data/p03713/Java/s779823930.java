import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		BigInteger h = new BigInteger(sc.next());
		BigInteger w = new BigInteger(sc.next());
		BigInteger ans = new BigInteger("10000000000"), max = BigInteger.ZERO, min = BigInteger.ZERO, a = BigInteger.ZERO, b = BigInteger.ZERO, c = BigInteger.ZERO, j = BigInteger.ZERO;

		if (!h.multiply(w).divide(new BigInteger("3")).equals(0)) {
			if (w.compareTo(new BigInteger("3")) >= 0) {
				// 縦割
				j = w.divide(new BigInteger("3"));
				max = BigInteger.ZERO;
				min = BigInteger.ZERO;
				a = h.multiply(j);
				b = h.multiply(w.subtract(j)).divide(new BigInteger("2"));
				c = h.multiply(w.subtract(w.subtract(j).divide(new BigInteger("2"))));
				// System.out.println("1a:" + a + " b:" + b + " c:" + c);
				if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
					max = a;
				} else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
					max = b;
				} else {
					max = c;
				}
				if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) {
					min = a;
				} else if (b.compareTo(a) <= 0 && b.compareTo(c) <= 0) {
					min = b;
				} else {
					min = c;
				}
				if (ans.compareTo(max.subtract(min)) > 0) {
					ans = max.subtract(min);
					// System.out.println("1max:" + max + " min:" + min + " ans:" + ans);
				}
			}

			if (h.compareTo(new BigInteger("3")) >= 0 && h != w) {
				// 横割
				j = h.divide(new BigInteger("3"));
				max = BigInteger.ZERO;
				min = BigInteger.ZERO;
				a = w.multiply(j);
				b = w.multiply(h.subtract(j)).divide(new BigInteger("2"));
				c = w.multiply(h.subtract(h.subtract(j).divide(new BigInteger("2"))));
				if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
					max = a;
				} else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
					max = b;
				} else {
					max = c;
				}
				if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) {
					min = a;
				} else if (b.compareTo(a) <= 0 && b.compareTo(c) <= 0) {
					min = b;
				} else {
					min = c;
				}
				if (ans.compareTo(max.subtract(min)) >= 0) {
					ans = max.subtract(min);
					// System.out.println("2max:" + max + " min:" + min + " ans:" + ans);
				}
			}

			// 縦T
			for (int i = 1; i < h.intValue(); i++) {
				j = w.subtract(new BigInteger("2"));
				max = BigInteger.ZERO;
				min = BigInteger.ZERO;
				a = w.multiply(new BigInteger(String.valueOf(i)));
				b = h.subtract(new BigInteger(String.valueOf(i))).multiply(j);
				c = h.subtract(new BigInteger(String.valueOf(i))).multiply(w.subtract(j));
				if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
					max = a;
				} else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
					max = b;
				} else {
					max = c;
				}
				if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) {
					min = a;
				} else if (b.compareTo(a) <= 0 && b.compareTo(c) <= 0) {
					min = b;
				} else {
					min = c;
				}
				if (ans.compareTo(max.subtract(min)) >= 0) {
					ans = max.subtract(min);
				}
			}

			if (h != w) {
				// 横T
				for (int i = 1; i < w.intValue(); i++) {
					j = h.divide(new BigInteger("2"));
					max = BigInteger.ZERO;
					min = BigInteger.ZERO;
					a = h.multiply(new BigInteger(String.valueOf(i)));
					b = j.subtract(w.subtract(new BigInteger(String.valueOf(i))));
					c = h.subtract(j).multiply(w.subtract(new BigInteger(String.valueOf(i))));
					if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
						max = a;
					} else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
						max = b;
					} else {
						max = c;
					}
					if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) {
						min = a;
					} else if (b.compareTo(a) <= 0 && b.compareTo(c) <= 0) {
						min = b;
					} else {
						min = c;
					}
					if (ans.compareTo(max.subtract(min)) >= 0) {
						ans = max.subtract(min);
						// System.out.println("4max:" + max + " min:" + min + " ans:" + ans);
					}
				}
			}
		} else {
			ans = BigInteger.ZERO;
		}

		System.out.println(ans);

		sc.close();
	}
}
