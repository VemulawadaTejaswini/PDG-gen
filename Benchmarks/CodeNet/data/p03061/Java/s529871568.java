import java.util.*;

public class Main {
	public static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0)
			return a;
		int r = a % b;
		return gcd(b, r);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int gcd[] = new int[n + 1];
		int gcdrear[] = new int[n + 1];
		for(int i = 0; i < n; ++i){
			a[i] = sc.nextInt();
			gcd[i + 1] = gcd(gcd[i], a[i]);
		}
		for(int i = n; i >= 1; --i){
			int index = n - i + 1;
			gcdrear[index] = gcd(gcdrear[index - 1], a[i - 1]);
		}
		sc.close();
		int ans = 0;
		for(int i = 0; i < n; ++i){
			int tmp = gcd(gcdrear[n - i - 1], gcd[i]);
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}
