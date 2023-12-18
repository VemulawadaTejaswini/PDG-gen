import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int Z = sc.nextInt();
      
      // スワップ
      int A = Z;
      int B = X;
      int C = Y;
      
      // 出力
      System.out.println(A + " " + B + " " + C);
    }

}