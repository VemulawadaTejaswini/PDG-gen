import java.util.Scanner;
import java.util.TreeSet;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean dp[][]=new boolean[25][2500];
        for(int i=0;i<25;i++){
            for(int j=0;j<2005;j++){
                dp[i][j]=false;
            }
        }
        dp[0][0]=true;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<2500;j++){
                if(j-a[i]>=0)dp[i+1][j]=dp[i][j-a[i]]||dp[i][j];
                else dp[i+1][j]=dp[i][j];
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            if(dp[n][x])System.out.println("yes");
            else System.out.println("no");
        }
    }
}

