import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int h[]=new int[n];
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      h[i]=s.nextInt();
      for(int i=0;i<n;i++)
      a[i]=s.nextInt();

      long dp[]=new long[n];
      dp[0]=a[0];
      for(int i=1;i<n;i++){
          dp[i]=a[i];long temp=0;
          for(int j=i-1;j>=0;j--){
              if(h[j]<h[i]){
                 temp=Math.max(temp,dp[j]);
              }
          }
          dp[i]+=temp;
      }
      long max=0;
      for(int i=0;i<n;i++){
          if(dp[i]>max){
              max=dp[i];
          }
      }
System.out.println(max);
    }
}