import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = "";
    for(int i = 0; i < S.length(); i+=2){
      T = T+String.valueOf(S.charAt(i));
    }
    System.out.println(T);
  }
}