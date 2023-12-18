import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    int answer = 0;
    if(x == 1 && y == 1) {
      answer = 600000 + 400000;
    } else {
      if(x <= 3) {
        answer += (4 - x) * 100000;
      }
      if(y <= 3) {
        answer += (4 - x) * 100000;
      }
    }
    System.out.println(answer);
  }
}
