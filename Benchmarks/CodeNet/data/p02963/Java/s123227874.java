import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long area = Long.parseLong(sc.next());
    if(area % 2 == 0) {
      System.out.println("0 0 " + area / 2 + " 0 0 " + 2);
    } else {
      System.out.println("0 0 " + (area + 1) / 2 + " 1 1 " + 2);
    }
  }
}
