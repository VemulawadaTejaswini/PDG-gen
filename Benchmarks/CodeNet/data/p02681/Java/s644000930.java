import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    try {
      String s = stdIn.next();
      char[] preID = s.toCharArray();
      if (preID.length < 1 || preID.length > 10) return;
      String t = stdIn.next();
      char[] postID = t.toCharArray();
      if (postID.length < 1 || postID.length > 10) return;
      boolean judge = true;
      if (postID.length - preID.length != 1) judge = false;
      if (judge) {
        for (int cnt = 0; cnt < preID.length; cnt++) {
          if (preID[cnt] != postID[cnt]) {
            judge = false;
            break;
          }
        }
      }
      if (judge) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
  }
}