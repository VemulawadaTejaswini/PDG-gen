import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String sb = new String(s);

    int count = 0;

    while (!s.equals(sb)) {
      s.replaceFirst("BW", "WB");
      count++;
      sb = new String(s);
    }
    System.out.println(count);
  }

}
