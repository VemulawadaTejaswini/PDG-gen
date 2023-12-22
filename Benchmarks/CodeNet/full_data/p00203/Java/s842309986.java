import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){

	    int w = sc.nextInt();
	    int h = sc.nextInt();
	    if(w==0 && h==0) break;

	    int[][] map = new int[h][w];
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    map[i][j] = sc.nextInt();
		}
	    }

	    int[][] dp = new int[h][w];
	    for(int i=0; i<w; i++){
		if(map[0][i]==0) dp[0][i] = 1;
	    }

	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    if(map[i][j]==0){
			int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
			if(i-1>=0 && map[i-1][j]==0) n1 = dp[i-1][j];
			if(i-1>=0 && j-1>=0 && map[i-1][j-1]==0) n2 = dp[i-1][j-1];
			if(i-1>=0 && j+1<w && map[i-1][j+1]==0) n3 = dp[i-1][j+1];
			if(i-2>=0 && map[i-2][j]==2) n4 = dp[i-2][j];
			dp[i][j] += n1 + n2 + n3 + n4;
		    }else if(map[i][j]==2){
			int n1 = 0, n2 = 0;
			if(i-1>=0 && map[i-1][j]==0) n1 = dp[i-1][j];
			if(i-2>=0 && map[i-2][j]==2) n2 = dp[i-2][j];
			dp[i][j] = n1 + n2;
		    }
		}
	    }

	    int ans = 0;
	    for(int i=0; i<w; i++){
		if(map[h-1][i]!=1) ans += dp[h-1][i];
		if(h-2>=0 && map[h-2][i]==2) ans += dp[h-2][i];
	    }

	    System.out.println(ans);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}