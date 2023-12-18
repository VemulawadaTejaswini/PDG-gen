import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		long[] a = new long[4];
		for(int i = 0 ; i < 4 ; i++) a[i] = Long.MAX_VALUE;
		for(int i = 1 ; i <= h - 1 ; i++) {
			long s1 = 1L * i * w;
			long ww = w / 2;
			long s2 = 1L * (h - i) * ww;
			long s3 = 1L * (h - i) * (w - ww);
			long max = Math.max(s1, Math.max(s2, s3));
			long min = Math.min(s1, Math.min(s2, s3));
			a[0] = Math.min(a[0], max - min);
		}
		for(int i = 1 ; i <= w - 1 ; i++) {
			long s1 = 1L * i * h;
			long hh = h / 2;
			long s2 = 1L * (w - i) * hh;
			long s3 = 1L * (w - i) * (h - hh);
			long max = Math.max(s1, Math.max(s2, s3));
			long min = Math.min(s1, Math.min(s2, s3));
			a[1] = Math.min(a[1], max - min);
		}
		for(int i = 1 ; i <= h - 1 ; i++) {
			long s1 = 1L * i * w;
			long half = (h - i) / 2;
			long s2 = 1L * half * w;
			long s3 = 1L * ((h - i) - half) * w;
			long max = Math.max(s1, Math.max(s2, s3));
			long min = Math.min(s1, Math.min(s2, s3));
			a[2] = Math.min(a[2], max - min);
		}
		for(int i = 1 ; i <= w - 1 ; i++) {
			long s1 = 1L * i * h;
			long half = (w - i) / 2;
			long s2 = 1L * half * h;
			long s3 = 1L * ((w - i) - half) * h;
			long max = Math.max(s1, Math.max(s2, s3));
			long min = Math.min(s1, Math.min(s2, s3));
			a[3] = Math.min(a[3], max - min);
		}
		Arrays.sort(a);
		System.out.println(a[0]);
	}
}
