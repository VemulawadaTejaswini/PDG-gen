import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions25= {{-2,-2},{-2,-1},{-2,0},{-2,1},{-2,2},{-1,-2},{-1,-1},{-1,1},{-1, 2}
	,{0,-2},{0,2},{1,-2},{1,-1},{1,1},{1,2},{2,-2},{2, -1},{2,0},{2,1},{2,2}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int[] parent;//union-find用
	static int[] rank;//union-find用
	static int[][] warp;
	static Queue<int[]> q;
	static int H;
	static int W;
	static int Dh;
	static int Dw;
	static char[][] S;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();

		int[] h = new int[H];
		int[] w = new int[W];
		boolean[][] exists = new boolean[H][W];

		for(int i = 0;i<M ; i++) {
			int nowH =sc.nextInt()-1;
			int nowW =sc.nextInt()-1;
			h[nowH]++;
			w[nowW]++;
			exists[nowH][nowW] = true;
		}

		int maxH = 0;
		int maxW = 0;
		List<Integer> selectedH = new ArrayList<Integer>();
		List<Integer> selectedW = new ArrayList<Integer>();

		for(int i = 0;i<H ; i++) {
			if(maxH < h[i] ) {
				maxH = h[i];
				selectedH.clear();
				selectedH.add(i);
			}else if(maxH == h[i]) {
				selectedH.add(i);
			}
		}
		for(int i = 0;i<W ; i++) {
			if(maxW < w[i] ) {
				maxW = w[i];
				selectedW.clear();
				selectedW.add(i);
			}else if(maxW == w[i]) {
				selectedW.add(i);
			}
		}

		boolean allExist = true;

		for(int sH:selectedH) {
			for(int sW: selectedW) {
				if(!exists[sH][sW]) {
					allExist = false;
				}
			}
		}
		ans = maxH + maxW;

		if(allExist) {
			ans--;
		}


		System.out.println(ans);
	}


	public static void walk(int nowH, int nowW, int warped) {
		if(nowH < 0 || nowH >= H || nowW <0 || nowW >= W || S[nowH][nowW] == '#' || warped >= warp[nowH][nowW]) {
			return;
		}
		if(nowH == Dh && nowW == Dw && ans > warped) {
			ans = warped;
		}
		int[] now = {nowH, nowW, warped};
		q.add(now);
		warp[nowH][nowW] = warped;
		for(int i = 0;i<4 ; i++) {
			walk(nowH+directions4[i][0], nowW+directions4[i][1], warped);
		}
	}
	//	public static void warp(int nowH, int nowW, int warped) {
	//
	//
	//
	//
	//	}

	//素数判定
	public static boolean isPrime(long num) {
		if (num < 2) return false;
		else if (num == 2) return true;
		else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2)
		{
			if (num % i == 0)
			{
				// 素数ではない
				return false;
			}
		}

		// 素数である
		return true;
	}

	//BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray){
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedArray[mid]<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList){
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedList.get(mid)<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}

	//Union-Find用の配列を要素数nで初期化
	static void ufInit(int n){
		parent = new int[n];
		rank = new int[n];
	}

	//Union-Findの要素の最上位の親（グループ名）を返す
	static int ufFind(int a) {
		if(parent[a]==a) {
			return a;
		}else {
			return ufFind(parent[a]);
		}
	}

	//Union-Find木を連結する
	static void ufUnite(int a, int b) {
		a = parent[a];
		b = parent[b];

		if(a==b) {
			return;
		}
		if(rank[a] > rank[b]){
			parent[b]=a;
		}else {
			parent[a]=b;
			if(rank[a]==rank[b]) {
				rank[b]++;
			}
		}
	}

	static boolean ufSame(int a, int b) {
		return ufFind(a)==ufFind(b);
	}
}
