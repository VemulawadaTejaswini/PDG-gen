import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      
      // 計算
      int result = a + a*a + a*a*a;
      
      // 出力
      System.out.println(result);
    }
    

}