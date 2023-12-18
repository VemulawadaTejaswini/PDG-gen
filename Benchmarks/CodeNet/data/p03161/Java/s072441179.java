import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int h[] = new int[n+k-1];
    int dp[] = new int[n+k-1];
    h[0]=sc.nextInt();
    for(int i=1;i<k;i++){
      h[i]=h[0];
    }
    for(int i=k;i<n+k-1;i++){
      h[i]=sc.nextInt();
    }
    for(int i=0;i<k;i++){
      dp[i]=0;
    }
    for(int i=k;i<n+k-1;i++){
      int tmp=1000000000;
      for(int j=1;j<=k;j++){
         tmp = Math.min(tmp,dp[i-j]+Math.abs(h[i]-h[i-j])); 
//        System.out.println(tmp);
      }
      dp[i]=tmp;
    }  

    System.out.println(dp[n+k-2]);
  }

  

  
}