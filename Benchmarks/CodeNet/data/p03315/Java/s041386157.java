import java.util.*;

public class main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int ans = 0;
      for(int i = 0; i < 4; i++) {
          char next = s.charAt(i);
          if(String.valueOf(next).equal("+")) {
               i++;
          } else if(String.valueOf(next).equal("-")) {
               i--;
         }
      }
      System.out.println(ans);
  }
}
