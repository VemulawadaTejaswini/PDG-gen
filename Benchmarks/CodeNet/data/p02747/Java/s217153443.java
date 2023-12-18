import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      
      // 判定
      String result;
      if(S.equals("hi") || S.equals("hihi") || S.equals("hihihi") || S.equals("hihihihi") || S.equals("hihihihihi")){
        result = "Yes";
      }else{
        result = "No";
      }
      
      // 出力
      System.out.println(result);
    }

}