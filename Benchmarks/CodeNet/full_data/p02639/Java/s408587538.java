import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int[] x = new int[5];
      
      for(int i = 0; i < 5; i++){
        x[i] = sc.nextInt();
      }
      
      // 判定
      int result = 0;
      for(int i = 0; i < 5; i++){
        if(x[i] == 0){
          result = i+1;
        }
      }
      
      // 出力
      System.out.println(result);
    }

}