import java.util.Scanner;

public class Main{
  public static void main(String[] s){
    Scanner sc = new Scanner;
    int K = sc.nextInt();
    String S = sc.next();
    String[] ary = S.split("");
    sc.close();
    String res = "";
    if (S.length >= K) {
      System.out.println(S);
    } else{
      for (int i = 0; i < K -1; i++){
        res = res + ary[i];
      }
      System.out.println(res);
    }
  }
}