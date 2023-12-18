import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		

		if(n % 2 == 0){
			System.out.println(((double)1/2));
		}else{
			System.out.println((double)((double)(n/2+1)/n));
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




