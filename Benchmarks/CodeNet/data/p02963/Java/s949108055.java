import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long area, line;
    area = Long.parseLong(sc.next());
    if(area % 2 == 0) {
      line = area / 2;
      System.out.println("0 0 " + line + " 0 0 2");
    } else {
      line = (area + 1) / 2;
      System.out.println("0 0 " + line + " 1 1 2");
    }
  }
}
