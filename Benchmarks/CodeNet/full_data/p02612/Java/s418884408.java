import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      // 計算
      int amari = N % 1000;
      int pay = 0;
      if(amari != 0){
        pay =  1000 - amari;
      }
      
      // 出力
      System.out.println(pay);
    }

}