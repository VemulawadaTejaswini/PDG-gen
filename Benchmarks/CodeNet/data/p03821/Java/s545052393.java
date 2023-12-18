import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[100010];
		int[] b = new int[100010];
		for (int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int ret = 0;
		for (int i = n-1;i >= 0;i--) {
			int ai = a[i] + ret;
			int bi = b[i];
			if (ai%bi!=0) {
				ret += bi-(ai%bi);
			}
		}
		System.out.println(ret);
	}
}
