import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		String ss = sc.next();

		int score = 0;
		for(int i = 0;i < n;i++){
			if(ss.charAt(i) == 'L'){
				if(i != 0 && ss.charAt(i-1) == 'L'){
					score++;
				}
			}else{
				if(i != ss.length()-1 && ss.charAt(i+1) == 'R'){
					score++;
				}
			}
		}

		ArrayList<Pair> block = new ArrayList<Pair>();
		for(int i = 0;i < n;i++){
			if(i == n-1){
				Pair pair = new Pair(i, i);
				block.add(pair);

//				System.out.println(pair.from + " " + pair.end);
			}else if(ss.charAt(i) == ss.charAt(i + 1)){
				int from = i;

				while(i < n-1 && (ss.charAt(i) == ss.charAt(i + 1))){
					i++;
				}
				if(i == n){
					i--;
				}
				int end = i;
				Pair pair = new Pair(from, end);
				block.add(pair);
//				System.out.println(pair.from + " " + pair.end);
			}else{
				Pair pair = new Pair(i, i);
				block.add(pair);
//				System.out.println(pair.from + " " + pair.end);

			}
		}
				
				
				
				int leftindex = block.size()/2;
				int rightindex = block.size()/2;
				int left = block.get(leftindex).from;;
				int right = block.get(rightindex).end;
		
				

				while(!(left == 0 && right == n-1) && k > 0){
//					System.out.println("left " + left + " leftindex " + leftindex + " right " + right + " rightindex " + rightindex);
					if(left == 0 || right == n-1){
						score++;
						if(left == 0){
							rightindex++;
							right = block.get(rightindex).end;
						}else{
							leftindex--;
							left = block.get(leftindex).from;
						}
					}else{
						score += 2;
						leftindex--;
						rightindex++;
						left = block.get(leftindex).from;
						right = block.get(rightindex).end;
						
					}
					k--;
				}
				

		System.out.println(score);











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

		return   from- otherpair.from;
	}








}




