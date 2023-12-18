import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    int n = sc.nextInt();
    String s = sc.next();

    s = s.replace("R", "");
    if(s.length()<n-s.length()){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

    // 出力
    // System.out.println(Math.min(count[0],count[1]) *2);
  }
}