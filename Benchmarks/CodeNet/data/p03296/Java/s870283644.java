import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n - 1; i++) {
			if(a[i] == a[i + 1] && a[i] <= 100) {
				a[i + 1] += 1000;
				ans++;
				i++;
			}
		}
		System.out.println(ans);
	}

	static int func(long x) {
		int ret = 0;
		while(x > 0) {
			ret += x % 10;
			x /= 10;
		}
		return ret;
	}

}
