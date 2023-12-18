import java.util.Scanner;
public class Main {
	public static int max;
	public static int[] a;
	public static int[] S;
	public static int[] l;
	public static int[] r;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Q = Integer.parseInt(scan.nextLine());
		l = new int[Q];
		r = new int[Q];
		for (int q = 0;q < Q ;q++ ) {
			String[] line = scan.nextLine().split(" ", 0);
			l[q] = Integer.parseInt(line[0]);
			r[q] = Integer.parseInt(line[1]);
			max = Math.max(max,r[q]);
		}
		a = new int[max + 1];
		S = new int[max + 1];
		for (int s = 0;s <= max;s++ ) {
			a[s] = search(s + 1);
			S[s] = s == 0?a[s]:S[s-1] + a[s];
		}
		for (int q = 0;q < Q ;q++ ) {
			System.out.println(S[r[q]] - S[l[q]>2?l[q] - 2:0]);
		}
	}

	private static int search(int l) {
		int ans = 0;
		if (l == 1) return ans;
		if (l % 2 == 0) return ans;
		if ((check(l)) && check((l + 1)/2)) ans++;
		return ans;
	}
	private static boolean check(int i) {
		for (int j = 2;j < i ;j++ ) {
			if (i%j == 0) return false;
		}
		return true;
	}
}
