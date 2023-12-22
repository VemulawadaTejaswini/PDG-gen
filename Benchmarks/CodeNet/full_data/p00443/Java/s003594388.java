import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int mobile[][];
	static int n;
	static int weight[];

	public static int f(int id) {
		if (0 < weight[id]) {
			return weight[id];
		}

		int le = 1;
		int ri = 1;
		if (mobile[id][2] != 0) {
			le = f(mobile[id][2] - 1);
		}
		if (mobile[id][3] != 0) {
			ri = f(mobile[id][3] - 1);
		}
		le *= mobile[id][1];
		ri *= mobile[id][0];
		
		int kle = 1;
		int kri = 1;
		while (true) {
			if (le * kle * mobile[id][0] == ri * kri * mobile[id][1]) {
				break;
			} else if (le * kle * mobile[id][0] < ri * kri * mobile[id][1]) {
				kle++;
			} else {
				kri++;
			}
		}
		
		return weight[id] = le * kle + ri * kri;
	}

	public static int gcd(int x, int y) {
		if (x < y) {
			int swap = x;
			x = y;
			y  =swap;
		}
		if (y == 0) {
			return x;
		}

		return gcd(y, x % y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		mobile = new int[n][4];
		weight = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				mobile[i][j] = sc.nextInt();
			}
			int gcd = gcd(mobile[i][0], mobile[i][1]);
			mobile[i][0] /= gcd;
			mobile[i][1] /= gcd;
		}
		for (int i = 0; i < n; i++) {
			f(i);
		}
		
		Arrays.sort(weight);
		System.out.println(weight[n - 1]);
	}
}