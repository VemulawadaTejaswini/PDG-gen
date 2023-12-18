import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//length of the bar
        int M = sc.nextInt();
        int[] X = new int[M];
        for(int m=0;m<M;m++)X[m]=sc.nextInt();
        boolean[] star= new boolean[N+1];
        for(int n=0;n<=N;n++)star[n]=false;
        for(int m=0;m<M;m++)star[X[m]]=true;
        long mod = 1000000007;
        long[] DP = new long[N+1];//DP[L]:the total score on length L of the bar
        for(int n=0;n<=N;n++){
        	if(!star[n]){
        		DP[n]=n*n;
        		for(int i=1;i<n;i++){
        			if(!star[i]) DP[n] = (DP[n]+DP[i]*(n-i)*(n-i))%mod;
        		}
        	}else DP[n]=0;
        }
        
        System.out.println(DP[N]);
    }
}