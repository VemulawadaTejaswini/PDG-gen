import java.util.*;

public class Main {
	static int n;
	static int a;
	static int b;
	static int z;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		z = a - b;
		int max = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int x = 1;
		int y = max / b + 1;
		while (y > x) {
			int m = (x + y) / 2;
			if (complete(m, arr)) {
				y = m;
			} else {
				x = m + 1;
			}
		}
		System.out.println(y);
	}
	
	static boolean complete(int m, int[] arr) {
		int[] tmp = arr.clone();
		int t = m;
		for (int i = 0; i < n; i++) {
			tmp[i] -= b * m;
			if (tmp[i] > 0) {
				if (tmp[i] % z == 0) {
					t -= tmp[i] / z;
				} else {
					t -= tmp[i] / z + 1;
				}
			}
			if (t < 0) {
				return false;
			}
		}
		return true;
	}
}
