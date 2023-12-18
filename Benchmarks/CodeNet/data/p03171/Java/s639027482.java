import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


	static int MAXN= 3005;

	static long dp[][];
	static long as [];
	static long min(long a, long b) {
		return Math.min(a, b);
	}
	static long max(long a, long b) {
		return Math.max(a, b);
	}
	static long calc(int inicio, int fin, int p){
	    if(dp[inicio][fin]!=-1){
	        return dp[inicio][fin];
	    }
	    if(p==0){
	        return dp[inicio][fin]=max(as[inicio]+calc(inicio+1,fin,1),as[fin]+calc(inicio,fin-1,1));
	    }
	    return dp[inicio][fin]=min(calc(inicio+1,fin,0),calc(inicio,fin-1,0));
	}

	public static void main(String[] args) throws Exception{
	    int n;
	    long suma =0,X,rta;
	    dp = new long[MAXN][MAXN];
	    as  = new long [MAXN];
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    n = Integer.parseInt(bf.readLine());
	    String[] data = bf.readLine().split(" ");
	    for(int i =0; i<MAXN; i++){
	        for(int j =0; j<MAXN; j++){
	            dp[i][j]=-1;
	        }
	    }
	    for(int i=0; i<n; i++){
	        as[i] = Long.parseLong(data[i]);
	        suma+=as[i];
	        if(n%2==1){
	            dp[i][i]  = as[i];
	        }
	        else{
	            dp[i][i] = 0;
	        }
	    }
	    X = calc(0,n-1,0);
	    rta = 2*X-suma;
	    System.out.println(rta);
	}
	
}
