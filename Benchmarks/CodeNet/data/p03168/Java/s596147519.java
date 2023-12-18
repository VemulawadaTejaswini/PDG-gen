import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double[] a=new double[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextDouble();
    }
    double[][] dp = new double[n+2][n+2];
    dp[0][0] = 1-a[0];
    dp[0][1] = a[0];
    for(int i=0;i<n-1;i++){
      for(int j=0;j<=i+1;j++){
        dp[i+1][j]+=dp[i][j]*(1-a[i+1]);
        dp[i+1][j+1]+=dp[i][j]*a[i+1];
      }
    }
    double total=0;
    for(int i=n/2+1;i<=n;i++){
      total+=dp[n-1][i];
    }
    System.out.println(total);
  }
}