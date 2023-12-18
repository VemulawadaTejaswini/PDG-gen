import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S.length() == 3){
      S = new StringBuilder(S).reverse().toString();
    }
    System.out.println(S);
  }
}