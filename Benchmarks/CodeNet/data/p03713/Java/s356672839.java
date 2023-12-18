import java.util.Scanner;

public class Main {
	static long ans = Integer.MAX_VALUE;
	static long s;
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		long s1, s2;
		s = h * w;
		for(int i = 0; i < h; i++) {
			s1 = w * i;
			s2 = w * (h-i)/2;
			update(s1, s2);
			s2 = (h - i) * (w / 2);
			update(s1, s2);
		}
		for(int i = 0; i < w; i++) {
			s1 = h * i;
			s2 = h * (w - i)/2;
			update(s1, s2);
			s2 = (h / 2) * (w - i);
			update(s1, s2);
		}
		System.out.println(ans);
	}
	static void update(long s1, long s2) {
		long s3 = - s1 - s2 + s;
		long sa = Math.max(s1, Math.max(s2, s3)) - Math.min(s1, Math.min(s2, s3));
		if(ans > sa) {
			ans = sa;
		}
	}
}