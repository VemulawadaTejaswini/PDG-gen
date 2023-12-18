import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long A = sc.nextLong();
      long B = sc.nextLong();
      long N = sc.nextLong();
      
      // 計算
      long x = B;
      long max = 0;
      while(x <= N){
        long f1 = (A * x) / B;
        long f2 = x / B;
        long f = f1 - f2;
        if(max < f){
          max = f;
        }
        x += B;
      }

      long f1 = (A * N) / B;
      long f2 = N / B;
      long f = f1 - f2;
      if(max < f){
        max = f;
      }
      
      // 出力
      System.out.println(max);
    }
    
}