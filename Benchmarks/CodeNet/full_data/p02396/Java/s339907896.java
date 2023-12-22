import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number;
    for(i = 1; ; i++) {
      number = Integer.parseInt(sc.next());
      if(number == 0) break;
      System.out.println("Case " + i + ": " + number);
    }
  }
}
