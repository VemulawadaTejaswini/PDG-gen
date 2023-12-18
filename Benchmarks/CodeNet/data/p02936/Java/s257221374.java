import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;

	static	ArrayList<TreeNode> tree;
	static HashSet<Integer> set;
	static int[] ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		tree = new ArrayList<TreeNode>();
		
//		for(int i = 0;i < n;i++){
//			TreeNode node = new TreeNode(i, 0);
//			tree.add(node);
//		}
		
		for(int i = 0;i < n-1;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
//			tree.get(a).childlen.add(tree.get(b));			//子ノードの追加
//			tree.get(b).childlen.add(tree.get(a));			//子ノードの追加

		}

		for(int i = 0;i < q;i++){
			int p = sc.nextInt()-1;
			int x = sc.nextInt();
//			tree.get(p).sum += x;
		}
		int counter = 0;
		
		ans = new int[n];
		set = new HashSet<Integer>();
		set.add(0);
	//	dfs(0, 0);
		
		
		
		for(int i = 0;i < n;i++){
			System.out.println(ans[i]);
		}





	}

	static void dfs(int current,int num){

		ans[current] = num + tree.get(current).sum;
		set.add(current);
		for(TreeNode child:tree.get(current).childlen ){
			if(ans[child.value]== 0){
				dfs(child.value, num +tree.get(current).sum);
			}
		}

	}





	static int upperbond(int k,int min,int[] data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int max = data.length;
		//		if(min == data.length-1){
		//			if(data[min] > k){
		//				return min;
		//			}
		//		}

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}

		return max;
	}

	static int lowerbond(int k,int min,int[] data){		//kより大きい最小の値をdataの中から探し、返す二分探索
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return min;
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}

class TreeNode{
	int value;
	int sum;
	ArrayList<TreeNode> childlen;

	public TreeNode(int v,int s) {
		this.value = v;
		this.sum = s;
		this.childlen = new ArrayList<TreeNode>();
	}


}


class Edge  implements Comparable{

	int index;
	HashSet<Integer> hen;
	HashSet<Integer> used;
	HashMap<Integer, Integer> map;
	int size;


	public Edge(int index) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.index = index;
		hen = new HashSet();
		used = new HashSet<Integer>();
		map = new HashMap<Integer,Integer>();
	}

	public int compareTo(Object other) {
		Edge otherpair = (Edge)other;

		return   otherpair.hen.size() - hen.size();
	}
}

class Food implements Comparable{

	int minits;
	int score;
	double cospa;

	public Food(int from,int end,double c) {
		this.minits = from;
		this.score = end;
		this.cospa = c;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Food otherpair = (Food)other;
		int dif = Double.compare(otherpair.cospa, cospa);
		return   dif;
	}

}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int from,int end) {
		this.from = from;
		this.end = end;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  from - otherpair.from;
	}








}




