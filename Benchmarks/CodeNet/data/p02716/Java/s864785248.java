import java.util.*;

public class Main {
    public static long max(long a,long b){
        return (a>b)?a:b;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        long ans=0;
        
        if(N%2==0){
            long ans1=0L;
            long ans2=0L;
            
            for(int i=0;i<N;i++){
                if(i%2==0){
                    ans1+=A[i];
                }else{
                    ans2+=A[i];
                }
            }
            
            if(ans1<ans2){
                System.out.println(ans2);
                return;
            }else{
                System.out.println(ans1);
                return;
            }
        }
        
        long[][] dp=new long[2][N];//dp[0][i]はi番目を選んだとき、dp[1][i]はi番目を選ばないとき
        
        dp[0][0]=0;
        dp[1][0]=0;
        dp[0][1]=A[1];
        dp[1][1]=A[0];
        dp[0][2]=A[2];
        dp[1][2]=max(A[0],A[1]);
        
        for(int i=3;i<N;i++){
            if(i%2==0){
                dp[0][i]=max(dp[0][i-2]+A[i],dp[0][i-3]+A[i]);
                dp[1][i]=dp[0][i-1];
            }else{
                dp[0][i]=max(dp[1][i-1]+A[i],dp[0][i-2]+A[i]);
                dp[1][i]=max(dp[0][i-2],dp[0][i-1]);
            }
        }
        
        System.out.println(max(dp[0][N-1],dp[1][N-1]));
    }
}
