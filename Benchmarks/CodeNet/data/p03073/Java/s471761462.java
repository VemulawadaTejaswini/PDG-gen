import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String X;
    String Y;
    int c0 = 0;
    int c1 = 0;
    
    for(int i=0; i< S.length(); i++) {
      if(i%2 == 0) {
        X = "0";
        Y = "1";
      } else {
        X = "1";
        Y = "0";
      }
      if(!S.substring(i, i+1).equals(X)) {
        c0++;
      } else {
        c1++;
      }
    }
    if(c0<c1) {
      System.out.println(c0);
    } else {
      System.out.println(c1);
    }
  }
}