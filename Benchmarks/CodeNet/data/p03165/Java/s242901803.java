
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		String a = sc.nextLine();
		int alen = a.length();
		int blen = b.length();
		String[][] dp = new String[alen][blen];
		
		for(int i = 0; i < alen; i ++) {
			String cur = "";
			
			for(int j = 0; j < blen; j++) {
				if(a.charAt(i) == b.charAt(j)) {
//					System.out.println("1 "+ cur);
					cur = cur + "" + a.charAt(i);
					dp[i][j] = cur;
				}else {
					if( i + j == 0 )dp[i][j] = cur;
					else if( i != 0 && j == 0)dp[i][j] = dp[i-1][j];
					else if( i == 0 && j != 0)dp[i][j] = dp[i][j-1];
					else {
//						System.out.println("2 "+ cur);
						if(dp[i-1][j].length() > dp[i][j-1].length()) {
							dp[i][j] = dp[i-1][j];
							cur = dp[i][j];
						}
						else {
//							System.out.println("3 "+ cur);
							dp[i][j] = cur;

						}
					}
					cur = dp[i][j];
				}
//				for(int g = 0; g < alen; g++)System.out.println(Arrays.toString(dp[g]));
//				System.out.println();
			}
		}
		System.out.println(dp[alen-1][blen-1]);
	}
}
