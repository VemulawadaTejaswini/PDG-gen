import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		long[] a = new long[100010];
		long[] b = new long[100010];
		for (int i = 0;i < n;i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		long ret = 0;
		for (int i = n-1;i >= 0;i--) {
			long ai = a[i] + ret;
			long bi = b[i];
			if (ai%bi!=0) {
				ret += bi-(ai%bi);
			}
		}
		System.out.println(ret);
	}
}
