import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a[] = new int[N];
		int max = 0;

		int i;
		for (i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if (max < a[i]) {
				max = a[i];
			}
		}

		int r_max = max / 2;
		int r = a[0];
		int result;
		int pre_result = Math.abs(a[0] - r_max);
		for (i = 0; i < N; i++) {
			result = Math.abs(a[i] - r_max);
			if (result == 0) {
				r = a[i];
				break;
			} else {
				if (pre_result > result) {
					r = a[i];
					pre_result = result;
				}

			}
		}
		System.out.println(max + " " + r);
	}
}
