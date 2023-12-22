import java.util.*;

class Main{

    int INF = Integer.MAX_VALUE;

    String solve(){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int m = sc.nextInt();

	int[][] dp = new int[n][n];
	for(int i=0; i<n; i++) Arrays.fill(dp[i], INF);

	for(int i=0; i<m; i++){
	    int a = sc.nextInt()-1, b = sc.nextInt()-1;
	    for(int j=a; j<=b; j++){
		for(int k=j; k<=b; k++){
		    dp[j][k] = 1;
		}
	    }
	}

	for(int i=0; i<n; i++){
	    if(dp[i][i]==INF) return "Impossible";
	}

	for(int i=1; i<n; i++){//wide
	    for(int j=0; j+i<n; j++){//start
		for(int l=j; l<=j+i; l++){//separate
		    if(dp[j][l]==INF || dp[l][j+i]==INF) continue;
		    dp[j][j+i] = Math.min(dp[j][j+i], dp[j][l] + dp[l][j+i]);
		}
	    }
	}

	return Integer.toString(dp[0][n-1]);
    }

    public static void main(String[] args){
	System.out.println(new Main().solve());
    }
}