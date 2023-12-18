import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		//方針
		//数字とindexをpairとかで持っておき、数字ソート
		//loop
		//大きい順に、自分より大きい数字を一つ含む時の左と右の候補を計算
		//Treesetに自分のindexを入れる
		//loop
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> queues = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i < n;i++){
			ArrayList<Integer> queue = new ArrayList<Integer>();
			for(int j = 0;j < n-1;j++){
				int num = sc.nextInt()-1;
				queue.add(num);
			}
			queues.add(queue);
		}

		int count = 0;
		while(!ok(queues)){
			boolean[] used = new boolean[n];
			boolean isdelete = false;
			for(int i = 0;i < n;i++){
				if(!used[i] && queues.get(i).size() != 0){
					int teki = queues.get(i).get(0);

					if(queues.get(teki).get(0) == i && !used[teki]){
						isdelete = true;
						used[teki] = true;
						queues.get(i).remove(0);
						queues.get(teki).remove(0);
//						System.out.println("i teki" + i + " " + teki);

					}
					used[i] = true;
//					System.out.println(teki);
				}
			}
			if(!isdelete){
				System.out.println(-1);
				return;
			}
			
			count++;
			if(count > 10){
				break;
			}
			
		}
		System.out.println(count);




	}
	
	static boolean ok(ArrayList<ArrayList<Integer>> queues){
		for(int i = 0;i < queues.size();i++){
			if(queues.get(i).size() != 0){
				return false;
			}
				
		}
		
		return true;
		
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




