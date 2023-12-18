import java.io.*;
import java.util.*;

class AtCoer{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = in.nextInt();

    int dp[] = new int[n];
    dp[0] = 0;
    dp[1] = Math.abs(a[0]-a[1]);

    for(int i=2;i<n;i++){
      dp[i] = Math.min(Math.abs(a[i-2]-a[i]) + dp[i-2], Math.abs(a[i-1]-a[i]) + dp[i-1]);
    }

    System.out.println(dp[n-1]);
  }
}