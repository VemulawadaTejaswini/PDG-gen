import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] hts = new long[n];
		for (int i = 0; i < n; i++) hts[i] = sc.nextLong();
		solve(hts, n);
	}

	private static void solve(long[] hts, int n) {
		// TODO Auto-generated method stub
		long rht = 0;
		for (int i = 1; i < n; i++) {
			if (hts[i - 1] < hts[i]) rht += hts[i] - hts[i - 1];
		}
		System.out.println(rht);
	}

}
