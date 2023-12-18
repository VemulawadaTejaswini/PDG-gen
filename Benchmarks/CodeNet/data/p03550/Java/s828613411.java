import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans;
		if(n != 1) {
			ans = Math.max(Math.abs(w-a[n-1]), Math.abs(a[n-2]-a[n-1]));
		}else {
			ans = Math.abs(w-a[0]);
		}
		System.out.println(ans);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}