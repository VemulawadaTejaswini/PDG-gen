import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if(w == 0){
				break;
			}
			
			char[][] input = new char[h][w];
			
			for(int i = 0; i < h; i++){
				String str = sc.next();
				
				for(int j = 0; j < w; j++){
					input[i][j] = str.charAt(j);
				}
			}
			
			String[][] dp = new String[h][w];
			
			for(int i = 0; i < h ; i++){
				Arrays.fill(dp[i], "");
			}
			
			String result = "0";
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(!Character.isDigit(input[i][j])){
						continue;
					}
					
					String uNum = "";
					String lNum = "";
					
					if(i != 0 && !dp[i - 1][j].equals("0")){
						uNum = dp[i - 1][j];
					}
					
					if(j != 0 && !dp[i][j - 1].equals("0")){
						lNum = dp[i][j - 1];
					}
					
					uNum += input[i][j];
					lNum += input[i][j];
					
					String tmp = comp(uNum, lNum);
					dp[i][j] = tmp;
					
					result = comp(result, tmp);
				}
				
			}
			
			//debug
//			for(int i = 0; i < h; i++){
//				for(int j = 0; j < w; j++){
//					System.out.print(dp[i][j]+" ");
//				}
//				System.out.println();
//			}
			System.out.println(result);
		}
	}
	
	static String comp(String str1, String str2){
		if(str1.length() > str2.length()){
			return str1;
		}
		else if(str1.length() < str2.length()){
			return str2;
		}
		
		//文字列の長さが等しい場合の処理
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) > str2.charAt(i)){
				return str1;
			}
			else if(str1.charAt(i) < str2.charAt(i)){
				return str2;
			}
		}
		
		return str1;
	}

}

