import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long allLcm;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			allLcm = 1;
			Stick[] nodes = new Stick[N];
			boolean[] hasParent = new boolean[N];
			int[] l = new int[N];
			int[] r = new int[N];
			for (int i = 0; i < N; ++i) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				nodes[i] = new Stick(p, q);
				l[i] = sc.nextInt() - 1;
				r[i] = sc.nextInt() - 1;
				if (l[i] != -1) hasParent[l[i]] = true;
				if (r[i] != -1) hasParent[r[i]] = true;
			}
			int root = -1;
			for (int i = 0; i < N; ++i) {
				if (l[i] != -1) {
					nodes[i].left = nodes[l[i]];
				} else {
					nodes[i].left = new Weight();
				}
				if (r[i] != -1) {
					nodes[i].right = nodes[r[i]];
				} else {
					nodes[i].right = new Weight();
				}
				if (!hasParent[i]) root = i;
			}
			nodes[root].set(new Rational(1, 1));
			System.out.println(nodes[root].sum());
		}
	}

	static abstract class Node {
		abstract long sum();

		abstract void set(Rational v);
	}

	static class Stick extends Node {
		Node left, right;
		int p, q;

		Stick(int p, int q) {
			this.p = p;
			this.q = q;
		}

		long sum() {
			return left.sum() + right.sum();
		}

		void set(Rational v) {
			this.left.set(v.mul(new Rational(q, p + q)));
			this.right.set(v.mul(new Rational(p, p + q)));
		}
	}

	static class Weight extends Node {
		Rational w;

		long sum() {
			return w.num * (allLcm / w.den);
		}

		void set(Rational v) {
			this.w = v;
			allLcm = lcm(allLcm, v.den);
		}
	}

	static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static class Rational {
		long num, den;

		Rational(long n, long d) {
			long gcd = gcd(n, d);
			this.num = n / gcd;
			this.den = d / gcd;
		}

		Rational add(Rational o) {
			return new Rational(this.num * o.den + this.den * o.num, this.den * o.den);
		}

		Rational mul(Rational o) {
			return new Rational(this.num * o.num, this.den * o.den);
		}

	}

}