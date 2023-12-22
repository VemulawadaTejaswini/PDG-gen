import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int[] parent;//union-find用
	static int[] rank;//union-find用

	public static void main(String[] args) throws IOException {
		//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//		String W	 = in.readLine();
		//		int num = Integer.parseInt(W.split(" ")[0]);

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] X = new int[N];
		int[] Y = new int[N];
		char[] U = new char[N];
		int[] zet = new int[N];
		int[] huZet = new int[N];
		boolean[] zetPut = new boolean[200001];
		boolean[] huZetPut = new boolean[200001];
		boolean[] xPut = new boolean[200001];
		boolean[] yPut = new boolean[200001];

		Map<Integer, ArrayList<Integer>> zMap = new HashMap<>();
		Map<Integer, ArrayList<Integer>> xMap = new HashMap<>();
		Map<Integer, ArrayList<Integer>> yMap = new HashMap<>();
		Map<Integer, ArrayList<Integer>> huMap = new HashMap<>();

		for(int i = 0;i<N ; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			U[i] = sc.next().charAt(0);
			zet[i] = Math.abs(X[i] - Y[i]);
			huZet[i] = Math.abs(X[i]*-1 - Y[i]);

			ArrayList<Integer> xList;
			if(!xPut[X[i]]) {
				xList = new ArrayList<>();
				xPut[X[i]] = true;
			}else {
				xList = xMap.get(X[i]);
			}
			xList.add(i);
			xMap.put(X[i], xList);

			ArrayList<Integer> yList;
			if(!yPut[Y[i]]) {
				yList = new ArrayList<>();
				yPut[Y[i]] = true;
			}else {
				yList = yMap.get(Y[i]);
			}
			yList.add(i);
			yMap.put(Y[i], yList);

			ArrayList<Integer> zetList;
			if(!zetPut[zet[i]]) {
				zetList = new ArrayList<>();
				zetPut[zet[i]] = true;
			}else {
				zetList = zMap.get(zet[i]);
			}
			zetList.add(i);
			zMap.put(zet[i], zetList);


			ArrayList<Integer> huZetList;
			if(!huZetPut[huZet[i]]) {
				huZetList = new ArrayList<>();
				huZetPut[huZet[i]] = true;
			}else {
				huZetList = huMap.get(huZet[i]);
			}
			huZetList.add(i);
			huMap.put(huZet[i], huZetList);
		}

		ans = Integer.MAX_VALUE;

		for(int i = 0; i<N; i++) {

			if(zMap.containsKey(zet[i])){

				char targetDir = 'a';
				switch(U[i]) {
				case 'U': targetDir = 'L';
				break;
				case 'L': targetDir = 'U';
				break;
				case 'D': targetDir = 'R';
				break;
				case 'R': targetDir = 'D';
				break;
				}
				for(int n:zMap.get(zet[i])) {
					switch(U[i]) {
					case 'U':
						if(X[i] > X[n]) {
							continue;
						};
					case 'L':
						if(X[i] < X[n]) {
							continue;
						};
					case 'D':
						if(X[i] < X[n]) {
							continue;
						};
					case 'R':if(X[i] > X[n]) {
						continue;
					};
					}
					if(i!=n && U[n] == targetDir) {
						ans = Integer.min(ans, Math.abs((X[n]-X[i])*10));
					}
				}
			}

			if(huMap.containsKey(huZet[i])){

				char targetDir = 'a';
				switch(U[i]) {
				case 'U': targetDir = 'R';
				break;
				case 'R': targetDir = 'U';
				break;
				case 'D': targetDir = 'L';
				break;
				case 'L': targetDir = 'D';
				break;
				}
				for(int n:huMap.get(huZet[i])) {
					switch(U[i]) {
					case 'U':
						if(X[i] > X[n]) {
							continue;
						};
					case 'L':
						if(X[i] < X[n]) {
							continue;
						};
					case 'D':
						if(X[i] < X[n]) {
							continue;
						};
					case 'R':if(X[i] > X[n]) {
						continue;
					};
					}
					if(i!=n && U[n] == targetDir) {
						ans = Integer.min(ans, Math.abs((X[n]-X[i])*10));
					}
				}
			}

			if(U[i] == 'R' || U[i] == 'L') {

				char targetDir = 'R';
				if(U[i] == 'R') {
					targetDir ='L';
				}
				for(int n:yMap.get(Y[i])) {
					if(i!=n && U[n] == targetDir) {
						ans = Integer.min(ans, Math.abs(X[n]-X[i])*5);
					}

				}
			}else{

				char targetDir = 'U';
				if(U[i] == 'U') {
					targetDir ='D';
				}
				for(int n:xMap.get(X[i])) {
					if(i!=n && U[n] == targetDir) {
						ans = Integer.min(ans, Math.abs(Y[n]-Y[i])*5);
					}
				}

			}
		}
		if(ans == Integer.MAX_VALUE) {
			System.out.println("SAFE");
		}else {
			System.out.println(ans);
		}
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
