import java.util.ArrayList;
import java.util.*;

class Main{
	public static void main(String[] args){

		//permutation
		List<Integer> perm = new ArrayList<>();
		//swap pair
		UnionFind unionFind;

		//Count
		int count = 0;

		Scanner scan = new Scanner(System.in);

		//scan
		String[] maxCount = scan.nextLine().split(" ");
		//permutation size
		int permMax = Integer.parseInt(maxCount[0]);
		unionFind = new UnionFind(permMax);
		//pair size
		int pairMax = Integer.parseInt(maxCount[1]);

		String[] strPerms = scan.nextLine().split(" "); 

		//string to int
		for(String strPerm : strPerms){
			perm.add(Integer.parseInt(strPerm));
		}

		//set pair
		for(int i = 0; i < pairMax; i++){

			String[] pairs = scan.nextLine().split(" ");
			int x = Integer.parseInt(pairs[0]) - 1;
			int y = Integer.parseInt(pairs[1]) - 1;
			unionFind.union(x, y);
		}

		//sum
		for(int x = 0; x < perm.size(); x++){

			int value = x + 1;
			//添字の要素と一致した場合
			if(value == perm.get(x)){
				count++;
				continue;

			}

			//一致しなかった場合
			//swap可能な範囲がある場合に検索	
			if(unionFind.same(x, perm.get(x) - 1)){
				count++;
				continue;
			}
		}

		System.out.println(count);

	}
}

class UnionFind{
	int par[];
	int rank[];

	public UnionFind(int size){
		par = new int[size];
		rank = new int [size];

		for(int i = 0; i < size; i++){
			par[i] = i;
			rank[i] = 0;
		}
	}

	/**
	 *rootを探すメソッドです。
	 *
	 */
	int find(int x){
		if(x == par[x]){
			return x;
		}else{
			par[x] = find(par[x]);
			return par[x];
		}
	}

	/**
	 * 木を繋げるメソッドです。
	 */
	void union(int x, int y){

		int rootX = find(x);
		int rootY = find(y);

		//同じ根、つまりxとyが同じ木の時
		if(rootX == rootY){
			return;
		}	

		//木をつなげる
		if(rank[rootX] > rank[rootY]){
			//xの方がyよりも階層が深いとき
			//yの根をxの根につなげる
			par[rootY] = rootX;
		}else{
			//それ以外は
			//xの根をyの根につなげる
			par[rootX] = rootY;

			//xとyの階層が同じ場合
			//yの階層を一つ増やす
			if(rank[rootX] == rank[rootY]){
				rank[rootY]++;
			}
		}
	}

	/**
	 * 同じ木に属しているか調べる
	 */
	boolean same(int x, int y){
		int rootX = find(x);
		int rootY = find(y);
		return rootX == rootY;
	}
}