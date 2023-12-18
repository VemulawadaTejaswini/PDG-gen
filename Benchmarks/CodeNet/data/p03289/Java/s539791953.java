import java.util.*;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    if(!S.substring(0, 1).equals("A")){
      System.out.println("WA");
    } else if(!S.substring(2, S.length()-1).contains("C")) {
      System.out.println("WA");
    } else  {
      String newS = S.substring(1, S.length()).replaceFirst("C", "c");
      if(!newS.equals(S.substring(1, S.length()).toLowerCase())) {
        System.out.println("WA");
      } else {
        System.out.println("AC");
      }
    } 
  }
}