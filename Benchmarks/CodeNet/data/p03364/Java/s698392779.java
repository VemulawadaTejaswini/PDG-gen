import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			char [][] data = new char[n][n];
			for(int i = 0; i < n; i++){
				String str = sc.next();
				for(int j = 0; j < str.length();j++){
					data[i][j] = str.charAt(j);
				}
			}
			if(n == 1){
				System.out.println(1);
				continue;
			}
			
			boolean [][][] dp = new boolean[n][n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dp[i][j][0] = true;
				}
			}
			
			int sum = 0;
			for(int i = 1; i < n; i++){
				for(int j = 0; j< n; j++){
					for(int k = 0; k < n; k++){
						if(dp[j][k][i-1] == false) continue;
						dp[j][k][i] = dp[j][k][i-1] && dp[(j+1)%n][(k+1)%n][i-1] && data[j][(k+i)%n] == data[(j+i)%n][k];
						if(i == n-1 && dp[j][k][i]){
							sum ++;
						}
					}
				}
			}

			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
