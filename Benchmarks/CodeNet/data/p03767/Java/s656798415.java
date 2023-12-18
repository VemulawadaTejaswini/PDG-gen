import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		Long result = 0l;
		int n = in.nextInt();
		int[] a = new int[3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a.length; j++) {
				a[j] = in.nextInt();
			}
			if (a[0] > a[1] && a[0] > a[2] && a[1] > a[2]) {
				result += a[1];
			}else if (a[0] > a[1] && a[0] > a[2] && a[2] > a[1]) {
				result += a[2];
			}
			if (a[1] > a[0] && a[1] > a[2] && a[0] > a[2]) {
				result += a[0];
			}else if (a[1] > a[0] && a[1] > a[2] && a[2] > a[0]) {
				result += a[2];
			}
			if (a[2] > a[0] && a[2] > a[1] && a[0] > a[1]) {
				result += a[0];
			}else if (a[2] > a[0] && a[2] > a[1] && a[1] > a[0]) {
				result += a[1];
			}
		}
		System.out.println(result);
	}
}