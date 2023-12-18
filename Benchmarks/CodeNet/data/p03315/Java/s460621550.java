import java.util.Scanner;

public class Main {
  public static void main {
     Scanner input = new Scanner(System.in);
  
     while (input.hasNext()) {
        String S = input.next();
        int ans = 0;
       
        for (int i = 0; i < S.length(); ++i) {
          if (S.charAt('-')) {
            --ans;
          else if (S.charAt('+')) {
            ++ans;
          }
        }
      }
  }
}