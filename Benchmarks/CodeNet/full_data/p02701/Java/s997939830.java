import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String priseStr = "";
      int kind = 0;

      // ガチャ
      for(int i = 0; i < N; i++){
        String prise = "/";
        prise += sc.next();
        prise += "/";
        if(!priseStr.matches(".*" + prise + ".*")){
          priseStr += prise;
          kind++;
        }
        //System.out.println(priseStr);
      }
      

      // 出力
      System.out.println(kind);
    }
    
}