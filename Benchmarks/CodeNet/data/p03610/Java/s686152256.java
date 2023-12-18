import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    String answer = "";
    int count = 0;
    for (int i = 0; i < s.length; i++) {
      if (i % 2 == 0) {
        answer += s[i];
      }
    }
    System.out.println(answer);
  }
}