import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int count = 0;
    int a_count = 0;
    boolean forb = false;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == 'A') {
        a_count++;
        forb = false;
      } else if (c == 'B') {
        if (forb) {
          a_count = 0;
          forb = true;
        } else {
          forb = true;
        }
      } else if (c == 'C' && forb) {
        count += a_count;
        forb = false;
      } else if (c == 'C' && !forb) {
        a_count = 0;
        forb = false;
      }
    }
    System.out.println(count);
  }
}