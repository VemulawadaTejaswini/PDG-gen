import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] h = new long[n];
		for(int i = 0; i < n; i++) h[i] = sc.nextLong();
		long l = 0, r = Integer.MAX_VALUE;
		while(r - l != 1) {
			long mid = (r + l) / 2;
			long[] x = Arrays.copyOf(h, h.length);
			long cnt = 0;
			for(int i = 0; i < x.length; i++) {
				if(x[i] - b <= 0) continue;
				cnt += ((x[i] - b * mid) + (a - b - 1)) / (a - b);
			}
			if(mid >= cnt) r = mid;
			else l = mid;
		}
		System.out.println(r);
	}
}
