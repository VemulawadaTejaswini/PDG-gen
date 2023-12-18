import java.util.*;

public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	static int count(String s, String sss, String t, int index) {
		int count = 2;
		while (index < s.length() * 2 + 1) {
			int pos = index + t.length();
			int nextIndex = sss.indexOf(t, pos);
			if (nextIndex != pos) {
				return count;
			}
			index = nextIndex;
			count++;
		}
		return -1;
	}

	static int solve(String s, String t) {
		String sss = s + s + s + s;
		int index = sss.indexOf(t);
		if (index == -1) {
			return 0;
		}
		while (index < s.length()) {
			int pos = index + t.length();
			int nextIndex = sss.indexOf(t, pos);
			if (nextIndex == pos) { // 繰り返し
				return count(s, sss, t, nextIndex);
			}
			index = nextIndex;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if (s.length() < t.length()) {
			StringBuilder sb = new StringBuilder(t.length());
			while (sb.length() <= t.length()) {
				sb.append(s);
			}
			s = sb.toString();
		}

		int result = solve(s, t);
		System.out.println(result);
	}
}
