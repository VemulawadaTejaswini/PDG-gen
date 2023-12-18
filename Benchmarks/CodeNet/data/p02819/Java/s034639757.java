import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    // 準備
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int k;

    // パクPGは3からなので2が入力パターンのやつをカバー
    if( x == 2) {
      System.out.println(2);
      System.exit(0);
    }

    // 素数を求めるPGをパクってくる
    // グルグルは最大で1,395,441の為十分耐えられる
    for(int i=3;i<=1_000_000;i+=2)
    {
      k=0;
      for(int j=3;j<=Math.sqrt(i);j+=2)
      {
        if(i%j==0)
        {
          k=1; break;
        }
      }

      if( k==0 && i >= x ) {
        System.out.println(i); break;
      }
    }
  }
}