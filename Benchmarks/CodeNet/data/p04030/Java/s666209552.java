import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String answer = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        answer += "0";
      } else if (s.charAt(i) == '1') {
        answer += "1";
      } else if (s.charAt(i) == 'B' && answer.length() > 0) {
        answer = answer.substring(0, answer.length() - 1);
      }
    }
    System.out.println(answer);
  }
}