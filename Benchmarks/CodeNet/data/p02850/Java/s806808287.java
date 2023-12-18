import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
class Main{


	static final int MOD = 1000000007;


	static ArrayList<ArrayList<Pair>> map;
	static TreeMap<Integer,Integer> ans; 
	static int maxnum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		map = new ArrayList<ArrayList<Pair>>();
		ans = new TreeMap<Integer,Integer>();

		for(int i = 0;i < n;i++){
			ArrayList<Pair> node = new ArrayList<Pair>();
			map.add(node);
		}

		for(int i = 0;i < n-1;i++){			//木の作成
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			map.get(a).add(new Pair(b, i));				//双方向に繋げる		Pair(つなぐ先,id)
			map.get(b).add(new Pair(a, i));
		}

		
		dfs(0, -1, -1);
		
		System.out.println(maxnum+1);
		for(int num:ans.values()){
			System.out.println(num);				
		}




	}

	static void dfs(int current,int before,int beforecolor){

		int color = 0;
		for(int i = 0;i < map.get(current).size();i++){
			Pair pair = map.get(current).get(i);
			int next = pair.from;

			if(next == before){							//無限ループを回避
				continue;
			}
			if(color == beforecolor){					//親ノードで使った色は使えない
				color++;
			}
			int id = pair.end;
			ans.put(id, color+1);
			dfs(next, current,color);
			
			maxnum = Math.max(maxnum, color);
			color++;

			
		}


	}




	static void sieve(ArrayList<Long> list){
		int n = 50000000;
		boolean[] is_prime = new boolean[n+1];
		int[] prime = new int[n];
		for(int i= 0;i <=n;i++){
			is_prime[i] = true;
		}
		list.add((long) 1);
		for(int i = 2;i <= n;i++){
			if(is_prime[i]){
				list.add((long)i);
				for(int j = 2*i;j <= n;j+=i){
					is_prime[j] = false;
				}
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

class Town{
	int index;
	int x ;
	int y;
	public Town(int index,int x,int y) {
		this.index = index;
		this.x = x;
		this.y = y;
		// TODO 自動生成されたコンストラクター・スタブ
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

class P{
	int to;
	long cost;
	P(int to,long cost){
		this.to = to;
		this.cost = cost;
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

		return   otherpair.from - from;
	}








}




