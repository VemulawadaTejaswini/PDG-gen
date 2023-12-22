
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		int N = s.length();
		int M = 2019;
		int[][] DP = new int[N][N+1];
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				DP[i][j+1] = (DP[i][j]*10+Character.getNumericValue(s.charAt(j)))%M;
				if (DP[i][j+1] == 0)
					ans++;
					
			}
		}
		
		
        System.out.println(ans);
        

	}
		
	
}


