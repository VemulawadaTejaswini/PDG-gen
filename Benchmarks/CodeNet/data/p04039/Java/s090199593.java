import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        Long[] dp = new Long[W];

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(i>=H-A && j<=B-1) {
                    dp[j]=0L;
                }else if(i==0 || j==0){
                    dp[j]=1L;
                }else{
                    dp[j]=(dp[j]+dp[j-1])%1000000007L;
                }
            }
        }

        System.out.println(dp[W-1]%1000000007L);

    }
}