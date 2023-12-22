import java.util.Scanner;

public class Main {

	public static double dist(int[] xs, int[]ys, int p) {
		double ret = 0.0;
		for(int i=0;i<xs.length;i++) {
			ret += Math.pow(Math.abs(xs[i] - ys[i]), p);
		}
		return Math.pow(ret, 1.0/p);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int xs[] = new int[n];
		int ys[] = new int[n];
		for (int i = 0; i < n; i++) {
			xs[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			ys[i] = in.nextInt();
		}

		System.out.println(dist(xs, ys, 1));
		System.out.println(dist(xs, ys, 2));
		System.out.println(dist(xs, ys, 3));

		double ret = 0.0;
		for(int i=0;i<n;i++) {
			ret = Math.max(ret, Math.abs(xs[i] - ys[i]));
		}
		System.out.println(ret);
	}
}