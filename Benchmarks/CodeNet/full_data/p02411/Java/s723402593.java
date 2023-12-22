import java.util.*;

class Main {
  public static void main(String args[]) {
    // (??????????¨?) (??????????¨?) (???????¨?)
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String gradeString = scanner.nextLine();
      if (gradeString.equals("-1 -1 -1")) {
        break;
      }
      String[] gradeStrArr = gradeString.split(" ");
      int[] gradeIntArr = new int[3];
      for (int i = 0; i < 3; i++) {
        gradeIntArr[i] = Integer.parseInt(gradeStrArr[i]);
      }
      System.out.println(judge(gradeIntArr));
    }
  }
  static String judge(int[] scores) {
    String ans = "";
    int sum = scores[0] + scores[1];
    if (scores[0] == -1 || scores[1] == -1) {
      ans = "F";
    } else if (sum >= 80) {
      ans = "A";
    } else if (sum >= 65) {
      ans = "B";
    } else if (sum >= 50) {
      ans = "C";
    } else if (sum >= 30 && scores[2] >= 50) {
      ans = "C";
    } else if (sum >= 30) {
      ans = "D";
    } else if (sum < 30) {
      ans = "F";
    }
    return ans;
  }
}