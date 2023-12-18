import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 問題数
    int a = sc.nextInt();
    // 提出数
    int b = sc.nextInt();

    int wrong = 0;
    int correct = 0;
    int problemNum;
    int previousProblemNum = 1;
    String result;
    String previousResult = "";
    for (int i = 0; i < b; i++) {
      problemNum = sc.nextInt();
      result = sc.next();
      if (result.equals("WA")
          && !(previousResult.equals("AC") && previousProblemNum == problemNum)) {
        wrong++;
        continue;
      }
      if (result.equals("AC")
          && !(previousResult.equals("AC") && previousProblemNum == problemNum)) {
        correct++;
      }
      previousResult = result;
      previousProblemNum = problemNum;
    }
    System.out.println(correct + " " + wrong);
  }
}
