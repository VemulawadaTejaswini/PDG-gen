import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int SZ = 10003;
		int[][] sum = new int[2][SZ];
		while (true) {
			int N = sc.nextInt();
			int R = sc.nextInt();
			if (N == 0) break;
			for (int[] a : sum) {
				Arrays.fill(a, 0);
			}
			ArrayList<ArrayList<Integer>> plus = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> minus = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < SZ; ++i) {
				plus.add(new ArrayList<Integer>());
				minus.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < N; ++i) {
				int x1 = Integer.parseInt(sc.next()) + 1;
				int y1 = Integer.parseInt(sc.next()) + 1;
				int x2 = Integer.parseInt(sc.next()) + 1;
				int y2 = Integer.parseInt(sc.next()) + 1;
				plus.get(y1).add(x1);
				plus.get(y2).add(x2);
				minus.get(y1).add(x2);
				minus.get(y2).add(x1);
			}
			int area = 0;
			int len = 0;
			int t = 1;
			for (int i = 1; i < SZ; ++i) {
				Arrays.fill(sum[t], 0);
				for (int v : plus.get(i)) {
					sum[t][v]++;
				}
				for (int v : minus.get(i)) {
					sum[t][v]--;
				}
				for (int j = 1; j < SZ; ++j) {
					sum[t][j] += sum[1 - t][j] + sum[t][j - 1] - sum[1 - t][j - 1];
					if (sum[t][j] > 0) ++area;
					if (sum[t][j] == 0 ^ sum[1 - t][j] == 0) ++len;
					if (sum[t][j] == 0 ^ sum[t][j - 1] == 0) ++len;
				}
				t ^= 1;
			}
			System.out.println(area);
			if (R == 2) System.out.println(len);
		}
	}
}