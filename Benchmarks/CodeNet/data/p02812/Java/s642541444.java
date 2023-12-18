import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt() -3;
    String str = sc.next();

    count = count -3;

    int out = 0;

    for (int i = 0; i < count; i++) {
      if ('A' == str.charAt(i)) {
        if ('B' == str.charAt(i + 1)) {
          if ('C' == str.charAt(i + 2)) {
            out++;
          }
        }
      }
    }
    System.out.println(out);
  }
}
