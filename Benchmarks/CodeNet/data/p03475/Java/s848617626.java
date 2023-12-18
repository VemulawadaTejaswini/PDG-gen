import java.util.Scanner;

public class Main {

	static int n;
	static int[] c;
	static int[] s;
	static int[] f;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = new int[n];
		s = new int[n];
		f = new int[n];
		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			solver(i, 0);
		}
	}

	public static void solver(int stationNo, int arrivedTime) {
		if (stationNo == n - 1) {
			System.out.println(arrivedTime);
			return;
		}
		if (arrivedTime <= s[stationNo]) {
			solver(stationNo + 1, s[stationNo] + c[stationNo]);
		} else {
			solver(stationNo + 1, (arrivedTime + f[stationNo] - 1) / f[stationNo] * f[stationNo] + c[stationNo]);
		}
	}
}
