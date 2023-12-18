import java.util.*;

class Main{
    static int[][] dp;
    static char[] c;
    static int n;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=sc.next().toCharArray();
        sc.close();
        dp=new int[n+1][n+1];
        ArrayList<Integer> same[]=new ArrayList[n];
        for(int i=n-1;i>=1;i--){
            same[i]=new ArrayList<>(n);
            for(int j=i-1;j>=0;j--){
                if(c[i]==c[j]) same[i].add(j);
            }
        }
        int max=0;
        for(int j=n-1;j>=1;j--) for(int i:same[j]) max=Math.max(max, dp(i, j));
        System.out.println(max);
    }
    static int dp(int i, int j){
        if(c[i]==c[j]){
            if(i+dp[i+1][j+1]<j) dp[i][j]=dp[i+1][j+1]+1;
            else dp[i][j]=dp[i+1][j+1];
        }
        return dp[i][j];
    }
}
