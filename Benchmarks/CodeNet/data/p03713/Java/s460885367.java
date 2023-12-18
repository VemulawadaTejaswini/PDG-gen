import java.util.Scanner;

public class Main {
	static long S;
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		long s1,s2,s3;
		long ans = Long.MAX_VALUE;
		S = h*w;
		for(int i = 1; i < h; i++) {//一つの長方形のhについて全探索
			s1 = w*i;
			s2 = w*((h-i)/2);
			ans = Math.min(ans, hikaku(s1,s2));
			s2 = (h-i)*(w/2);
			ans = Math.min(ans, hikaku(s1,s2));
		}
		for(int i = 1; i < w; i++) {
			s1 = h*i;
			s2 = h*((w-i)/2);
			ans = Math.min(ans, hikaku(s1,s2));
			s2 = (w-i)*(h/2);
			ans = Math.min(ans, hikaku(s1,s2));
		}
		System.out.println(ans);
	}
	static long hikaku(long a, long b) {
		long c = S-a-b;
		if(c<=0||a<=0||b<=0) return Long.MAX_VALUE;
		return Math.abs(Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c)));
	}
}