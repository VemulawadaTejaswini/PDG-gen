import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力

		String S = sc.next();
		long mod = 1000000007;
		String ABC = "ABC";
		long[][] dp = new long[S.length()][4];


		if(S.charAt(0) == '?'){					//初期値
			dp[0][0] = 3;
		}else{
			dp[0][0] = 1;
		}

		if(S.charAt(0) == 'A' || S.charAt(0) == '?'){
			dp[0][1] = 1;
		}


		for(int i = 1;i < S.length();i++){
			for(int j = 0;j < 4;j++){

				if(j == 0){
					if(S.charAt(i) == 'A' ||S.charAt(i) == 'B'||S.charAt(i) == 'C'){
						dp[i][0] = dp[i-1][0];
					}else{
						dp[i][0] = dp[i-1][0]*3;
					}

				}else{

					long x = (S.charAt(i) == '?' ? 3L : 1L);				//?だったら３、他は１
					long y =( (S.charAt(i) == ABC.charAt(j-1)|| S.charAt(i) == '?') ? 1L :0);

					dp[i][j] = (dp[i-1][j] * x) + (dp[i-1][j-1]*y); 
					dp[i][j] %=mod;
				}
			}


		}
		//		for(int f= 0;f < S.length();f++){
		//			for(int g = 0;g < 4;g++){
		//				System.out.print(dp[f][g]);
		//			}
		//			System.out.println();
		//		}
		//		System.out.println();


		System.out.println(dp[S.length()-1][3]);
	}

}