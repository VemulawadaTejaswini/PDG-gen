import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] p = new long[n][2];
		for(int i=0;i<n;i++) {
			p[i][0] = sc.nextLong();
			p[i][1] = sc.nextLong();
		}
		Arrays.sort(p, (a, b) -> Long.compare(a[0], b[0]));

		long ans = 0;
		long maxpoint = 0;
		for(int sep=0;sep<n-1;sep++) {
			maxpoint = Math.max(maxpoint, calc(p,sep,n));
		}
		System.out.println(maxpoint);
	}

	static long calc(long[][] p, int sep, int n) {
		long left=0,right=0;
		left = p[sep][0];
		right = p[0][1];
		for(int j=0;j<=sep;j++) {
			right = Math.min(right, p[j][1]);
		}
		long ans1 = Math.max(0, right - left + 1);

		left = p[n-1][0];
		right = p[sep+1][1];
		for(int j=sep+1;j<n;j++) {
			right = Math.min(right, p[j][1]);
		}
		long ans2 = Math.max(0, right - left + 1);

		return ans1 + ans2;
	}

}
