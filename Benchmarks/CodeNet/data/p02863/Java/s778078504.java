import java.util.ArrayList;
import java.util.Collections;
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
		int t = sc.nextInt();

		int[][] dp = new int[n+1][t+1];				//i番目までの料理で、j分以内に完食できる美味しさの合計の最大値

		ArrayList<Pair> pairs = new ArrayList<Pair>();

		for(int i = 0;i < n;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			Pair pair = new Pair(a, b);
			pairs.add(pair);

		}
		Collections.sort(pairs);

//		for(int i = 0;i < n;i++){
//			Pair pair = pairs.get(i);
//			System.out.println(pair.from + " " + pair.end);
//		}

		int ans = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < t;j++){
				int time = pairs.get(i).from;
				int content = pairs.get(i).end;
				if(i == 0){
					if(j-time >= 0){
						dp[i][j] =  content;
						ans = Math.max(ans, dp[i][j]);
					}
				}else{
					if(j-time >= 0){
						dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-time] + content);
					}
				}
			}
		}
		
		for(int i = 1;i < n;i++){
			ans = Math.max(ans, dp[i-1][t-1] + pairs.get(i).end);
		}
		
//	
//		for(int i = 0;i <= n;i++){
//			for(int j = 0;j < t;j++){
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(ans);






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




