import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int q = sc.nextInt();
	static int[] a = new int[n];
	static int[] b = new int[n];
	static int[] p = new int[q + 1];
	static int[] x = new int[q + 1];
	static long[] cnt = new long[n + 1];

	public static void main(String[] args) {

		//どの配列も1-indexed
		for (int i = 1; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 1; i < p.length; i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}

		int[] flag = new int[n + 1];
		for (int i = 1; i < p.length; i++) {
			cnt[p[i]] += (long) x[i];
			flag[p[i]] = 1;
		}
		for (int i = 1; i < cnt.length; i++) {
			if (flag[i] == 1) {
				plus(p[i], cnt[i]);
			}
		}

		for (int i = 1; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		sc.close();

	}

	public static void plus(int p, long x) {

		for (int i = 1; i < a.length; i++) {
			if (a[i] == p) {
				cnt[b[i]] += x;
				plus(b[i], x);
			}
		}
	}

}