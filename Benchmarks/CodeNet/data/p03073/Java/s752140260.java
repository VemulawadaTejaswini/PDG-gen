import java.util.Scanner;

public class Main {
  final static char BLACK = '0';
  final static char WHITE = '1';
 
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();

      int whenEvenBlack = 0;
      for (int i = 0; i < S.length(); ++i) {
        if (i % 2 == 0) {
          if (S.charAt(i) != BLACK) {
            ++whenEvenBlack;
          }
        }

        if (i % 2 == 1) {
          if (S.charAt(i) != WHITE) {
            ++whenEvenBlack;
          }
        }
      }
      
      int whenOddBlack = 0;
      for (int i = 0; i < S.length(); ++i) {
        if (i % 2 == 1) {
          if (S.charAt(i) != BLACK) {
            ++whenOddBlack;
          }
        }

        if (i % 2 == 0) {
          if (S.charAt(i) != WHITE) {
            ++whenOddBlack;
          }
        }
      }

      System.out.println(Math.min(whenEvenBlack, whenOddBlack));
    }
  }
}