import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int[][] a=new int[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        a[i][j]-=sc.nextInt();
      }
    }
    BitSet[][] dp=new BitSet[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        dp[i][j]=new BitSet(25600);
      }
    }
    //0->12800
    dp[0][0].set(12800+a[0][0]);
    dp[0][0].set(12800-a[0][0]);
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        for(int k=0;k<25600;k++){
          if(dp[i][j].get(k)){
            if(j<w-1){
              dp[i][j+1].set(k+a[i][j+1]);
              dp[i][j+1].set(k-a[i][j+1]);
            }
            if(i<h-1){
              dp[i+1][j].set(k+a[i+1][j]);
              dp[i+1][j].set(k-a[i+1][j]);
            }
          }
        }
      }
    }
    
    int ans=Integer.MAX_VALUE;
    for(int i=12800;i<25600;i++){
      if(dp[h-1][w-1].get(i)){
        ans=i-12800;
        break;
      }
    }
    for(int i=12800;i>=0;i--){
      if(dp[h-1][w-1].get(i)){
        ans=Math.min(12800-i,ans);
        break;
      }
    }
    
    System.out.println(ans);
  }
}