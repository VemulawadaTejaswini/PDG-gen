import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        String s = sc.next();
        if (s.equals("snuke")) {
          char c = (char) (65 + j);
          String ans = "";
          ans += c;
          ans += i + 1;
          System.out.println(ans);
          return;
        }
      }
    }

  }
}