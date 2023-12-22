import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[][]p = new long[n][2];
		for(int i = 0; i < n; i++) {
			long x = scan.nextLong();
			long y = scan.nextLong();
			long[]t = {x, y};
			p[i] = t;
		}
		scan.close();
		long t = 0;
		for(int i = 0; i <= n - 3; i++) {
			t += triangle(p[i + 2], p[i + 1], p[0]);
		}
		t = Math.abs(t);
		if(t % 2 == 0) {
			System.out.println(t / 2 + ".0");
		}else {
			System.out.println(t / 2 +".5");
		}
	}

	static double triangle(long[]x, long[]y, long[]z) {
		return (cross(vec(z, x), vec(z, y)));
	}
	static long cross(long[]u, long[]v) {
		return u[0] * v[1] - u[1] * v[0];
	}
	static long[] vec(long[]p1, long[]p2) {
		long[]u = {p2[0] - p1[0], p2[1] - p1[1]};
		return u;
	}
}
