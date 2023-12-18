import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0;
		long mod = 1000_000_007;
		
		c = new long[n+2][n+2];
		c[0][0] = 1;
		for(int i = 0;i < n+1;i++){
			for(int j = 0;j <= i;j++){
				c[i+1][j] += c[i][j];
				c[i+1][j+1] += c[i][j];
			}
		}
		
		for(int i = 1;i <= k;i++){
			System.out.println((c[n-k+1][i] * c[k-1][i-1] % mod));
		}
		

		
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







	static int find(int index,int current,int[] students,int ans,int[][] memo){
		if(current == index){
			return 1;
		}

		if(memo[current][index] != 0){
			return memo[current][index];
		}

		memo[current][index] = find(index, students[current]-1, students, ans+1, memo)+1;

		return memo[current][index];
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




