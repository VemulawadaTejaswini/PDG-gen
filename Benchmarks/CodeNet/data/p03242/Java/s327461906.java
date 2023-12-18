import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char c[] = str.toCharArray();

    for (int i = 0 ; i < 3 ; i++ ) {
      if (c[i]=='1') {
        c[i] = '9' ;
      } else
      if (c[i] == '9') {
        c[i] = '1' ;
      }
    }
    for (int i = 0 ; i < 3 ; i++ ) {
      System.out.print(c[i]);
    }



  }
}
