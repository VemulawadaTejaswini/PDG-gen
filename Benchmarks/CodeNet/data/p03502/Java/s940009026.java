import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n%sumDigits(n)!=0){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
  }
    public static int sumDigits(int n) {
      int sum = 0;
  //自然数の各桁の和を計算
      while (n != 0) {
  //sumDigitsは単独ではloopしないので、while loopを使う。
          sum += n % 10;
  //再右端の桁を得るために%10を利用する。
          n /= 10;
  //再右端の桁を取り除くためにn/=10を利用する。
      }
      return sum;//合計を返す
  }
}
