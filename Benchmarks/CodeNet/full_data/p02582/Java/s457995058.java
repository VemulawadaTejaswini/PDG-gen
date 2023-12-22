import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    var s = sc.next();
    var weather = s.split("");
    var answer = 0;
    for (String w : weather) {
      if ("S".equals(w)) {
        break;
      }
      answer++;
    }
    System.out.println(answer);
  }
}
