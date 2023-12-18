import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int[] a=new int[M];
        for(int i=0;i<M;i++){
            a[i]=scan.nextInt();
            if(i!=0){
                if(a[i]-a[i-1]==1){
                    System.out.println(0);
                    return ;
                }
            }
        }
        long[] dp=new long[N+1];
        dp[0]=1;
        int j=0;
        for(int i=0;i<N;i++){
            if((i+1)!=a[j]){
                if(i==0) dp[i+1]=dp[i];
                else dp[i+1]=dp[i]+dp[i-1];

                if(j<M-1) j++;
            }
            else dp[i+1]=0;
        }
        System.out.println(dp[N]%1000000007);
    }
}