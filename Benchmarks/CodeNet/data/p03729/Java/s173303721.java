import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    
    boolean ans = 
      A.charAt(A.length()-1) == B.charAt(0)
      && B.charAt(B.length()-1) == C.charAt(0);
    
    System.out.println(ans ? "YES" : "NO");
  }
}