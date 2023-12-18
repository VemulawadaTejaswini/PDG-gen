import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      // 計算
      Long sum = 0L;
      for(int i = 1; i <= N; i++){
        if(i % 5 != 0 && i % 3 != 0){
          sum += i;
        }
      }
      
      // 出力
      System.out.println(sum);
    }

}