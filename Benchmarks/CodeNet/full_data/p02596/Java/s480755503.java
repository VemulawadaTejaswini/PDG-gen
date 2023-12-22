import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      
      // 判定
      int count = 0;
      int amari = 0;
      int total = 0;
      boolean exist = false;
      while(!exist){
        count++;
        if(count == 1){
          amari = 7 % K;
          total = amari;
        }else{
          amari = (amari * 10) % K;
          total = (total + amari) % K;
        }
        //loggerInt("count",count);
        //loggerInt("amari",amari);
        //loggerInt("total",total);
        
        if(total == 0){
          exist = true;
        }
        
        if(count > K){
          break;
        }
      }
      
      if(!exist){
        count = -1;
      }
      
      // 出力
      System.out.println(count);
    }
    
    // Int型変数ロガー関数
    // String name : 変数名
    // int val : 値
    public static void loggerInt(String name, int val){
      System.out.println(name + " = " + val);
    }

}