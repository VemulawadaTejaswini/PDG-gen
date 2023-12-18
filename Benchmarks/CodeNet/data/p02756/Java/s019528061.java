import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      int Q = sc.nextInt();
      
      // 文字列操作
      String result = S;
      
      for(int i = 0; i < Q; i++){
        // 操作Tを取得
        int T = sc.nextInt();
        
        if(T == 1){
          // 文字列反転
          result = reverse(result);
        }else if(T == 2){
          // 文字列追加
          // 操作F,文字Cを取得
          int F = sc.nextInt();
          String C = sc.next();
          
          if(F == 1){
            // 先頭追加
            result = appendFront(result, C);
          }else if(F == 2){
            // 末尾追加
            result = appendBack(result, C);
          }
        }
        
      }
      
      
      // 出力
      System.out.println(result);
    }
    
    // 文字列を反転する関数
    public static String reverse(String str){
      StringBuffer sb = new StringBuffer(str);
      return sb.reverse().toString();
    }
    
    // 文字列の先頭に文字を追加する関数
    public static String appendFront(String base, String add){
      return add + base;
    }
    
    // 文字列の末尾に文字を追加する関数
    public static String appendBack(String base, String add){
      return base + add;
    }
    

}