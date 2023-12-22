/*
最初からの変更点として
	forループ内での判定を少なくした
    maxの比較を順次行うのではなく、二つの塊に分けて比較することで回数を減らした
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // height
        int r = sc.nextInt();

        // width
        int c = sc.nextInt();
      
      	//number of items
      	int k = sc.nextInt();
      

        // マス目の状態
        long [][] masu = new long[r+1][c+1];
      
      	long [][][] dp=new long[r+1][c+1][4];//動的計画法&行を跨がない場合は3つ目の要素を足す

      	
      

      
        // 入力を受け取る
      	for(int i=0;i<r+1;i++){
          for(int j=0;j<c+1;j++){
            masu[i][j]=0;
            for(int l=0;l<=3;l++){
              dp[i][j][l]=0;
            }
          }
        }
      	
      	
      
      	for(int i=0;i<k;i++){
          int inputR=sc.nextInt();
          int inputC=sc.nextInt();
          long inputK=sc.nextLong();
          masu[inputR][inputC]=inputK;
        }
      
      
      
      
      	for(int i=2;i<=r+c;i++){
          int str=Math.max(1,i-r);
          int fin=Math.min(i-1,c);
          for(int j=str;j<=fin;j++){
              /*
              拾ったかずが1~3になる時
              　つまり既に拾った行で横移動
              　　or
              　行の移動かつ拾う時
              */
            for(int l=1;l<=3;l++){
              dp[i-j][j][l]=
                  Math.max(dp[i-j][j-1][l-1]+masu[i-j][j],dp[i-j][j-1][l]);
            }
              
            long a=
              Math.max(
              	Math.max(dp[i-j-1][j][0],dp[i-j-1][j][1]),
              	Math.max(dp[i-j-1][j][2],dp[i-j-1][j][3]));
            
            if(dp[i-j][j][1]<=a+masu[i-j][j]){
                  dp[i-j][j][1]=a+masu[i-j][j];
            }
              
              
              
              /*
              拾った数が0になる時
              　つまり拾ってない状態で横移動
              　　or 
                行の移動かつ拾わない時
              */
            dp[i-j][j][0]=dp[i-j][j-1][0];
            long b=
              Math.max(
              	Math.max(dp[i-j-1][j][0],dp[i-j-1][j][1]),
              	Math.max(dp[i-j-1][j][2],dp[i-j-1][j][3]));
            
            if(dp[i-j][j][0]<=b){
                  dp[i-j][j][0]=b;
            }
          
              
          }
        }
    
      long result=0;
      for(int i=0;i<=3;i++){
        if(dp[r][c][i]>=result){
          result=dp[r][c][i];
        }
      }
      System.out.println (result);
    }
}
      
      
      
    








