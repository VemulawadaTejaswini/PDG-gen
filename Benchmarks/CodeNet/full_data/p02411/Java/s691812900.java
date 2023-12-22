import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int m, f, r;
      while (true) {
        m = scanner.nextInt();
        f = scanner.nextInt();
        r = scanner.nextInt();
        if (m == -1 && f == -1 && r == -1) {
          return;
        }
        System.out.println(new Score(m, f, r).score());
      }
    }
  }
}

class Score {
  private final int midtermExam;
  private final int finalExam;
  private final int reExam;


  Score(int midtermExam, int finalExam, int reExam) {
    this.midtermExam = midtermExam;
    this.finalExam = finalExam;
    this.reExam = reExam;
  }

  private int sumExamScore() {
    return midtermExam + finalExam;
  }

  String score() {
    if (midtermExam == -1 || finalExam == -1) {
      return "F";
    }
    if (sumExamScore() >= 80) {
      return "A";
    }
    if (sumExamScore() >= 65) {
      return "B";
    }
    if (sumExamScore() >= 50) {
      return "C";
    }
    if (sumExamScore() >= 30) {
      if (reExam >= 50) {
        return "C";
      } else {
        return "D";
      }
    }
    return "F";
  }
}