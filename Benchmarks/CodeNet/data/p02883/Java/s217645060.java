import java.util.Arrays;
import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long k = sc.nextLong();

		int[] a = new int[n];
		int[] f = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++){
			f[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(f);
		for(int i = 0;i < n/2;i++){
			int tmp = f[i];
			f[i] = f[n-i-1];
			f[n-i-1] = tmp;
		}
		if(isvail(0, n, a, f, k)){
			System.out.println(0);
			return;
		}
		
		long left = 0;
		long right = 100000000*1000000000;

		while(right - left > 1){
			//System.out.println(left + " l");
			long mid = (left + right)/2;
			if(!isvail(mid, n, a, f, k)){
				left = mid;
			}else{
				right = mid;
			}
			
		}
		System.out.println(right);




	}
	
	static boolean isvail(long num,int n,int[] a,int[] food,long k){
		long sum = 0;
		for(int i = 0;i < n;i++){
			long dif = num/food[i];
			sum += Math.max(0, a[i]-dif);
		}
		return sum <= k;
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




