
import static java.util.Arrays.deepToString;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
	
	Scanner sc = new Scanner(System.in);
	
	char[] goal = "0123456789ab0".toCharArray();
	int[] rs = {0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4};
	int[] cs = {2, 1, 2, 3, 0, 1, 2, 3, 4, 1, 2, 3, 2};
	int[] dr = {0, 1, 0, -1};
	int[] dc = {1, 0, -1, 0};
	
	int[][] rm = {
		{-1, -1, -1,-1, -1, -1, -1},
		{-1, -1, -1, 0, -1, -1, -1},
		{-1, -1,  1, 2,  3, -1, -1},
		{-1,  4,  5, 6,  7,  8, -1},
		{-1, -1,  9, 10, 11, -1, -1},
		{-1, -1, -1, 12, -1, -1, -1},
		{-1, -1, -1, -1, -1, -1, -1},
	};
	
	public void run() {
		for (;sc.hasNext();) {
			char[] s = new char[13];
			int x = sc.nextInt();
			if (x == -1) break;
			s[0] = toc(x);
			for (int i = 1; i < 13; i++) {
				s[i] = toc(sc.nextInt());
			}
			Set<String> vis = new HashSet<String>();
			vis.add(new String(s));
			Queue<String> q1 = new ArrayDeque<String>();
			Queue<Integer> q2 = new ArrayDeque<Integer>();
			q1.add(new String(s));
			q2.add(0);
			int ans = -1;
			while (q1.size() > 0) {
				s = q1.poll().toCharArray();
				int step = q2.poll();
//				tr(vis.size(), q1.size(), step);
				if (isGoal(s)) {
					ans = step;
					break;
				}
				
				
				if (step < 20) {
					for (int i = 0; i < s.length; i++) if (s[i] == '0') {
						final int zr = rs[i];
						final int zc = cs[i];
						for (int k = 0; k < 4; k++) {
							int nr = zr + dr[k];
							int nc = zc + dc[k];
							int ni = rm[nr + 1][nc + 1];
							if (ni == -1) continue;
							swap(s, i, ni);
							String nxt = new String(s);
							if (!vis.contains(nxt)) {
								if (step + estimate(s) <= 20) {
									vis.add(nxt);
									q1.add(nxt);
									q2.add(step+1);
								}
							}
							swap(s, i, ni);
						}
					}
				}
			}
			
			if (ans == -1) System.out.println("NA"); else System.out.println(ans);
		}
	}
	int estimate(char[] s) {
		int sum = 0;
		for (int i = 0; i < s.length; i++) if (s[i] != '0') {
			int n = getNum(s[i]);
			int d = Math.abs(rs[i] - rs[n]) + Math.abs(cs[i] - cs[n]);
			sum += d;
		}
		return Math.max(0, sum - 2);
	}
	int getNum(char c) {
		if (c == 'a') return 10;
		if (c == 'b') return 11;
		return c - '0';
	}
	void swap(char[] s, int i, int j) {
		char t = s[i]; s[i] = s[j]; s[j] = t;
	}
	boolean isGoal(char[] s) {
		for (int i = 0; i < s.length; i++) if (s[i] != goal[i]) return false;
		return true;
	}
	char toc(int x) {
		return String.format("%x", x).charAt(0);
	}
}