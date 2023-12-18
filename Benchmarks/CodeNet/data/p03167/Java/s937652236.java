import java.util.*;

public class Main {

    public static void main(String[] args) {
		new Main().run();
    }

    void run() {
      Scanner sc = new Scanner(System.in);
      int H=sc.nextInt();
      int W=sc.nextInt();
      char[][] a=new char[H][W];
      for(int i=0;i<H;++i){
          a[i]=sc.next().toCharArray();
      }
      long[][] dp=new long[H+1][W+1];
      long mo=1_000_000_000+7;
      dp[0][0]=1;
      for(int sum=0;sum<=H+W-2;++sum){
          for(int i=0;i<=sum;++i){
          int j=sum-i;
          if(i>=H||j>=W)continue;
          if(a[i][j]=='#'){
              dp[i][j]=0;
              continue;
          }
            dp[i+1][j]=(dp[i+1][j]+dp[i][j])%mo;
            dp[i][j+1]=(dp[i][j+1]+dp[i][j])%mo;
          }
      }
      System.out.println(dp[H-1][W-1]);
    }

    void tr(Object...objects){
		System.out.println(Arrays.deepToString(objects));
    }
}
