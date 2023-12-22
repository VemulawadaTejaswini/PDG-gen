import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long res = 1l;
		int n = sc.nextInt();
		boolean flag = false;
		boolean flag2 = false;
		for (int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			if ((res *= tmp) > (long)1e18 || res < 0) {
				flag = true;
			}
			if (tmp == 0l) {
				flag2 = true;
				break;
			}
		}
		if (flag2) {
			System.out.println(0);
		} else {
			if (flag) {
				System.out.println(-1);
			} else {
				System.out.println(res);
			}
		}
	}
}
