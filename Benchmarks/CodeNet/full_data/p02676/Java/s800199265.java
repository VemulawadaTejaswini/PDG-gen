import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String S = sc.next();
    StringBuilder SS = new StringBuilder(S);
    if (S.length() > K) {
      SS = SS.replace(K,S.length(),"...");
    } 
    System.out.println(SS);
  }
}