import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long X = sc.nextLong();
      
      // 預金額計算
      long prise = 100L;
      int year = 0;
      while(prise < X){
        long risi = prise / 100;
        prise += risi;
        year++;
      }
      
      // 出力
      System.out.println(year);
    }

}