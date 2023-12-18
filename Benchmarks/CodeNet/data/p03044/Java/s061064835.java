import java.util.*;


import java.io.*;

public class Main {
	private static void solve(){
		//Implement solution here.
		int n = ni();
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < n - 1; i++) {
			uf.unite(ni() - 1, ni() - 1, ni());
		}
		uf.fillWightSum();
		
		for(int i = 0; i < n; i++) {
			if(uf.weightSum[i] % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}

	}

	static class UnionFind{
		//Union find tree
		private int size;
		private int[] par;
		private int[] rank;
		public long[] weight;
		public long[] weightSum;


		public UnionFind(int size) {
			this.size = size;
			this.par = new int[size];
			this.rank = new int[size];
			this.weight = new long[size];
			this.weightSum = new long[size];

			for(int i = 0; i < size; i++) {
				par[i] = i;
				rank[i] = 0;
				this.weight[i] = 0;				
			}
		}
		/**
		 * Get parent node number of x 
		 * @param x 
		 * @return
		 */
		public int root(int x) {
			if(par[x] == x) {
				return x;
			} else {
				return root(par[x]);
			}
		}

		/**
		 * Get weight summary between root and x
		 * Ex.Get distance from root node
		 * @param x
		 * @param w
		 * @return
		 */
		private void getWeightSum(int x, long w, List<Integer> xl, List<Long> wl) {
			if(par[x] == x) {
				weightSum[x] = 0;
				for(int i = 0; i < xl.size(); i++) {
					weightSum[xl.get(i)] = wl.get(i);
				}
			} else if(weightSum[x] > 0) {
				for(int i = 0; i < xl.size(); i++) {
					weightSum[xl.get(i)] = wl.get(i) + weightSum[x];
				}
			} else {
				xl.add(x);
				wl.add(w + weight[x]);
				getWeightSum(par[x], w + weight[x],xl,wl);
			}
		}

		public void fillWightSum() {
			for(int i = 0; i < size; i++) {
				if(weightSum[i] == 0 && par[i] != i) {
					getWeightSum(i, 0, new ArrayList<Integer>(), new ArrayList<Long>());
				}
			}
		}

		/**
		 * Unite groups x and y belongs
		 * @param x
		 * @param y
		 */
		public void unite(int x, int y, int w) {
			int xroot = root(x);
			int yroot = root(y);
			if(xroot == yroot) {
				return;
			}else {
				if(rank[xroot] < rank[yroot]) {
					par[xroot] = y;
					weight[x] = w;
				} else {
					par[yroot] = x;
					weight[y] = w;
					if(rank[xroot] == rank[yroot]) rank[xroot] ++;
				}
			}
		}

		/**
		 * Confirm whether 2 nodes belongs to same group.
		 * @param x
		 * @param y
		 * @return
		 */
		public boolean sameGroup(int x, int y) {
			return root(x) == root(y);
		}		
	}

	//Switch input source (stdin/file)
	private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		} 
		solve();
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	//Get next int array from one line
	private static Integer[] nao(int n) {
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}