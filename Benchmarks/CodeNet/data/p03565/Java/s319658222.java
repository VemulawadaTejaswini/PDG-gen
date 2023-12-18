import java.util.Scanner;
 
public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Q = sc.next();
    String T = sc.next();
    boolean OK = false;
    int insertT =0, lenT = T.length(), lenQ = Q.length();
    for (int i = lenQ -lenT; i>=0; i--) {
      int count =0;
      for (int j = lenT - 1; j>=0; j--) {
        if (Q.charAt(i+j) == T.charAt(j) || Q.charAt(i+j) == '?' ) {
          count++;
        }
      }
      if (count == lenT) {
        OK = true;
        insertT = i;
        break;
      }
    }
    StringBuilder S = new StringBuilder(Q);
    S.replace(insertT,insertT + lenT , T);
    for (int i =0; i<Q.length(); i++) {
      if (S.charAt(i) == '?') {
        S.replace(i,i+1,"a");
      }
    }
    if (OK) {
      System.out.println(S);
    } else {
      System.out.println("UNRESTORABLE");
    }
  }
}