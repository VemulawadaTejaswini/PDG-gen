
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	boolean[][] use;
	Mat[] mats;

	int H = 1000, R = 1000;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			use = new boolean[H+1][R+1];
			ArrayList<Mat> mats = new ArrayList<Mat>();
			for (int i=0;i<n;i++) mats.add(new Mat(sc.nextInt(), sc.nextInt()));
			
			int m = sc.nextInt();
			for (int i=0;i<m;i++) mats.add(new Mat(sc.nextInt(), sc.nextInt()));
			n += m;
			
			this.mats = mats.toArray(new Mat[]{});
			sort(mats);
			for (Mat mat : mats) use[mat.h][mat.r] = true;
			
			mem = new int[H+1][R+1];
			for (int[] a: mem) fill(a, -1);
			
			System.out.println(solve(H, R));
		}
	}
	
	int[][] mem;
	int solve(int h, int r) {
		if (mem[h][r] >= 0) return mem[h][r];
		
		int max = 0;
		for (int i=0;i<h;i++) for (int j=0;j<r;j++) if (use[i][j]) {
			max = max(max, solve(i, j)+1);
		}
		
		return mem[h][r] = max;
	}
	
	class Mat implements Comparable<Mat>{
		int h, r;
		Mat(int h, int r) {
			this.h = h;
			this.r = r;
		}

		@Override
		public int compareTo(Mat o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			if (h != o.h) return h - o.h;
			return r - o.r;
		}
		
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}