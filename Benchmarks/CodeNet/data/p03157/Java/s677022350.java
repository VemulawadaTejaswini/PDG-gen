import java.util.*;

class UnionFind {
	int[] roots;
	int[] sameSetCnt;
	
	public UnionFind(int N) {
		roots = new int[N];
		sameSetCnt = new int[N];
		for(int i = 0; i < N; ++i) {
			roots[i] = i;
			sameSetCnt[i] = 1;
		}
	}
	
	int getRoot(int x) {
		if(roots[x] == x) return x;
		else return roots[x] = getRoot(roots[x]);
	}
	
	boolean isSameSet(int x, int y) {
		return getRoot(x) == getRoot(y);
	}
	
	void unite(int x, int y) {
		int rx = getRoot(x);
		int ry = getRoot(y);
		if(rx == ry) return;
		
		if(sameSetCnt[rx] < sameSetCnt[ry]) {
			int tmp = rx;
			rx = ry;
			ry = tmp;
		}
		sameSetCnt[rx] += sameSetCnt[ry];
		roots[ry] = rx;
	}
	
	int getSameSetNum(int i) {
		return sameSetCnt[getRoot(i)];
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int h = 0;
	static int w = 0;
	static char[][] grids = null;
	static boolean[][] hasVisited = null;
	static int[][] bnum = null;
	static UnionFind uf = null;
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		h = sc.nextInt();
		w = sc.nextInt();
		grids = new char[h][w];
		hasVisited = new boolean[h][w];
		for(int i = 0; i < h; ++i) grids[i] = sc.next().toCharArray();
		
		uf = new UnionFind(h * w);
		bnum = new int[h][w];
		// 黒と白が隣接する各箇所に辺を張る
		for(int y = 0; y < h; ++y) {
			for(int x = 0; x < w; ++x) {
				dfs(y, x);
			}
		}
		
		// 各連結成分について選ぶ組み合わせの数を足していく
		long ans = 0;
		for(int i = 0; i < h * w; ++i) {
			if(uf.getRoot(i) == i) {
				int bn = bnum[i / w][i - i / w * w];
				int wn = uf.getSameSetNum(i) - bn;
				ans += 1L * bn * wn;
			}
		}
		System.out.println(ans);
	}
	
	static boolean isOutside(int y, int x) {
		return y < 0 || h <= y || x < 0 || w <= x;
	}
	
	static void dfs(int sy, int sx) {
		// 訪問済みなら何もせず終了
		if(hasVisited[sy][sx]) return;
		
		// 自身のマスに訪問済みの印をつける
		hasVisited[sy][sx] = true;
		
		// 自身のマスの色
		char self = grids[sy][sx];
		
		// 黒マスならば連結成分の根のカウントを1増やす
		if(self == '#') {
			int ufRootIndex = uf.getRoot(w * sy + sx);
			++bnum[ufRootIndex / w][ufRootIndex - ufRootIndex / w * w];
		}
		
		// 上下左右のマスを見る
		for(int i = 0; i < 4; ++i) {
			int oy = sy + dy[i];
			int ox = sx + dx[i];
			
			// 範囲外ならばスキップ
			if(isOutside(oy, ox)) continue;
			
			// 相手のマスの色
			char other = grids[oy][ox];
			if(self != other) {
				// 自身と相手の色が異なれば辺を張る
				int selfIndex = w * sy + sx;
				int otherIndex = w * oy + ox;
				uf.unite(selfIndex, otherIndex);
				
				// 相手のマスに関してDFS
				dfs(oy, ox);
			}
		}
	}
}