import java.util.*;

class Main {
	Scanner sc;
	int H, W, K;
	String[] S;
	int[][] rc;
	
	void calc() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		K = sc.nextInt();
		S = new String[H];
		for (int i = 0; i < H; i++)
			S[i] = sc.next();
		rc = new int[W+1][H];
		for (int i = 0; i < H; i++) {
			int c = 0;
			for (int j = 0; j < W; j++) {
				if (S[i].charAt(j) == '1') c++;
				rc[j+1][i] = c;
			}
		}
		
		int n = 1 << (H-1);
		int oc = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			oc = Math.min(oc, count(i));
		}
		System.out.println(oc);
	}
	
	private int count(int bitpat) {
		int hOp = 0;
		int last = 0;
		for (int i = 0; i < W; i++) {
			if (maxCountPart(bitpat, last, i) > K) {
				hOp++;
				if (last == i) return Integer.MAX_VALUE;
				last = i;
			}
		}
		return hOp + Integer.bitCount(bitpat);
	}
	
	private int maxCountPart(int bitpat, int from, int to) {
		int max = -1;
		int c = 0;
		for (int i = 0; i < H; i++) {
			c += rc[to+1][i] - rc[from][i];
			if ( ((1<<i)&bitpat) != 0 ) {
				max = Math.max(max, c);
				c = 0;
			}
		}
		return Math.max(max, c);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
