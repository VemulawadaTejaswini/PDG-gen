import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String str = stdin.next();
    int q = stdin.nextInt();

    for (int i = 0; i < q; i++) {
      String cmd = stdin.next();
      int a = stdin.nextInt();
      int b = stdin.nextInt();
      if (cmd.equals("print")) {
        System.out.println(str.substring(a, b + 1));
        continue;
      }

      char[] rep;
      if (cmd.equals("replace")) {
        rep = stdin.next().toCharArray();
      } else {
        StringBuilder sb = new StringBuilder(str.substring(a, b + 1));
        rep = sb.reverse().toString().toCharArray();
      }

      char[] chars = str.toCharArray();
      for (int j = 0; a <= b; a++, j++) {
        chars[a] = rep[j];
      }
      str = String.valueOf(chars);
    }
  }

}