import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      
      // 算出
      int K = 1;
      int deg = X;
      while(deg % 360 != 0){
        deg += X;
        K++;
      }
      
      // 出力
      System.out.println(K);
    }

}