
import java.util.*;

public class Main {
  private static List<String> solve(int n, int a, int b, char[] cs) {
    List<String> answers = new ArrayList<>();
    int total = 0;
    int international = 0;
    for (char c : cs) {
      switch (c) {
        case 'a':
          if (total < a + b) {
            answers.add("Yes");
            total++;
          } else {
            answers.add("No");
          }
          break;
        case 'b':
          if (total < a + b && international < b) {
            answers.add("Yes");
            total++;
            international++;
          } else {
            answers.add("No");
          }
          break;
        default:
          answers.add("No");
          break;
      }
    }
    return answers;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    char[] cs = s.next().toCharArray();
    for (String answer : solve(n, a, b, cs)) {
      System.err.println(answer);
    }
  }
}
