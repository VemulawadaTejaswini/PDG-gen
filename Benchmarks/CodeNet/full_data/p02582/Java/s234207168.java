import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    var s = sc.next();
    var answer = 0;
    for (String w : s.split("S")) {
      answer = Math.max(answer, w.length());
    }
    System.out.println(answer);
  }
}
