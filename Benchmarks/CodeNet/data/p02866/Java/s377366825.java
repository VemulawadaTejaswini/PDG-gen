import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0;i < n;i++){
			d[i] = sc.nextInt();
		}

		if(d[0] != 0){
			System.out.println(0);
			return;
		}
		Arrays.sort(d);
		
		
		int[] num = new int[d[n-1]+1];
		for(int i = 0;i < n;i++){
			num[d[i]]++;
		}
		
//		for(int i = 0;i < 3;i++){
//			System.out.println(num[i]);
//		}
		
		long ans = 1;
		int len = d[n-1];
		long tmp = 1;
		for(int i = 1;i <= len;i++){

			long x = tmp;
			for(int j = 0;j < num[i]-1;j++){
				tmp *= (x % 998244353);
				tmp %= 998244353;
			}
//			tmp = (long)Math.pow(tmp, num[i]);
			
			ans *= tmp%998244353;
			tmp = num[i];
		//	System.out.println(tmp + " " + num[i]);

		}
		
		
		System.out.println(ans%998244353);
		



	}



	static int upperbond(int k, ArrayList<Integer> data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.size();

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) > k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data.get(max);
	}

	static int lowerbond(int k, ArrayList<Integer> data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.size();

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data.get(min);
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



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}








}




