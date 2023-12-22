import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String str = reader.next();
    int n = reader.nextInt();
    for (int i = 0; i < n; i++) {
      String command = reader.next();
      int a = reader.nextInt();
      int b = reader.nextInt();

      if (command.equals("print")) {
        String tempStr = str.substring(a, b + 1);
        System.out.println(tempStr);
      }
      else if (command.equals("reverse")) {
        char[] tempStr = str.toCharArray();
        for (int j = 0; j < (b - a + 1) / 2; j++) {
          char c = tempStr[a + j];
          tempStr[a + j] = tempStr[b - j];
          tempStr[b - j] = c;
        }
        str = String.valueOf(tempStr);
      }
      else if (command.equals("replace")) {
        char[] p = reader.next().toCharArray();
        char[] tempStr = str.toCharArray();
        for (int j = a; j <= b; j++) {
          tempStr[j] = p[j - a];
        }
        str = String.valueOf(tempStr);
      }
    }
  }
}