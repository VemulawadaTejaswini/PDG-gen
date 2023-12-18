import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 問題数
    int a = sc.nextInt();
    // 提出数
    int b = sc.nextInt();

    Map<Integer, Boolean> map = new HashMap<>();
    for (int i = 1; i <= a; i++) {
      map.put(i, false);
    }

    int wrong = 0;
    int correct = 0;
    int problemNum;
    String result;
    for (int i = 1; i <= b; i++) {
      problemNum = sc.nextInt();
      result = sc.next();
      if (result.equals("WA") && !map.get(problemNum)) {
        wrong++;
        continue;
      }
      if (result.equals("AC") && !map.get(problemNum)) {
        correct++;
        map.put(problemNum, true);
      }
    }
    System.out.println(correct + " " + wrong);
  }
}
