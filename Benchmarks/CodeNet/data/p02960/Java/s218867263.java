import java.util.Scanner;

public class Main {

	int mod = 1000000007;
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		sc.close();
		
		int[][] dp = new int[pattern.length()][13];
		
		char firstChar = pattern.charAt(0);
		if(firstChar == '?') {
			for(int j = 0; j < 10; j++) {
				dp[0][j] = 1;
			}
		}else {
			dp[0][Integer.parseInt(String.valueOf(firstChar))] = 1;
		}
		
		for(int i = 1; i < pattern.length(); i++) {
			char nowChar = pattern.charAt(i);
			if(nowChar == '?') {
				for(int k = 0; k < 13; k++) {
					int numOfSameMod = dp[i - 1][k];
					for(int j = 0; j < 10; j++) {
						int modValue = (k * 10 + j) % 13;
						dp[i][modValue] = calcMod(dp[i][modValue] + numOfSameMod);
					}
				}
			}else {
				int nowDigit = Integer.parseInt(String.valueOf(nowChar));
				for(int k = 0; k < 13; k++) {
					int numOfSameMod = dp[i - 1][k];
					int modValue = (k * 10 + nowDigit)%13;
					dp[i][modValue] = calcMod(dp[i][modValue]+ numOfSameMod);
				}
			}
		}
		
		System.out.println(dp[pattern.length() - 1][5]);
	}
	
	int calcMod(int value) {
		return value%mod;
	}
}
