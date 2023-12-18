import java.util.Scanner;

class Main{
	static int[][] dp;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		long pow = 1000000007;
		for(int i = 0;i < h;i++){
			String a = sc.next();
			for(int j = 0;j < w;j++){
				map[i][j] = a.charAt(j);
			}
		}
		//		for(int i = 0;i < h;i++){
		//			for(int j = 0;j < w;j++){
		//				System.out.print(map[i][j]);
		//			}
		//			System.out.println();
		//		}
		//		
		long[][] dp  = new long[h][w];		//dp[i][j] = i,jにくる道の総数
		for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
				if(i == 0){
					if(j == 0){
						dp[i][j] = 1%pow;
					}else{
						if(map[i][j-1] != '#'){
							dp[i][j] = dp[i][j-1]%pow;
						}
					}

				}else{
					if(j == 0){
						if(map[i-1][j] != '#')
							dp[i][j] =dp[i-1][j]%pow; 
					}else{
						if(map[i-1][j] != '#'){
							dp[i][j] += dp[i-1][j]%pow; 
						}
						if(map[i][j-1] != '#'){
							dp[i][j] += dp[i][j-1]%pow; 
						}

					}
				}
			}
		}
		//		for(int i = 0;i < h;i++){
		//					for(int j = 0;j < w;j++){
		//						System.out.print(dp[i][j]);
		//					}
		//					System.out.println();
		//				}



		System.out.println(dp[h-1][w-1]%pow);


	}

}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

