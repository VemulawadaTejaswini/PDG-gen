import java.util.Scanner;
public class Main {
	public static int max = (int)Math.pow(10,5);
	public static int[] a = new int[max];
	public static int[] S = new int[max];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Q = Integer.parseInt(scan.nextLine());
		for (int s = 0;s < max;s++ ) {
			a[s] = search(s + 1);
			S[s] = s == 0?a[s]:S[s-1] + a[s];
		}
		for (int q = 0;q < Q ;q++ ) {
			String[] line = scan.nextLine().split(" ", 0);
			int l = Integer.parseInt(line[0]);
			int r = Integer.parseInt(line[1]);
			System.out.println(S[r] - S[l>2?l - 2:0]);
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
