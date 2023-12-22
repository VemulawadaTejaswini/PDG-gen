import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String T = sc.next();
      
      // ?の置換
      String[] arr = T.split("");
      int len = T.length();
      StringBuilder sb = new StringBuilder("");
      
      for(int i = 0; i < len; i++){
        if(arr[i].equals("?")){
          sb.append("D");
        }else{
          sb.append(arr[i]);
        }
      }
      
      // 出力
      System.out.println(sb);
    }
    

}