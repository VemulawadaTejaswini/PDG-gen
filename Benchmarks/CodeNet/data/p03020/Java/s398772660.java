import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
	static long startTime = System.currentTimeMillis();
	static SplittableRandom rnd = new SplittableRandom(42);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> rx = new ArrayList<>();
	static ArrayList<Integer> ry = new ArrayList<>();
	static ArrayList<Integer> bx = new ArrayList<>();
	static ArrayList<Integer> by = new ArrayList<>();
	static double cooler;

	public static void main(String[] args) {
		int N = sc.nextInt();
		int maxCoord = 0;
		for (int i = 0; i < N; i++) {
			int RX = sc.nextInt();
			int RY = sc.nextInt();
			int RC = sc.nextInt();
			maxCoord = Math.max(maxCoord, RX);
			maxCoord = Math.max(maxCoord, RY);
			for (int j = 0; j < RC; j++) {
				rx.add(RX);
				ry.add(RY);
			}
		}
		int M = rx.size();
		int[] map = new int[M];
		int[] rmap = new int[M];
		for (int i = 0; i < N; i++) {
			int BX = sc.nextInt();
			int BY = sc.nextInt();
			int BC = sc.nextInt();
			maxCoord = Math.max(maxCoord, BX);
			maxCoord = Math.max(maxCoord, BY);
			for (int j = 0; j < BC; j++) {
				map[bx.size()] = bx.size();
				rmap[bx.size()] = bx.size();
				bx.add(BX);
				by.add(BY);
			}
		}
		cooler = 1.0 / maxCoord;
		long ans = 0;
		for (int i = 0; i < M; i++) {
			ans += Math.abs(bx.get(i) - rx.get(i)) + Math.abs(by.get(i) - ry.get(i));
		}
		long cur = ans;
		for (int turn = 0; ; turn++) {
			if ((turn & 0xFFF) == 0) {
				if (System.currentTimeMillis() - startTime > 4600) {
					break;
				}
				cooler *= 1.001;
			}
			int bi1 = turn % M;
			int ri2 = rnd.nextInt(M);
			int ri1 = map[bi1];
			int bi2 = rmap[ri2];
			long diff = 0;
			diff -= Math.abs(bx.get(bi1) - rx.get(ri1)) + Math.abs(by.get(bi1) - ry.get(ri1));
			diff -= Math.abs(bx.get(bi2) - rx.get(ri2)) + Math.abs(by.get(bi2) - ry.get(ri2));
			diff += Math.abs(bx.get(bi1) - rx.get(ri2)) + Math.abs(by.get(bi1) - ry.get(ri2));
			diff += Math.abs(bx.get(bi2) - rx.get(ri1)) + Math.abs(by.get(bi2) - ry.get(ri1));
			if (accept(diff)) {
				cur += diff;
				if (ans < cur) {
					ans = cur;
				}
				map[bi1] = ri2;
				map[bi2] = ri1;
				rmap[ri1] = bi2;
				rmap[ri2] = bi1;
			}
		}
		System.out.println(ans);
	}

	static boolean accept(long diff) {
		if (diff >= 0) return true;
		diff *= cooler;
		if (diff < -10) return false;
		return rnd.nextDouble() < Math.exp(diff);
	}

}
