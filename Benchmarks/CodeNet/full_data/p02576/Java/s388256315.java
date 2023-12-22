import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int X = sc.nextInt();
      int T = sc.nextInt();
      
      // 計算
      int total = 0;
      int count = 0;
      if(N % X == 0){
        count = N / X;
      }else{
        count = N / X + 1;
      }
      
      total = count * T;
      
      // 出力
      System.out.println(total);
    }

}