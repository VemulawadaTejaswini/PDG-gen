import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


	static int MAXN= 3005;

	static long dp[][][];
	static long as [];
	static long min(long a, long b) {
		return Math.min(a, b);
	}
	static long max(long a, long b) {
		return Math.max(a, b);
	}
	static long calc(int inicio, int fin, int p){
	    if(dp[inicio][fin][p]!=-1){
	        return dp[inicio][fin][p];
	    }
	    if(p==0){
	        return dp[inicio][fin][p]=max(as[inicio]+calc(inicio+1,fin,1),as[fin]+calc(inicio,fin-1,1));
	    }
	    return dp[inicio][fin][p]=min(calc(inicio+1,fin,0),calc(inicio,fin-1,0));
	}

	public static void main(String[] args) throws Exception{
	    int n;
	    long suma =0,X,rta;
	    dp = new long[MAXN][MAXN][2];
	    as  = new long [MAXN];
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    n = Integer.parseInt(bf.readLine());
	    String[] data = bf.readLine().split(" ");
	    for(int i =0; i<MAXN; i++){
	        for(int j =0; j<MAXN; j++){
	            dp[i][j][0] = dp[i][j][1]=-1;
	        }
	    }
	    for(int i=0; i<n; i++){
	        as[i] = Long.parseLong(data[i]);
	        suma+=as[i];
	        dp[i][i][0]  = as[i];
	        dp[i][i][1] = 0;
	    }
	    X = calc(0,n-1,0);
	    rta = 2*X-suma;
	    System.out.println(rta);
	}
	
}
