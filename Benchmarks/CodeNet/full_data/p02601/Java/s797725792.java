import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int K = sc.nextInt();
      
      // 操作
      int ope = 0;
      String result = "";
      while(A >= B){
        B *= 2;
        ope++;
      }
      while(B >= C){
        C *= 2;
        ope++;
      }
      if(ope <= K){
        result = "Yes";
      }else{
        result = "No";
      }
      
      // 出力
      System.out.println(result);
    }

}