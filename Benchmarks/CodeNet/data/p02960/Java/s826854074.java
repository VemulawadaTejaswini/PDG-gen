import java.util.Scanner;
class Main{


	static char[][] map;
	static final int MOD = 1000000007;


	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		char[] cs = sc.next().toCharArray();


		for(int i = 0;i < cs.length/2;i++){			//逆じゅん
			char tmp = cs[i];
			cs[i] = cs[cs.length-1-i];	
			cs[cs.length-1-i] = tmp;
		}
		long[][] dp = new long[cs.length+1][13];
		dp[0][0] = 1;

		int keta = 1;
		for(int i = 0;i < cs.length;i++){
			int num = -1;
			if(cs[i] != '?'){
				num = cs[i] - '0';
			}
			
			if(num != -1){
				for(int j = 0;j < 13;j++){
					int m = (keta*num%13 + j)%13;
					dp[i+1][m] += dp[i][j]%MOD;
					dp[i+1][m] %= MOD;
				}
			}else{
				for(int k = 0;k < 10;k++){
					for(int j = 0;j < 13;j++){
						int m = (keta*k%13 + j)%13;
						m %= 13;
						dp[i+1][m] += dp[i][j]%MOD;
						dp[i+1][m] %= MOD;
					}
				}
			}
			
			keta *= 10;
			keta %= 13;
		}
		
		System.out.println(dp[cs.length][5]);


//		for(int i = 0;i < dp.length;i++){
//			for(int j = 0;j < 13;j++){
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}



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




