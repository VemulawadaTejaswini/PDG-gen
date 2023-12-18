/*
  comparator(?)を使用するパターン
  サンプル3はlong型使わないと答えがintの最大値になってしまう。
  参考①
   site:雑草SEの備忘録
   page:JavaのComparatorを使って配列を並び替える
   --そのまま実装するとサンプル3が通せない
  参考②
   page:Java Collections - Comparator.comparingLong() Examples
*/

import java.util.*;
public class Main{
  public static void main(String[] args){
    Main r = new Main();
    r.run();
  }
  private void run() {
    //入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    //自前クラス(構造体？)を配列に格納する
    Drink[] dr = new Drink[n];
    for(int i=0; i<n; ++i)
      dr[i] = new Drink(sc.nextLong(), sc.nextInt());

    //なんか並び替えてくれる呪文
    Arrays.sort(dr, Comparator.comparingLong(Drink::geta));

    //M本まで数える
    int cnt=0;
    long ans=0;
    for(int i=0; i<n; ++i) {
      if(dr[i].getb()+cnt <= m) {
        cnt += dr[i].getb();
        ans += dr[i].geta() * dr[i].getb();
      }
      else {
        ans += dr[i].geta() * (m-cnt);
        break;
      }
    }
    System.out.println(ans);

  }
  //自前クラス(構造体？)
  private class Drink {
    private long a; //単価
    private int b;  //本数
    public Drink(long a, int b){
      this.a=a;
      this.b=b;
    }
    public long geta(){ return a;}
    public int getb(){ return b;}
  }
}
/*作業用

//試し出力用
for(int i=0; i<n; ++i)
  System.out.println(dr[i].geta() +" "+dr[i].getb());

*/
