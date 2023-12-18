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

		long X = sc.nextLong();
		long Y = sc.nextLong();

		if((X + Y) % 3 != 0 ){
			System.out.println(0);
		}else if((Y > 3*X) || (Y < X/3)){
			System.out.println(0);
		}else{
			long b = (2*Y-X)/3;
			long a = Y - 2*b;

			long ue = 1;
			for(int i = 1;i <= a+b;i++){
				ue*=i;
				ue%=MOD;
			}
			long sita = 1;
			long first = 1;
			for(int i = 1;i <= a;i++){
				first *= i;
				first %= MOD;
			}
			long second = 1;
			for(int i = 1;i <= b;i++){
				second *= i;
				second %= MOD;
			}

			COMinit();
			System.out.println(COM((int)(a+b), (int)a)%MOD);






		}


	}

	static int MAX = 1000000;

	static long fac[] = new long[MAX];
	static long finv[] = new long[MAX];
	static long inv[] = new long[MAX];



	static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < MAX; i++){
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	// 二項係数計算
	static	long COM(int n, int k){
		if (n < k) return 0;
		if (n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
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




