import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		long[][] dp = new long[m+1][1<<n];				//dp[i][j] = i番目までの鍵で状態j(開く宝箱の状態)になる最小費用
		for(int i = 0;i <= m;i++){
			for(int j = 0;j <1<<n;j++){
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		dp[0][0] = 0;
		for(int i = 1;i <= m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int bit = 0;					//bitで開く宝箱の状態を表す
			for(int j = 0;j < b;j++){
				int c = sc.nextInt()-1;
				bit |= (1<<c);
			}
			for(int j = 0;j <1<<n;j++){
				dp[i][j] = dp[i-1][j];
			}
			for(int j = 0;j < 1<<n;j++){
				int next = j|bit;
				dp[i][next] = Math.min(dp[i][next], dp[i-1][j] + a); 
			}
			
			
		}
		long ans = dp[m][(1<<n)-1];
		System.out.println(ans==Integer.MAX_VALUE ?-1:ans);
		
		


		


		




	}
	
	
	static int dfs(int x,int y,int b){
//		
		if(b < 0){
			return 0;
		}
		if(b % 3 != 0){
//			System.out.println(0);
			return 0;
		}
		if(y == 2*x){
//			System.out.println(1);
//			System.out.println(11);

			return 1;
		}else if(y == 0.5*x){
//			System.out.println(1);

			return 1;
		}else if((double)y/x > 2 ||(double)y/x < 0.5){
//			System.out.println(0);
			return 0;
		}else{
			
			int uehazix = b/3;
			int uehaziy = -uehazix + b;
			int sitahazix = 2*b/3;
			int sitahaziy = -uehazix + b;
			if(Math.abs(uehazix - x)== Math.abs(sitahazix - x)){
				return 2*dfs(x-2, y-1, b-3);
			}
			int dif = Math.min(Math.abs(uehazix - x), Math.abs(sitahazix - x));
			
			if(dif == 1){
				return b/3;
			}
			return (dfs(x-2, y-1, b-3) + dfs(x-1, y-2, b-3))%MOD;
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


class Edge extends ArrayList<P>{

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
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   from- otherpair.from;
	}








}




