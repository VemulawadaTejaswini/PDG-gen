import java.util.*;

public class Main {
	static int A;
	static int B;
	static int C;
	static int n;
	static int[] arr;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(checkPoint(0, new Bamboo()));
	}
	
	static int checkPoint(int level, Bamboo b) {
		if (level == n) {
			return b.getPoint();
		}
		int min = Integer.MAX_VALUE;
		int v = arr[level];
		int ans = checkPoint(level + 1, b.copy().addA(v));
		if (min > ans) {
			min = ans;
		}
		ans = checkPoint(level + 1, b.copy().addB(v));
		if (min > ans) {
			min = ans;
		}
		ans = checkPoint(level + 1, b.copy().addC(v));
		if (min > ans) {
			min = ans;
		}
		ans = checkPoint(level + 1, b);
		if (min > ans) {
			min = ans;
		}
		return min;
	}
	
	static class Bamboo {
		int a;
		int b;
		int c;
		int mp;
		
		public Bamboo() {
		}
		
		public Bamboo addA(int a) {
			if (this.a != 0) {
				mp += 10;
			}
			this.a += a;
			return this;
		}
		
		public Bamboo addB(int b) {
			if (this.b != 0) {
				mp += 10;
			}
			this.b += b;
			return this;
		}
		
		public Bamboo addC(int c) {
			if (this.c != 0) {
				mp += 10;
			}
			this.c += c;
			return this;
		}
		
		public int getPoint() {
			if (a == 0 || b == 0 || c == 0) {
				return Integer.MAX_VALUE;
			} else {
				return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) + mp;
			}
		}
		
		public Bamboo copy() {
			Bamboo x = new Bamboo();
			x.a = a;
			x.b = b;
			x.c = c;
			x.mp = mp;
			return x;
		}
	}
}


