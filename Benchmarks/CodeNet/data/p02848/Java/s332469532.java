package abc146;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    char[] s = scanner.next()
        .toCharArray();

    for (int i = 0; i < s.length; i++) {
      s[i] += n;
      if(s[i] > 'Z') {
        s[i] = (char) ('A' + s[i] - 'Z' - 1);
      }
    }
    System.out.println(String.valueOf(s));
  }


}
